package modelo;

import datos.ArchivosBinariosCiudadano;
import datos.LectorPuestos;
import java.io.Serializable;
import java.util.ArrayList;
import negocio.Ciudadano;
import negocio.PuestoVotacion;

public class Modelo implements Serializable {

    private PuestoVotacion puestoVotacion;
    private ArrayList<PuestoVotacion> puesto = new ArrayList();
    private ArrayList<Ciudadano> ciudadano = new ArrayList<Ciudadano>();
    private ArchivosBinariosCiudadano archivosBinariosCiudadano;

    public Modelo() {
        LectorPuestos lectorPuesto = new LectorPuestos(this);
        archivosBinariosCiudadano = new ArchivosBinariosCiudadano(this);

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

    public String calcularPorcentajeGenero() {
        int total = 0;
        int mujeres = 0;
        int hombres = 0;
        float pHombres,pMujeres;

        this.getArchivosBinariosCiudadano().leer();

        for (Ciudadano ciudadano : this.getCiudadano()) {
            total++;
            if (ciudadano.getSexo().equals("Masculino")) {
                hombres++;
            } else {
                mujeres++;
            }
        }
        
        pHombres=(hombres*100)/total;
        pMujeres=100-pHombres;
        
        return "El porcentaje de hombres es del "+pHombres+"% y el porcentaje de mujeres es del "+pMujeres+"%.";
    }
}
