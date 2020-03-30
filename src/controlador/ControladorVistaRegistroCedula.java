package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JFrame;
import modelo.Modelo;
import negocio.Ciudadano;
import vista.VistaPuestosVotacion;
import vista.VistaRegistroCedula;

public class ControladorVistaRegistroCedula implements ActionListener, Serializable {

    private Modelo modelo;
    private VistaRegistroCedula vistaRegistroCedula;
    private VistaPuestosVotacion puestosVotacion;
    private int elementeSoleccionado = 1;

    public void setElementeSoleccionado(int elementeSoleccionado) {
        this.elementeSoleccionado = elementeSoleccionado;
    }

    public ControladorVistaRegistroCedula(Modelo modelo, VistaRegistroCedula vistaRegistroCedula, VistaPuestosVotacion puestosVotacion) {
        this.modelo = modelo;
        this.vistaRegistroCedula = vistaRegistroCedula;
        this.puestosVotacion = puestosVotacion;
        vistaRegistroCedula.btnRegistrar.addActionListener(this);
        vistaRegistroCedula.btnSeleccionarPuesto.addActionListener(this);
    }

    public void iniciar() {
        vistaRegistroCedula.setTitle("Inscribir Ciudadano");
        vistaRegistroCedula.setLocationRelativeTo(null);
        vistaRegistroCedula.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.getArchivosBinariosCiudadano().leer();

        if (e.getSource() == vistaRegistroCedula.btnRegistrar) {
            
            Ciudadano ciudadano=new Ciudadano(Integer.parseInt(vistaRegistroCedula.txtCedula.getText()), Integer.parseInt(vistaRegistroCedula.cbxDiaExpedicion.getSelectedItem().toString()), Integer.parseInt(vistaRegistroCedula.cbxMesExpedicion.getSelectedItem().toString()), Integer.parseInt(vistaRegistroCedula.cbxAnoExpedicion.getSelectedItem().toString()),
                    vistaRegistroCedula.txtLugarExpedicion.getText(), vistaRegistroCedula.txtPApellido.getText(), vistaRegistroCedula.txtSApellido.getText(), vistaRegistroCedula.txtPNombre.getText(), vistaRegistroCedula.txtSNombre.getText(),
                    Integer.parseInt(vistaRegistroCedula.cbxDiaNacimiento.getSelectedItem().toString()), Integer.parseInt(vistaRegistroCedula.cbxMesNacimiento.getSelectedItem().toString()), Integer.parseInt(vistaRegistroCedula.cbxAnoNacimiento.getSelectedItem().toString()),
                    vistaRegistroCedula.txtLugarNacimiento.getText(), vistaRegistroCedula.cbxSexo.getSelectedItem().toString(), modelo.getPuesto().get(elementeSoleccionado - 1));

            modelo.getCiudadano().add(ciudadano);
            modelo.getArchivosBinariosCiudadano().escribir();
            
            modelo.getPuesto().get(elementeSoleccionado-1).getCiudadano().add(ciudadano);

        } else if (e.getSource() == vistaRegistroCedula.btnSeleccionarPuesto) {
            puestosVotacion.setVisible(true);

        }
    }

}
