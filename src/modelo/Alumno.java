   package modelo;

	import java.util.Date;
	import java.util.HashMap;
	import java.util.Objects;
	import modelo.enumr.GradoAcademico;

	
	public class Alumno extends Persona {

	    private Integer matricula;
	    private GradoAcademico grado;

	    public Alumno(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento) {
	        super(nombre, primerApellido, segundoApellido, fechaNacimiento);
	        this.grado = GradoAcademico.PRIMARIA;
	    }

	    public Alumno(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer matricula, GradoAcademico grado) {
	        this(nombre, primerApellido, segundoApellido, fechaNacimiento);
	        this.matricula = matricula;
	        this.grado = grado;
	    }

	   
	    public Integer getMatricula() {
	        return matricula;
	    }

	   
	    public void setMatricula(Integer matricula) {
	        this.matricula = matricula;
	    }

	   
	    public GradoAcademico getGrado() {
	        return grado;
	    }

	  
	    public void setGrado(GradoAcademico grado) {
	        this.grado = grado;
	    }

	    @Override
	    public String toString() {
	        return String.format("%s %s", this.matricula, super.toString());
	    }
	    
	    public static Integer getMatricula(HashMap<Integer, Alumno> alumnos){
	        return alumnos.size() + 1;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 5;
	        return hash;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Alumno other = (Alumno) obj;
	        if (!Objects.equals(this.matricula, other.matricula)) {
	            return false;
	        }
	        if (this.grado != other.grado) {
	            return false;
	        }
	        return true;
	    }
	    
	    
	    
	    

	}



