/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.beans;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author david
 */
@Named(value = "registroInvestigadorBean")
@RequestScoped
public class RegistroInvestigadorBean implements Serializable{
    
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String tipoDocuemnto;
    private String numDocumento;
    
    private String contrasena;

    /**
     * Creates a new instance of RegistroInvestigadorBean
     */
    public RegistroInvestigadorBean() {
    }
    
    public void crearUsuarioInvestigador(){
        
    }
    
    public String ingresar(){
        return "ingresar";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoDocuemnto() {
        return tipoDocuemnto;
    }

    public void setTipoDocuemnto(String tipoDocuemnto) {
        this.tipoDocuemnto = tipoDocuemnto;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
    
}
