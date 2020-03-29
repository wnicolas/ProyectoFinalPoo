
package negocio;

import java.io.Serializable;

public class Ciudadano implements Serializable{
    //Declaración de atributos de la clase Ciudadano
    private int numeroCedula;
    private int diaExpedicion;
    private int mesExpedicion;
    private int anoExpedicion;
    private String lugarExpedicion;
    private String pAellido;
    private String sApellido;
    private String pNombre;
    private String sNombre;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anoNacimiento;
    private String lugarNacimiento;
    private String sexo;
    
    //Constructor

    public Ciudadano(int numeroCedula, int diaExpedicion, int mesExpedicion, int anoExpedicion, String lugarExpedicion, String pAellido, String sApellido, String pNombre, String sNombre, int diaNacimiento, int mesNacimiento, int anoNacimiento, String lugarNacimiento, String sexo) {
        this.numeroCedula = numeroCedula;
        this.diaExpedicion = diaExpedicion;
        this.mesExpedicion = mesExpedicion;
        this.anoExpedicion = anoExpedicion;
        this.lugarExpedicion = lugarExpedicion;
        this.pAellido = pAellido;
        this.sApellido = sApellido;
        this.pNombre = pNombre;
        this.sNombre = sNombre;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.sexo = sexo;
    }

    public Ciudadano() {
    }
  
    //Generación de getters y setters

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public int getDiaExpedicion() {
        return diaExpedicion;
    }

    public void setDiaExpedicion(int diaExpedicion) {
        this.diaExpedicion = diaExpedicion;
    }

    public int getMesExpedicion() {
        return mesExpedicion;
    }

    public void setMesExpedicion(int mesExpedicion) {
        this.mesExpedicion = mesExpedicion;
    }

    public int getAnoExpedicion() {
        return anoExpedicion;
    }

    public void setAnoExpedicion(int anoExpedicion) {
        this.anoExpedicion = anoExpedicion;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getpAellido() {
        return pAellido;
    }

    public void setpAellido(String pAellido) {
        this.pAellido = pAellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
