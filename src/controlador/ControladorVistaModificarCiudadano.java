
package controlador;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import negocio.Ciudadano;
import vista.VistaModificarCiudadano;
import vista.VistaPuestosVotacion;

public class ControladorVistaModificarCiudadano implements ActionListener{
    
    private Modelo modelo;
    private VistaModificarCiudadano vistaModificarCiudadano;
    private VistaPuestosVotacion puestosVotacion;
    private int cedula=0;
    private int elementoSeleccionado=0;
    
    int i=0;

    public ControladorVistaModificarCiudadano(Modelo modelo, VistaModificarCiudadano vistaModificarCiudadano, VistaPuestosVotacion vistaPuestosVotacion) {
        this.modelo = modelo;
        this.vistaModificarCiudadano = vistaModificarCiudadano;
        this.puestosVotacion=vistaPuestosVotacion;
       
        this.vistaModificarCiudadano.btnCambiarPuestoVotacion.addActionListener(this);
        this.vistaModificarCiudadano.btnGuardarCambios.addActionListener(this);
        this.vistaModificarCiudadano.btnBuscar.addActionListener(this);
    }
    
    public void iniciar(){
        vistaModificarCiudadano.setTitle("Modificar ciudadano");
        vistaModificarCiudadano.setLocationRelativeTo(null);
        vistaModificarCiudadano.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vistaModificarCiudadano.btnBuscar){
            modelo.getArchivosBinariosCiudadano().leer();
            cedula=Integer.parseInt(vistaModificarCiudadano.txtCedula.getText());
            for (Ciudadano ciudadano : modelo.getCiudadano()) {
                if(cedula==ciudadano.getNumeroCedula()){
                    vistaModificarCiudadano.txtPApellido.setText(ciudadano.getpAellido());
                    vistaModificarCiudadano.txtSApellido.setText(ciudadano.getsApellido());
                    vistaModificarCiudadano.txtPNombre.setText(ciudadano.getpNombre());
                    vistaModificarCiudadano.txtSNombre.setText(ciudadano.getsNombre());
                    vistaModificarCiudadano.cbxSexo.setSelectedItem(ciudadano.getSexo());
                    vistaModificarCiudadano.lblPuestoVotacion.setText(ciudadano.getPuestoVotacion().getDepartamento()+" / "+ciudadano.getPuestoVotacion().getMunicipio()+" / "+ciudadano.getPuestoVotacion().getLugar()+" / "+ciudadano.getPuestoVotacion().getDireccion());
                }
            }
        }else if(e.getSource()==vistaModificarCiudadano.btnCambiarPuestoVotacion){
            puestosVotacion.setVisible(true);
        }else if(e.getSource()==vistaModificarCiudadano.btnGuardarCambios){
            
            modelo.getArchivosBinariosCiudadano().leer();
            
             for (Ciudadano ciudadano : modelo.getCiudadano()) {
                if(cedula==ciudadano.getNumeroCedula()){
                    ciudadano.setpAellido(vistaModificarCiudadano.txtPApellido.getText());
                    ciudadano.setsApellido(vistaModificarCiudadano.txtSApellido.getText());
                    ciudadano.setpNombre(vistaModificarCiudadano.txtPNombre.getText());
                    ciudadano.setsNombre(vistaModificarCiudadano.txtSNombre.getText());
                    ciudadano.setSexo(vistaModificarCiudadano.cbxSexo.getSelectedItem().toString());
                    ciudadano.setPuestoVotacion(modelo.getPuesto().get(elementoSeleccionado-1));
                    
                    modelo.getArchivosBinariosCiudadano().escribir();
                }
                i++;
            }
            
        }
    }

    public int getElementoSeleccionado() {
        return elementoSeleccionado;
    }

    public void setElementoSeleccionado(int elementoSeleccionado) {
        this.elementoSeleccionado = elementoSeleccionado;
    }
    
    
}
