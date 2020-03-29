
package datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivosBinariosPuestoVotacion extends ArchivosBinarios implements Serializable{

    @Override
    public void leer() {
         File file;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        file = new File("datos/FicherosBinariosPuestosVotacion.bin");
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            //  Object data = objectInputStream.readObject();
            // PuestoVotacion puestoVotacion = (PuestoVotacion) data;
            //System.out.println(puestoVotacion.getDepartamento() + puestoVotacion.getMunicipio() + puestoVotacion.getLugar() + puestoVotacion.getDireccion());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosBinariosCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivosBinariosCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void escribir() {
         File file;
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        file = new File("datos/FicherosBinariosPpuestosVotacion.bin");
        try {

            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //  PuestoVotacion puestoVotacion = new PuestoVotacion("bood", "ken", "patio", "calle34");
            //   objectOutputStream.writeObject(puestoVotacion);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosBinariosCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivosBinariosCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
