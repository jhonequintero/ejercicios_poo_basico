package  MODELO;


public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
    }

    public String getNombre() {
        return nombre; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    

    public String getApellido() {
        return apellido; 
    }
    public void setApellido(String apellido) { 
        this.apellido = apellido;
    }
    

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
