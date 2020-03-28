
package negocio;

import java.util.ArrayList;

public class PuestoVotacion {
    private String departamento;
    private String municipio;
    private String lugar;
    private String direccion;
    
    private ArrayList<Ciudadano> ciudadano=new ArrayList<Ciudadano>();

    public PuestoVotacion(String departamento, String municipio, String lugar, String direccion) {
        this.departamento = departamento;
        this.municipio = municipio;
        this.lugar = lugar;
        this.direccion = direccion;
    }

    public ArrayList<Ciudadano> getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(ArrayList<Ciudadano> ciudadano) {
        this.ciudadano = ciudadano;
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
