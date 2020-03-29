
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import negocio.Ciudadano;
import vista.VistaInformacionCiudadano;

public class ControladorVistaInformacionCiudadano implements ActionListener{

    private Modelo modelo;
    private VistaInformacionCiudadano vistaInformacionCiudadano;
    private int cedula=0;

    public ControladorVistaInformacionCiudadano(Modelo modelo, VistaInformacionCiudadano vistaInformacionCiudadano) {
        this.modelo = modelo;
        this.vistaInformacionCiudadano = vistaInformacionCiudadano;
        this.vistaInformacionCiudadano.btnBuscar.addActionListener(this);
    }
    
    public void iniciar(){
        vistaInformacionCiudadano.setTitle("Información de Ciudadano");
        vistaInformacionCiudadano.setLocationRelativeTo(null);
        vistaInformacionCiudadano.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        modelo.getArchivosBinariosCiudadano().leer();
        
        cedula=Integer.parseInt(vistaInformacionCiudadano.txtCedula.getText());
        System.out.println(cedula);
        
        for (Ciudadano ciudadano : modelo.getCiudadano()) {
            if(ciudadano.getNumeroCedula()==cedula){
                vistaInformacionCiudadano.lblNombre.setText(ciudadano.getpAellido()+" "+ciudadano.getsApellido()+" "+ciudadano.getpNombre()+" "+ciudadano.getsNombre());
                vistaInformacionCiudadano.lblFechaNacimiento.setText(ciudadano.getDiaNacimiento()+"/"+ciudadano.getMesNacimiento()+"/"+ciudadano.getAnoNacimiento());
                vistaInformacionCiudadano.lblLugarNacimiento.setText(ciudadano.getLugarNacimiento());
                vistaInformacionCiudadano.lblSexo.setText(ciudadano.getSexo());
                vistaInformacionCiudadano.lblPuesto.setText(ciudadano.getPuestoVotacion().getDepartamento()+" / "+ciudadano.getPuestoVotacion().getMunicipio()+" / "+ciudadano.getPuestoVotacion().getLugar()+" / "+ciudadano.getPuestoVotacion().getDireccion());
            }
        }
    }
    
}
