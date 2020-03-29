
package controlador;

import modelo.Modelo;
import vista.VistaModificarCiudadano;

public class ControladorVistaModificarCiudadano {
    
    private Modelo modelo;
    private VistaModificarCiudadano vistaModificarCiudadano;

    public ControladorVistaModificarCiudadano(Modelo modelo, VistaModificarCiudadano vistaModificarCiudadano) {
        this.modelo = modelo;
        this.vistaModificarCiudadano = vistaModificarCiudadano;
    }
    
    public void iniciar(){
        vistaModificarCiudadano.setTitle("Modificar ciudadano");
        vistaModificarCiudadano.setLocationRelativeTo(null);
        vistaModificarCiudadano.setVisible(true);
    }
    
    
}
