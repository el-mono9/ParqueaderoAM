
package modelo;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class ConsultasPerfil extends Conexion{
    
    
    public boolean ingresar (Perfil p) throws IOException{
        
        PreparedStatement ps = null ;
        Connection con = getConexion();

        String sql = "INSERT INTO perfil(id, perfil, nombre, cedula, usuario, contrasena ) VALUES(?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt   (1,p.getId());
            ps.setString(2,p.getPerfil());
            ps.setString(3,p.getNombre());
            ps.setString(4,p.getCedula());
            ps.setString(5,p.getUsuario());
            ps.setString(6,p.getContraseña());
            ps.execute();
            return true;
        
        
    }catch(SQLException e){
    System.err.println(e + "problema en consultas Perfil");
    return false ;
    }
    finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasVehiculo.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("problema de insercion de datos en la tabla Perfil " + ex);
            }    
       }
}
    

    
    
}
