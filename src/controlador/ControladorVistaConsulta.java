
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import modelo.Modelo;
import vista.VistaPuestosVotacion;
import vista.VistaRegistroCedula;

public class ControladorVistaConsulta implements ActionListener,Serializable{

    private Modelo modelo;
    private VistaPuestosVotacion puestosVotacion;
    private ControladorVistaRegistroCedula controladorVistaRegistroCedula;
   
    
    public ControladorVistaConsulta(Modelo modelo, VistaPuestosVotacion puestosVotacion, ControladorVistaRegistroCedula cvrc){
        this.modelo=modelo;
        this.puestosVotacion=puestosVotacion;
        this.controladorVistaRegistroCedula=cvrc;
        this.puestosVotacion.setPuesto(this.modelo.getPuesto());
        this.puestosVotacion.llenar();
        this.puestosVotacion.cbxPuestoVotacion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controladorVistaRegistroCedula.setElementeSoleccionado(puestosVotacion.cbxPuestoVotacion.getSelectedIndex());
    }
    
}
