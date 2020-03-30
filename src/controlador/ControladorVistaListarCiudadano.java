
package controlador;

import modelo.Modelo;
import vista.VistaListarCiudadanos;


public class ControladorVistaListarCiudadano {
    private Modelo modelo;
    private VistaListarCiudadanos vistaListarCiudadanos;

    public ControladorVistaListarCiudadano(Modelo modelo, VistaListarCiudadanos vistaListarCiudadanos) {
        this.modelo = modelo;
        this.vistaListarCiudadanos = vistaListarCiudadanos;
    }
    
    public void iniciar(){
        vistaListarCiudadanos.setTitle("Listar Ciudadanos");
        vistaListarCiudadanos.setLocationRelativeTo(null);
        vistaListarCiudadanos.setVisible(true);
    }
}
