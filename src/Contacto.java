
import java.util.ArrayList;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thoma
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String direccion;
    private String estadiCivil;
    
    
    
    public Contacto(){
        
    }
    
    public void eliminar(){
        
    }

    public Contacto(String nombre, String apellido, String telefono, String correo, String direccion, String estadiCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.estadiCivil = estadiCivil;
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the estadiCivil
     */
    public String getEstadiCivil() {
        return estadiCivil;
    }

    /**
     * @param estadiCivil the estadiCivil to set
     */
    public void setEstadiCivil(String estadiCivil) {
        this.estadiCivil = estadiCivil;
    }
    
}
