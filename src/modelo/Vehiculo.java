

package modelo;

public class Vehiculo {
    
    private int    id ;
    private String modelo  ;
    private String tipo    ;
    private String placa   ;
    private String ingreso ;
    private String salida  ;
    private float  precio  ;
    
    
    
    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getIngreso() {
        return ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public float getPrecio() {
        return precio;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
