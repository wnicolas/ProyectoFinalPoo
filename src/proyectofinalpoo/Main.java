
package proyectofinalpoo;

import controlador.ControladorVistaConsulta;
import controlador.ControladorVistaRegistroCedula;
import datos.ArchivosBinariosCiudadano;
import datos.ArchivosBinariosPuestoVotacion;
import modelo.Modelo;
import vista.VistaPuestosVotacion;
import vista.VistaRegistroCedula;

public class Main {

    public static void main(String[] args) {
       Modelo modelo=new Modelo();
       
       VistaRegistroCedula vistaRegistroCedula=new VistaRegistroCedula();
       VistaPuestosVotacion puestosVotacion=new VistaPuestosVotacion();
       ControladorVistaRegistroCedula controladorVistaRegistroCedula=new ControladorVistaRegistroCedula(modelo, vistaRegistroCedula, puestosVotacion);
       
       controladorVistaRegistroCedula.iniciar();
       vistaRegistroCedula.setVisible(true);   
       
       ControladorVistaConsulta vistaConsulta=new ControladorVistaConsulta(modelo, puestosVotacion, controladorVistaRegistroCedula);       
              
       
        ArchivosBinariosPuestoVotacion a=new ArchivosBinariosPuestoVotacion();
        a.escribir();
       // a.leer();
    }
    
}
