package datos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivosBinariosCiudadano extends ArchivosBinarios {

    public ArchivosBinariosCiudadano() {

    }

    @Override
    public void leer() {
        File file;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        file = new File("datos/FicherosBinariosCiudadano.bin");
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

        file = new File("datos/FicherosBinariosCiudadano.bin");
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
