package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.enumr.GradoAcademico;




public class Materia {
   
    private Integer clave;
    private String descripcion;
    private GradoAcademico grado;

    private List<Curso> cursos;

    public Materia(Integer clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.grado = GradoAcademico.PRIMARIA;
        this.cursos = new ArrayList<>();
    }

    public Materia(Integer clave, String descripcion, List<Curso> cursos) {
        this(clave, descripcion);
        this.cursos = cursos;
    }
    

    public Materia(Integer clave, String descripcion, GradoAcademico grado, List<Curso> cursos) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.grado = grado;
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

  
    public GradoAcademico getGrado() {
        return grado;
    }

   
    public void setGrado(GradoAcademico grado) {
        this.grado = grado;
    }

    
    public List<Curso> getCursos() {
        return cursos;
    }

    
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
}
