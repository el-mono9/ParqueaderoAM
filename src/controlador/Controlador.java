
package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ConsultasVehiculo;
import modelo.Vehiculo;
import vista.FormularioVehiculos;
import vista.PanelIngresoV;

public class Controlador {
    
    
    private ConsultasVehiculo modC = new ConsultasVehiculo();
    private Vehiculo mod = new Vehiculo();
    
    
    public String ejecucionGuardar(String placa,String modelo,String tipo) throws SQLException{     // si fue Guardar entonces ejecuto lo que tengo dentro del if 
            
             // el usuario presiono el boton ingresar
             // ingreso al modelo lo que tengo en las cajas de texto
             // llamo el metodo guardar para hacer la insercion a la base de datos 
            //obtengo los datos de la caja de texto y los guardo en los atributos del modelo
            
            //************************************
            String fecha = obtenerFecha();
            
            mod.setId(modC.contarFilas("vehiculos") + 1); // obtengo el numero de filas y le sumo 1  
            mod.setModelo(modelo);
            mod.setPlaca(placa);
            mod.setTipo(tipo);
            mod.setIngreso(fecha);
            mod.setSalida(null);

            try {
                if ( !(modC.ingresar(mod)) ){ //
                   JOptionPane.showMessageDialog(null, "no se pudo guardar correctamente");
                }
                
            } catch (IOException ex) {
                System.err.println(ex);
                
            }
            
            return fecha;
            
        }
    
    public void ejecucionModificar (){
        
    }
    
    public boolean ejecucionModificarSalida(String placa, String salida, String entrada, String tipo) throws IOException, ParseException{
       
        
        float comodin = TotalCobrar(entrada, salida, tipo);
        mod.setPlaca(placa);
        mod.setSalida(salida);
        mod.setPrecio(comodin);
        
        if(modC.modSalida(mod)){
            System.out.print("se pudo guardar");
            
            return true ;
            
        }
        else{
            
            System.out.println("no se pudo guardar");
            return false ;
            
        }
    }
    
    public Vehiculo ejecucionBuscar (String placa) throws IOException{
        
        mod.setPlaca(placa);
        if(modC.buscar(mod)){
            
            return mod ;
        }
        else{
        return null;
        }
    }
    
    public boolean ejecucionEliminar(String placa) throws IOException{
        
         mod.setPlaca(placa);
            
                if (modC.eliminar(mod)){ //

                    return true ;
                }
                else{
                return false ;
                }
            
    }
    
    public Vehiculo Limpiar(){
        
    mod.setPlaca(" Ingresar Placa");
    mod.setModelo(" Ingresar Modelo");
    mod.setIngreso(" 00 : 00 : 00 ");
    mod.setSalida(" 00 : 00 : 00 ");
    mod.setPrecio(0);
    return mod ;
    
    }
    
    public String obtenerFecha(){
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendario = Calendar.getInstance();
        Date date = calendario.getTime();
        String fechaHora = formato.format(date);
        return fechaHora ;
    }
    
    public float TotalCobrar (String entrada, String salida, String tipo) throws ParseException{
        
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date HEntrada = formato.parse(entrada);
        Date HSalida = formato.parse(salida);
 
        int minutos = (int) ((HSalida.getTime() - HEntrada.getTime()) / 6000);
        
        System.out.println("minutos " + minutos );
        float dinero = 0 ;
        
        if (tipo.equals("Carro")){
            
            dinero = minutos * 66 ;
            System.out.println(" los minutos son " +minutos + " --- el dinero es " + dinero + " /entra a carro");
        }
        if(tipo.equals("Moto")){
            dinero = minutos * 30 ;
            System.out.println(dinero + " /entra en Moto");
        }
        if (tipo.equals("Bicicleta")){
            dinero = 0 ;
            System.out.println(dinero + " /entra a bicicleta ");
        }
        
        return dinero ;
        
    }
}
