
package modelo;

import datos.LectorPuestos;
import java.util.ArrayList;
import negocio.Ciudadano;
import negocio.PuestoVotacion;

public class Modelo {
    private Ciudadano ciudadano;
    private PuestoVotacion puestoVotacion;
    private ArrayList<PuestoVotacion> puesto=new ArrayList();
    
    public Modelo(){
         LectorPuestos lectorPuesto=new LectorPuestos(this);
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
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
    

