package modelo;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;



    public Persona(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

   
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getPrimerApellido() {
        return primerApellido;
    }

   
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

   
    public String getSegundoApellido() {
        return segundoApellido;
    }

   
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

   
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

  
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.primerApellido, this.segundoApellido, this.nombre);
    }
    
    
    
}
