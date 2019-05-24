package modelo;

import java.util.ArrayList;
import java.util.List;


public class Curso {
    
    private Materia materia;
    private Maestro maestro;
    private CicloEscolar cicloEscolar;
    private Integer cupo;
    private Integer salon;
    
    
    private List<Inscripcion> inscritos;

    public Curso() {
    }

    public Curso(Materia materia, Maestro maestro, CicloEscolar cicloEscolar, Integer salon) {
        this.materia = materia;
        this.maestro = maestro;
        this.cicloEscolar = cicloEscolar;
        this.cupo = 40;
        this.salon = salon;
        this.inscritos = new ArrayList<>();
    }
    
    

    
    public Materia getMateria() {
        return materia;
    }

    
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

   
    public Maestro getMaestro() {
        return maestro;
    }

   
    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    
    public CicloEscolar getCicloEscolar() {
        return cicloEscolar;
    }

    
    public void setCicloEscolar(CicloEscolar cicloEscolar) {
        this.cicloEscolar = cicloEscolar;
    }

   
    public Integer getCupo() {
        return cupo;
    }

    
    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    
    public Integer getSalon() {
        return salon;
    }

   
    public void setSalon(Integer salon) {
        this.salon = salon;
    }

    
    public List<Inscripcion> getInscritos() {
        return inscritos;
    }

    
    public void setInscritos(List<Inscripcion> inscritos) {
        this.inscritos = inscritos;
    }
    
}
