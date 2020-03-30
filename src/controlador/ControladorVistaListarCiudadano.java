package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import negocio.Ciudadano;
import vista.VistaListarCiudadanos;

public class ControladorVistaListarCiudadano implements ActionListener {

    private Modelo modelo;
    private VistaListarCiudadanos vistaListarCiudadanos;
    private String nombreFiltro = "";

    public ControladorVistaListarCiudadano(Modelo modelo, VistaListarCiudadanos vistaListarCiudadanos) {
        this.modelo = modelo;
        this.vistaListarCiudadanos = vistaListarCiudadanos;

        this.vistaListarCiudadanos.btnListar.addActionListener(this);
    }

    public void iniciar() {
        vistaListarCiudadanos.setTitle("Listar Ciudadanos");
        vistaListarCiudadanos.setLocationRelativeTo(null);
        vistaListarCiudadanos.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        nombreFiltro = vistaListarCiudadanos.txtBuscar.getText();
        if (vistaListarCiudadanos.cbxFiltro.getSelectedIndex() == 1) {
            modelo.getArchivosBinariosCiudadano().leer();
            for (Ciudadano ciudadano : modelo.getCiudadano()) {
                if (ciudadano.getPuestoVotacion().getDepartamento().equalsIgnoreCase(nombreFiltro)) {
                    System.out.println(ciudadano.getNumeroCedula());
                }
            }
        }else if(vistaListarCiudadanos.cbxFiltro.getSelectedIndex() == 2){
              modelo.getArchivosBinariosCiudadano().leer();
            for (Ciudadano ciudadano : modelo.getCiudadano()) {
                if (ciudadano.getPuestoVotacion().getMunicipio().equalsIgnoreCase(nombreFiltro)) {
                    System.out.println(ciudadano.getNumeroCedula());
                }
            }
        }else if(vistaListarCiudadanos.cbxFiltro.getSelectedIndex() == 3){
              modelo.getArchivosBinariosCiudadano().leer();
            for (Ciudadano ciudadano : modelo.getCiudadano()) {
                if (ciudadano.getPuestoVotacion().getLugar().equalsIgnoreCase(nombreFiltro)) {
                    System.out.println(ciudadano.getNumeroCedula());
                }
            }
        }
    }
}
