/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author david
 */
@Named(value = "confirmarActualizarTablaInvestigadoresBean")
@SessionScoped
public class ConfirmarActualizarTablaInvestigadoresBean implements Serializable {

    /**
     * Creates a new instance of ConfirmarActualizarTablaInvestigadoresBean
     */
    public ConfirmarActualizarTablaInvestigadoresBean() {
    }
    
    public String regresar(){
        return "actualizar";
    }
    
}
