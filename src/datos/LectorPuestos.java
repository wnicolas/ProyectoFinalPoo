
package datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Modelo;
import negocio.PuestoVotacion;

public class LectorPuestos {
    private Modelo modelo;
    
    public LectorPuestos(Modelo modelo){
        
         this.modelo=modelo;
        
        String csvFile = "datos/Puestos_de_votacion.csv";
        BufferedReader br = null;
        String line = "";
        //Se define separador ","
        String cvsSplitBy = ";";
        try {
        br = new BufferedReader(new FileReader(csvFile));
      
        while ((line = br.readLine()) != null) {                
            String[] datos = line.split(cvsSplitBy);
            
            modelo.getPuesto().add(new PuestoVotacion(datos[0], datos[1], datos[2], datos[3]));
            
            
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        
    }
    
}
