package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo;
import negocio.Ciudadano;
import vista.VistaListarCiudadanos;

public class ControladorVistaListarCiudadano implements ActionListener {

    private Modelo modelo;
    private VistaListarCiudadanos vistaListarCiudadanos;
    private String nombreFiltro = "";
    DefaultTableModel dtm = new DefaultTableModel();

    public ControladorVistaListarCiudadano(Modelo modelo, VistaListarCiudadanos vistaListarCiudadanos) {
        this.modelo = modelo;
        this.vistaListarCiudadanos = vistaListarCiudadanos;

        this.vistaListarCiudadanos.btnListar.addActionListener(this);

    }

    public void iniciar() {
        vistaListarCiudadanos.setTitle("Listar Ciudadanos");
        vistaListarCiudadanos.setLocationRelativeTo(null);
        vistaListarCiudadanos.setVisible(true);

        String[] titulo = new String[]{"Cédula", "Primer apellido", "Segundo apellido", "Primer nombre", "Segundo nombre"};
        dtm.setColumnIdentifiers(titulo);
        vistaListarCiudadanos.tblLista.setModel(dtm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < dtm.getRowCount(); i++) {
                dtm.removeRow(0);
            }
        nombreFiltro = vistaListarCiudadanos.txtBuscar.getText();
        if (vistaListarCiudadanos.cbxFiltro.getSelectedIndex() == 1) {
            modelo.getArchivosBinariosCiudadano().leer();
             
            for (Ciudadano ciudadano : modelo.getCiudadano()) {
                if (ciudadano.getPuestoVotacion().getDepartamento().equalsIgnoreCase(nombreFiltro)) {

                    dtm.addRow(new Object[]{ciudadano.getNumeroCedula(), ciudadano.getpAellido(), ciudadano.getsApellido(), ciudadano.getpNombre(), ciudadano.getsNombre()});

                }
            }
        } else if (vistaListarCiudadanos.cbxFiltro.getSelectedIndex() == 2) {
            modelo.getArchivosBinariosCiudadano().leer();

            for (Ciudadano ciudadano : modelo.getCiudadano()) {
                if (ciudadano.getPuestoVotacion().getMunicipio().equalsIgnoreCase(nombreFiltro)) {

                    dtm.addRow(new Object[]{ciudadano.getNumeroCedula(), ciudadano.getpAellido(), ciudadano.getsApellido(), ciudadano.getpNombre(), ciudadano.getsNombre()});

                }
            }
        } else if (vistaListarCiudadanos.cbxFiltro.getSelectedIndex() == 3) {
            modelo.getArchivosBinariosCiudadano().leer();

           

            for (Ciudadano ciudadano : modelo.getCiudadano()) {
                if (ciudadano.getPuestoVotacion().getLugar().equalsIgnoreCase(nombreFiltro)) {

                    dtm.addRow(new Object[]{ciudadano.getNumeroCedula(), ciudadano.getpAellido(), ciudadano.getsApellido(), ciudadano.getpNombre(), ciudadano.getsNombre()});

                }
            }
        }
    }
}
