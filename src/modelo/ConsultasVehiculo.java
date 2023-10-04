/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class ConsultasVehiculo extends Conexion{
    
    
    //El siguiente metodo inserta parametros en la tabla vehiculos
    public boolean ingresar (Vehiculo vehi) throws IOException{
        
        PreparedStatement ps = null ;
        Connection con = getConexion();

        String sql = "INSERT INTO vehiculos(id, placa, modelo, tipo, ingreso, salida, precio ) VALUES(?,?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt   (1,vehi.getId());
            ps.setString(2,vehi.getPlaca());
            ps.setString(3,vehi.getModelo());
            ps.setString(4,vehi.getTipo());
            ps.setString(5,vehi.getIngreso());
            ps.setString(6,vehi.getSalida());
            ps.setFloat (7,vehi.getPrecio());
            ps.execute();
            return true;
        
        
    }catch(SQLException e){
    System.err.println(e + "problema en consultas");
    return false ;
    }
    finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasVehiculo.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("problema de insercion de datos en la tabla Vehiculos " + ex);
            }    
       }
}
    
    //El siguiente metodo modifica parametros en la tabla vehiculos
    public boolean modificar (Vehiculo vehi) throws IOException{
        
        PreparedStatement ps = null ;
        Connection con = getConexion();

        String sql = "UPDATE vehiculos SET id =?, placa=?, modelo=?, tipo=?, ingreso=?, salida=?, precio=? WHERE placa=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt   (1,vehi.getId());
            ps.setString(2,vehi.getPlaca());
            ps.setString(3,vehi.getModelo());
            ps.setString(4,vehi.getTipo());
            ps.setString(5,vehi.getIngreso());
            ps.setString(6,vehi.getSalida());
            ps.setFloat (7,vehi.getPrecio());
            ps.execute();
            return true;
        
        
    }catch(SQLException e){
    System.err.println(e);
    return false ;
    }
    finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasVehiculo.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("problema de insercion de datos en la tabla Vehiculos " + ex);
            }    
       }
}
    
    //El sguiente metodo modifica fecha de salida 
    public boolean modSalida (Vehiculo vehi) throws IOException{
        PreparedStatement ps = null ;
        Connection con = getConexion();

        String sql = "UPDATE vehiculos SET salida=?, precio=? WHERE placa=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,vehi.getSalida());
            ps.setString(3,vehi.getPlaca());
            ps.setFloat(2,vehi.getPrecio());
            ps.execute();
            return true;
        
        
    }catch(SQLException e){
    System.err.println(e);
    return false ;
    }
    finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasVehiculo.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("problema de insercion de datos en la tabla Vehiculos " + ex);
            }    
       }
    }
    
    //El siguiente metodo elimina todos los datos de una fila en la tabla vehiculos
    public boolean eliminar (Vehiculo vehi) throws IOException{
        
        PreparedStatement ps = null ;
        Connection con = getConexion();
        String sql = "DELETE FROM vehiculos WHERE placa=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,vehi.getPlaca());
            ps.execute();
            return true;
        
        
    }catch(SQLException e){
    System.err.println(e);
    return false ;
    }
    finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasVehiculo.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("problema de insercion de datos en la tabla Vehiculos " + ex);
            }    
       }
}
    
     //El siguiente metodo busca los datos de una fila en la tabla vehiculos
    public boolean buscar (Vehiculo vehi) throws IOException{
        
        PreparedStatement ps = null ;
        Connection con = getConexion();
        ResultSet rs = null ;
        String sql = "SELECT * FROM vehiculos WHERE placa=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,vehi.getPlaca());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
            vehi.setId(rs.getInt("id"));
            vehi.setPlaca(rs.getString("placa"));
            vehi.setModelo(rs.getString("modelo"));
            vehi.setTipo(rs.getString("tipo"));
            vehi.setIngreso(rs.getString("ingreso"));
            vehi.setSalida(rs.getString("salida"));
            vehi.setPrecio(rs.getFloat("precio"));
            
            return true;
            }
            else{
                return false;
            }
            
        
        
    }catch(SQLException e){
    System.err.println(e);
    return false ;
    }
    finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasVehiculo.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("problema de insercion de datos en la tabla Vehiculos " + ex);
            }    
       }
}
    
    public int contarFilas(String tabla) throws SQLException{
        
        ResultSet rs ;
        PreparedStatement ps = null ;
        Connection con = getConexion();
        String sql = "SELECT COUNT(*) AS total FROM " + tabla;
        
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
            

        if (rs.next()) {
            return rs.getInt("total");
        } else {
            return 0;
        }
        
    }
}


