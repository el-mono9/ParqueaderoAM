
package modelo;

public class Perfil {
    
    private int     id         ; 
    private String  perfil     ;
    private String  nombre     ;
    private String  cedula     ;
    private String  usuario    ;
    private String  contrasena ;

    public int getId() {
        return id;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }
}
