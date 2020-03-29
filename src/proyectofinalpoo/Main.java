
package proyectofinalpoo;

import controlador.ControladorVistaConsulta;
import controlador.ControladorVistaInformacionCiudadano;
import controlador.ControladorVistaMenu;
import controlador.ControladorVistaModificarCiudadano;
import controlador.ControladorVistaRegistroCedula;
import modelo.Modelo;
import vista.VistaInformacionCiudadano;
import vista.VistaMenu;
import vista.VistaModificarCiudadano;
import vista.VistaPuestosVotacion;
import vista.VistaRegistroCedula;

public class Main {

    public static void main(String[] args) {
       Modelo modelo=new Modelo();
       
       VistaRegistroCedula vistaRegistroCedula=new VistaRegistroCedula();
       VistaPuestosVotacion puestosVotacion=new VistaPuestosVotacion();
       ControladorVistaRegistroCedula controladorVistaRegistroCedula=new ControladorVistaRegistroCedula(modelo, vistaRegistroCedula, puestosVotacion);
       ControladorVistaConsulta vistaConsulta=new ControladorVistaConsulta(modelo, puestosVotacion, controladorVistaRegistroCedula);       
              
       
       VistaInformacionCiudadano vistaInformacionCiudadano=new VistaInformacionCiudadano();
       ControladorVistaInformacionCiudadano controladorVistaInformacionCiudadano=new ControladorVistaInformacionCiudadano(modelo,vistaInformacionCiudadano);
       VistaMenu vistaMenu=new VistaMenu();
       
        VistaModificarCiudadano vistaModificarCiudadano=new VistaModificarCiudadano();
        ControladorVistaModificarCiudadano controladorVistaModificarCiudadano=new ControladorVistaModificarCiudadano(modelo, vistaModificarCiudadano);
       
       ControladorVistaMenu controladorVistaMenu=new ControladorVistaMenu(vistaMenu, controladorVistaRegistroCedula, controladorVistaInformacionCiudadano,controladorVistaModificarCiudadano);
       controladorVistaMenu.iniciar();
       
    }
    
}
