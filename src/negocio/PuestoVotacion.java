
package negocio;

public class PuestoVotacion {
    private String departamento;
    private String municipio;
    private String lugar;
    private String direccion;

    public PuestoVotacion(String departamento, String municipio, String lugar, String direccion) {
        this.departamento = departamento;
        this.municipio = municipio;
        this.lugar = lugar;
        this.direccion = direccion;
    }

  

    public String getDepartamento() {
        return departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
    
    
}
