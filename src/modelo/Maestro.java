package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.enumr.FormaPago;
import modelo.enumr.GradoAcademico;


public class Maestro extends Persona{
    
    private Integer numeroEmpleado;
    private Double salarioMensual;
    private GradoAcademico grado;
    private FormaPago formaPago;
    
    private List<Curso> cursos;

    public Maestro(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Double salarioMensual, GradoAcademico grado, FormaPago formaPago) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento);
        this.salarioMensual = salarioMensual;
        this.grado = grado;
        this.formaPago = formaPago;
        this.cursos = new ArrayList<>();
    }
    
    

   
    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    
    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    
    public Double getSalarioMensual() {
        return salarioMensual;
    }

  
    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

   
    public GradoAcademico getGrado() {
        return grado;
    }

   
    public void setGrado(GradoAcademico grado) {
        this.grado = grado;
    }

   
    public FormaPago getFormaPago() {
        return formaPago;
    }

   
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

   
    public List<Curso> getCursos() {
        return cursos;
    }

   
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s",this.numeroEmpleado, super.toString());
    }
    
}
