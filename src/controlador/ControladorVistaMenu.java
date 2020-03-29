
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaInformacionCiudadano;
import vista.VistaMenu;


public class ControladorVistaMenu implements ActionListener{
    
    private VistaMenu vistaMenu;
    private ControladorVistaRegistroCedula controladorVistaRegistroCedula;
    
    private VistaInformacionCiudadano vistaInformacionCiudadano;
    private ControladorVistaInformacionCiudadano controladorVistaInformacionCiudadano;
    
    public ControladorVistaMenu(VistaMenu vistaMenu, ControladorVistaRegistroCedula controladorVistaRegistroCedula, ControladorVistaInformacionCiudadano controladorVistaInformacionCiudadano) {
        this.vistaMenu = vistaMenu;
        this.controladorVistaRegistroCedula = controladorVistaRegistroCedula;
        this.controladorVistaInformacionCiudadano=controladorVistaInformacionCiudadano;
        
        this.vistaMenu.btnInscribirCiudadano.addActionListener(this);
        this.vistaMenu.btnInformacionCiudadano.addActionListener(this);
    }
    public void iniciar(){
        vistaMenu.setLocationRelativeTo(null);
        vistaMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vistaMenu.btnInscribirCiudadano){
            controladorVistaRegistroCedula.iniciar();  
        }else if(e.getSource()==vistaMenu.btnInformacionCiudadano){
            controladorVistaInformacionCiudadano.iniciar();
        }
    }
    
    
}
