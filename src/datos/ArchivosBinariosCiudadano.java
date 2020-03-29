package datos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo;
import negocio.Ciudadano;

public class ArchivosBinariosCiudadano extends ArchivosBinarios implements Serializable {

    private Modelo modelo;

    public ArchivosBinariosCiudadano(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    @Override
    public void leer() {
        File file;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream=null;

        file = new File("datos/FicherosBinariosCiudadano.obj");
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            //*****************************************************************
            modelo.getCiudadano().clear();
            int i=0;
            while(true){
                
                
                Object data=objectInputStream.readObject();
                Ciudadano ciudadano=(Ciudadano) data;
                modelo.getCiudadano().add(ciudadano);
                System.out.println(modelo.getCiudadano().get(i).getpNombre());
              i++;
            }
            //*****************************************************************
            //  Object data = objectInputStream.readObject();
            // PuestoVotacion puestoVotacion = (PuestoVotacion) data;
            //System.out.println(puestoVotacion.getDepartamento() + puestoVotacion.getMunicipio() + puestoVotacion.getLugar() + puestoVotacion.getDireccion());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosBinariosCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Hooooola");
        }
    }

    @Override
    public void escribir() {
        File file;
        file = new File("datos/FicherosBinariosCiudadano.obj");
        try {
            FileOutputStream fileOutputStream;
            ObjectOutputStream objectOutputStream;
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //*****************************************************************
            
            
            for (Ciudadano c: modelo.getCiudadano()) {
                objectOutputStream.writeObject(c);

            }
            
           
            objectOutputStream.close();
            

            //*****************************************************************
            //  PuestoVotacion puestoVotacion = new PuestoVotacion("bood", "ken", "patio", "calle34");
            //   objectOutputStream.writeObject(puestoVotacion);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosBinariosCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivosBinariosCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
