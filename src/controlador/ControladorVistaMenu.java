
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
    private ControladorVistaModificarCiudadano controladorVistaModificarCiudadano;
    private ControladorVistaListarCiudadano controladorVistaListarCiudadano;
    
    public ControladorVistaMenu(VistaMenu vistaMenu, ControladorVistaRegistroCedula controladorVistaRegistroCedula, ControladorVistaInformacionCiudadano controladorVistaInformacionCiudadano, ControladorVistaModificarCiudadano controladorVistaModificarCiudadano, ControladorVistaListarCiudadano controladorVistaListarCiudadano) {
        this.vistaMenu = vistaMenu;
        this.controladorVistaRegistroCedula = controladorVistaRegistroCedula;
        this.controladorVistaInformacionCiudadano=controladorVistaInformacionCiudadano;
        this.controladorVistaModificarCiudadano=controladorVistaModificarCiudadano;
        this.controladorVistaListarCiudadano=controladorVistaListarCiudadano;
        
        this.vistaMenu.btnInscribirCiudadano.addActionListener(this);
        this.vistaMenu.btnInformacionCiudadano.addActionListener(this);
        this.vistaMenu.btnModificarCiudadano.addActionListener(this);
        this.vistaMenu.btnListarCiudadano.addActionListener(this);
    }
    public void iniciar(){
        vistaMenu.setTitle("Menú");
        vistaMenu.setLocationRelativeTo(null);
        vistaMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vistaMenu.btnInscribirCiudadano){
            controladorVistaRegistroCedula.iniciar();  
        }else if(e.getSource()==vistaMenu.btnInformacionCiudadano){
            controladorVistaInformacionCiudadano.iniciar();
        }else if(e.getSource()==vistaMenu.btnModificarCiudadano){
            controladorVistaModificarCiudadano.iniciar();
        }else if(e.getSource()==vistaMenu.btnListarCiudadano){
            controladorVistaListarCiudadano.iniciar();
        }
    }
    
    
}
