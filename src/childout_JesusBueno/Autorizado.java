/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package childout_JesusBueno;

import java.sql.Blob;

/**
 *
 * @author DAW
 */
public class Autorizado {

    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String dni;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    private Blob foto;
    private Blob firma;
    private String parentesco;
    private Blob huella;
    private boolean denegado;

    public Autorizado(int id, String nombre,String apellidos, String correo, String telefono, String dni, Blob foto, Blob firma, String parentesco, Blob huella,boolean denegado) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.dni = dni;
        this.foto = foto;
        this.firma = firma;
        this.parentesco = parentesco;
        this.huella = huella;
        this.denegado=denegado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public Blob getFirma() {
        return firma;
    }

    public void setFirma(Blob firma) {
        this.firma = firma;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Blob getHuella() {
        return huella;
    }

    public void setHuella(Blob huella) {
        this.huella = huella;
    }

    public boolean isDenegado() {
        return denegado;
    }

    public void setDenegado(boolean denegado) {
        this.denegado = denegado;
    }
}
