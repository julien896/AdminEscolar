package modelo.enumr;


public enum GradoAcademico {
    
    PRIMARIA(1,"Primaria"),
    SECUNDARIA(2,"Secundaria"),
    BACHILLERATO(3,"Bachillerato"),
    LICENCIATURA(4,"Licenciatura"),
    POSGRADO(5,"Posgrado");
    
    private Integer clave;
    private String descripcion;

    private GradoAcademico() {
        
    }

    private GradoAcademico(Integer clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }

   
    public Integer getClave() {
        return clave;
    }

   
    public String getDescripcion() {
        return descripcion;
    }
    
    
}
