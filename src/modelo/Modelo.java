
package modelo;

import datos.ArchivosBinariosCiudadano;
import datos.LectorPuestos;
import java.io.Serializable;
import java.util.ArrayList;
import negocio.Ciudadano;
import negocio.PuestoVotacion;


public class Modelo implements Serializable{
    
    private PuestoVotacion puestoVotacion;
    private ArrayList<PuestoVotacion> puesto=new ArrayList();
    private ArrayList<Ciudadano> ciudadano=new ArrayList<Ciudadano>();
    private ArchivosBinariosCiudadano archivosBinariosCiudadano;
    
    public Modelo(){
        LectorPuestos lectorPuesto=new LectorPuestos(this);
        archivosBinariosCiudadano=new ArchivosBinariosCiudadano(this);
        
         
    }

    public ArchivosBinariosCiudadano getArchivosBinariosCiudadano() {
        return archivosBinariosCiudadano;
    }

    public void setArchivosBinariosCiudadano(ArchivosBinariosCiudadano archivosBinariosCiudadano) {
        this.archivosBinariosCiudadano = archivosBinariosCiudadano;
    }

    public ArrayList<Ciudadano> getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(ArrayList<Ciudadano> ciudadano) {
        this.ciudadano = ciudadano;
    }


    public PuestoVotacion getPuestoVotacion() {
        return puestoVotacion;
    }

    public void setPuestoVotacion(PuestoVotacion puestoVotacion) {
        this.puestoVotacion = puestoVotacion;
    }

    public ArrayList<PuestoVotacion> getPuesto() {
        return puesto;
    }

    public void setPuesto(ArrayList<PuestoVotacion> puesto) {
        this.puesto = puesto;
    }  

    
    
    
}
    

