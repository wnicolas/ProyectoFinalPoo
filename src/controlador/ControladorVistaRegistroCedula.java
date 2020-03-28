
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import negocio.Ciudadano;
import vista.VistaPuestosVotacion;
import vista.VistaRegistroCedula;

public class ControladorVistaRegistroCedula implements ActionListener {
    
    private Modelo modelo;
    private VistaRegistroCedula vistaRegistroCedula;
    private VistaPuestosVotacion puestosVotacion;
    private int elementeSoleccionado=1;

    public void setElementeSoleccionado(int elementeSoleccionado) {
        this.elementeSoleccionado = elementeSoleccionado;
    }
    
    public ControladorVistaRegistroCedula(Modelo modelo,VistaRegistroCedula vistaRegistroCedula, VistaPuestosVotacion puestosVotacion){
        this.modelo=modelo;
        this.vistaRegistroCedula=vistaRegistroCedula;
        this.puestosVotacion=puestosVotacion;
        vistaRegistroCedula.btnRegistrar.addActionListener(this);
        vistaRegistroCedula.btnSeleccionarPuesto.addActionListener(this);
        vistaRegistroCedula.jButton1.addActionListener(this);
    }
    
    public void iniciar(){
        vistaRegistroCedula.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vistaRegistroCedula.btnRegistrar){
    
       modelo.getCiudadano().add(new Ciudadano(Integer.parseInt(vistaRegistroCedula.txtCedula.getText()), Integer.parseInt(vistaRegistroCedula.cbxDiaExpedicion.getSelectedItem().toString()),Integer.parseInt(vistaRegistroCedula.cbxMesExpedicion.getSelectedItem().toString()),Integer.parseInt(vistaRegistroCedula.cbxAnoExpedicion.getSelectedItem().toString()),
                               vistaRegistroCedula.txtLugarExpedicion.getText(),vistaRegistroCedula.txtPApellido.getText(),vistaRegistroCedula.txtSApellido.getText(),vistaRegistroCedula.txtPNombre.getText(),vistaRegistroCedula.txtSNombre.getText(),
                                Integer.parseInt(vistaRegistroCedula.cbxDiaNacimiento.getSelectedItem().toString()),Integer.parseInt(vistaRegistroCedula.cbxMesNacimiento.getSelectedItem().toString()),Integer.parseInt(vistaRegistroCedula.cbxAnoNacimiento.getSelectedItem().toString()),
                                vistaRegistroCedula.txtLugarNacimiento.getText(),vistaRegistroCedula.cbxSexo.getSelectedItem().toString()));
        
       modelo.getPuesto().get(elementeSoleccionado).getCiudadano().add(new Ciudadano(Integer.parseInt(vistaRegistroCedula.txtCedula.getText()), Integer.parseInt(vistaRegistroCedula.cbxDiaExpedicion.getSelectedItem().toString()),Integer.parseInt(vistaRegistroCedula.cbxMesExpedicion.getSelectedItem().toString()),Integer.parseInt(vistaRegistroCedula.cbxAnoExpedicion.getSelectedItem().toString()),
                               vistaRegistroCedula.txtLugarExpedicion.getText(),vistaRegistroCedula.txtPApellido.getText(),vistaRegistroCedula.txtSApellido.getText(),vistaRegistroCedula.txtPNombre.getText(),vistaRegistroCedula.txtSNombre.getText(),
                                Integer.parseInt(vistaRegistroCedula.cbxDiaNacimiento.getSelectedItem().toString()),Integer.parseInt(vistaRegistroCedula.cbxMesNacimiento.getSelectedItem().toString()),Integer.parseInt(vistaRegistroCedula.cbxAnoNacimiento.getSelectedItem().toString()),
                                vistaRegistroCedula.txtLugarNacimiento.getText(),vistaRegistroCedula.cbxSexo.getSelectedItem().toString()));
       
        }else if(e.getSource()==vistaRegistroCedula.btnSeleccionarPuesto){
            puestosVotacion.setVisible(true);
            vistaRegistroCedula.lblPuestoSeleccionado.setText(modelo.getPuesto().get(elementeSoleccionado-1).getDireccion());
            
        }else if(e.getSource()==vistaRegistroCedula.jButton1){
            for (Ciudadano c : modelo.getCiudadano()) {
                System.out.println(c.getpNombre());
            }
        }
    /*    
       System.out.println("Cédula: "+modelo.getCiudadano().getNumeroCedula());
       System.out.println("Fecha de expedición: "+modelo.getCiudadano().getDiaExpedicion()+"/"+modelo.getCiudadano().getMesExpedicion()+"/"+modelo.getCiudadano().getAnoExpedicion());
       System.out.println("Lugar de Expedición:"+modelo.getCiudadano().getLugarExpedicion());
       
       System.out.println("Nombre: "+modelo.getCiudadano().getpAellido()+" "+modelo.getCiudadano().getsApellido()+" "+modelo.getCiudadano().getpNombre()+" "+modelo.getCiudadano().getsNombre());
       System.out.println("Fecha de Nacimiento:"+modelo.getCiudadano().getDiaNacimiento()+"/"+modelo.getCiudadano().getMesNacimiento()+"/"+modelo.getCiudadano().getAnoNacimiento());
       System.out.println("Lugar de Nacimiento:"+modelo.getCiudadano().getLugarNacimiento());
       
       System.out.println("Sexo: "+modelo.getCiudadano().getSexo());
       */
    }
    
    
}