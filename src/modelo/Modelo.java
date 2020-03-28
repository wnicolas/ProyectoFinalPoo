
package modelo;

import controlador.ControladorVistaConsulta;
import datos.LectorPuestos;
import java.util.ArrayList;
import negocio.Ciudadano;
import negocio.PuestoVotacion;

public class Modelo {
    
    private PuestoVotacion puestoVotacion;
    private ArrayList<PuestoVotacion> puesto=new ArrayList();
    private ArrayList<Ciudadano> ciudadano=new ArrayList<Ciudadano>();
    
    public Modelo(){
        LectorPuestos lectorPuesto=new LectorPuestos(this);
         
         
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
    

