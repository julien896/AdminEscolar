package modelo.enumr;


public enum FormaDePago {
    
    SEMANAL(1,"Semanal",7),
    QUINCENAL(2,"Quincenal",15),
    MENSUAL(3,"Mensual",30);
    
    private Integer clave;
    private String descripcion;
    private Integer diasLaborados;

    private FormaDePago() {
        
    }

    private FormaDePago(Integer clave, String descripcion, Integer diasLaborados) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.diasLaborados = diasLaborados;
    }

    

   
    public Integer getClave() {
        return clave;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

   
    public Integer getDiasLaborados() {
        return diasLaborados;
    }
    
    
}
