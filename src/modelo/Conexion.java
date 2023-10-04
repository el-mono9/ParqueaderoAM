
package modelo;

import java.sql.DriverManager ;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexion {
    
    private final String Base    = "parqueadero";
    private final String User    = "root";
    private final String Pasword = "";
    private final String Url     = "jdbc:mysql://localhost:3306/parqueadero";
    private final String Driver ="com.mysql.cj.jdbc.Driver";
    private Connection con = null ;
    
    public Connection getConexion() {
    
    try
    {
    Class.forName(Driver); //  driver 
    con = (Connection)DriverManager.getConnection(this.Url, this.User, this.Pasword); // enviar datos para realizar la conexion
    System.out.println("Conectado a la base de datos...");
    }
    
    catch(SQLException e)
    {
    JOptionPane.showMessageDialog(null,"no se pudo conectar a la base de datos modelo-Conexion");
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
    
   
    
    
}
