/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.beans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.servlet.http.HttpSession;
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbUsuario;
import ucentral.sessionbean.TbInvestigadorFacade;
import ucentral.sessionbean.TbInvestigadorFacadeLocal;
import ucentral.utils.Util;

/**
 *
 * @author david
 */
@Named(value = "pantallaPrincipalInvestigadorBean")
@SessionScoped
public class PantallaPrincipalInvestigadorBean implements Serializable{
    
    private TbUsuario usuario;
    private TbInvestigador investigador;

    @EJB
    private TbInvestigadorFacadeLocal tbInvestigadorFacadeLocal;
    /**
     * Creates a new instance of PantallaPrincipalInvestigadorBean
     */
    public PantallaPrincipalInvestigadorBean() {
    }
    
    public void inicializar(ActionEvent actionEvent){
        
        System.out.println("INICIO inicializar");
        
        usuario = new TbUsuario();
        
        HttpSession session = Util.getSession();
        usuario = (TbUsuario) session.getAttribute("usuario");
        
        investigador = new TbInvestigador();
        investigador = tbInvestigadorFacadeLocal.findByUsuario(usuario.getIdUsuario());
        
        System.out.println("INVESTIGADOR:"+investigador.getNombre());
        
    }

    public TbUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TbUsuario usuario) {
        this.usuario = usuario;
    }

    public TbInvestigador getInvestigador() {
        usuario = new TbUsuario();
        
        HttpSession session = Util.getSession();
        usuario = (TbUsuario) session.getAttribute("usuario");
        
        investigador = new TbInvestigador();
        investigador = tbInvestigadorFacadeLocal.findByUsuario(usuario.getIdUsuario());
        return investigador;
    }

    public void setInvestigador(TbInvestigador investigador) {
        this.investigador = investigador;
    }
    
    
    
}
