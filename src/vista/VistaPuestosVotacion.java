
package vista;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;
import negocio.PuestoVotacion;


public class VistaPuestosVotacion extends JFrame{
    
    public javax.swing.JComboBox<String> cbxPuestoVotacion;
    public ArrayList<PuestoVotacion> puesto=new ArrayList();
    
    public VistaPuestosVotacion(){
        setLayout(null);
        setBounds(50,50,740,100);
        setTitle("Seleccione puesto de votación");
        setLocationRelativeTo(null);
        
        cbxPuestoVotacion = new javax.swing.JComboBox<>();
        cbxPuestoVotacion.addItem("Seleccione puesto");
        //setVisible(true);
    }

    public void setPuesto(ArrayList<PuestoVotacion> puesto) {
        this.puesto = puesto;
    }
    
    public void llenar(){        
     
        int i=0;
        for (PuestoVotacion puestoVotacion : puesto) {
            i++;
            cbxPuestoVotacion.addItem(puestoVotacion.getDepartamento()+" / "+puestoVotacion.getMunicipio()+" / "+puestoVotacion.getLugar()+" / "+puestoVotacion.getDireccion());
        }
        
        add(cbxPuestoVotacion);   
        cbxPuestoVotacion.setBounds(10, 10, 700, 25);
    }
    
}
