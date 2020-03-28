
package proyectofinalpoo;

import controlador.ControladorVistaRegistroCedula;
import modelo.Modelo;
import vista.VistaRegistroCedula;

public class Main {

    public static void main(String[] args) {
       Modelo modelo=new Modelo();
       VistaRegistroCedula vistaRegistroCedula=new VistaRegistroCedula();
       ControladorVistaRegistroCedula controladorVistaRegistroCedula=new ControladorVistaRegistroCedula(modelo, vistaRegistroCedula);
       
       controladorVistaRegistroCedula.iniciar();
       vistaRegistroCedula.setVisible(true);   
       System.out.println(modelo.getPuesto().get(0).getLugar());
    }
    
}
