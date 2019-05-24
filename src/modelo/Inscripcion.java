package modelo;


public class Inscripcion {

    private Alumno alumno;
    private Curso curso;
    private Double primeraCalificacion;
    private Double segundaCalificacion;
    private Double terceraCalificacion;



    public Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
        this.primeraCalificacion = 0.0d;
        this.segundaCalificacion = 0.0d;
        this.terceraCalificacion = 0.0d;
    }
    
    

    public Alumno getAlumno() {
        return alumno;
    }

    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    
    public Curso getCurso() {
        return curso;
    }

  
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
    public Double getPrimeraCalificacion() {
        return primeraCalificacion;
    }

    
    public void setPrimeraCalificacion(Double primeraCalificacion) {
        this.primeraCalificacion = primeraCalificacion;
    }

   
    public Double getSegundaCalificacion() {
        return segundaCalificacion;
    }

    
    public void setSegundaCalificacion(Double segundaCalificacion) {
        this.segundaCalificacion = segundaCalificacion;
    }

    
    public Double getTerceraCalificacion() {
        return terceraCalificacion;
    }

   
    public void setTerceraCalificacion(Double terceraCalificacion) {
        this.terceraCalificacion = terceraCalificacion;
    }
    
}
