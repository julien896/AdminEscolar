package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CicloEscolar {
    
    private Integer clave;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFinal;

    private List<Curso> cursos;


    public CicloEscolar(Integer clave, String descripcion, Date fechaInicio, Date fechaFinal) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cursos = new ArrayList<>();
    }

    public CicloEscolar(Integer clave, String descripcion, Date fechaInicio, Date fechaFinal, List<Curso> cursos) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cursos = cursos;
    }
    
   
    public Integer getClave() {
        return clave;
    }

   
    public void setClave(Integer clave) {
        this.clave = clave;
    }

   
    public String getDescripcion() {
        return descripcion;
    }

   
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    public Date getFechaInicio() {
        return fechaInicio;
    }

   
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    
    public Date getFechaFinal() {
        return fechaFinal;
    }

  
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

  
    public List<Curso> getCursos() {
        return cursos;
    }

   
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
}
