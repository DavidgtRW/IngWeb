/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;
import ucentral.entities.TbUsuario;
import ucentral.sessionbean.TbInvestigadorFacadeLocal;
import ucentral.sessionbean.TbUsuarioFacadeLocal;
import ucentral.utils.Util;

/**
 *
 * @author david
 */
@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {

    @EJB
    private TbInvestigadorFacadeLocal tbInvestigadorFacadeLocal;

    @EJB
    private TbUsuarioFacadeLocal tbUsuarioFacadeLocal;

    private static final String ESTADO_ACTIVO = "ACTIVO";
    private static final String ESTADO_INACTIVO = "INACTIVO";

    private List<SelectItem> estados;
    private Long idUsuario;
    private String nombreUsuario;
    private String contrasena;
    private String estado;

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
        llenarEstados();
    }

    private void llenarEstados() {
        estados = new ArrayList<>();
        estados.add(new SelectItem(ESTADO_ACTIVO, ESTADO_ACTIVO));
        estados.add(new SelectItem(ESTADO_INACTIVO, ESTADO_INACTIVO));
    }

    public String redirInicio() {
        return "inicio";
    }

    public List<TbUsuario> getUsuarios() {
        return tbUsuarioFacadeLocal.findAll();
    }

    public String validateUsernamePassword() {
        TbUsuario usuario = tbUsuarioFacadeLocal.findByCredenciales(nombreUsuario, contrasena);
        boolean result = usuario == null;
        System.out.println("validateUsernamePassword");
        if (!result) {
            if (usuario.getEstado().equals("ACTIVO")) {
                // get Http Session and store username
                HttpSession session = Util.getSession();
                session.setAttribute("usuario", usuario);

                return "investigador";
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "Usuario inactivo o incorrecto!",
                        "Intente de nuevo!"));
                return "index";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Usuario inactivo o incorrecto!",
                    "Intente de nuevo!"));

            // invalidate session, and redirect to other pages
            //message = "Invalid Login. Please Try Again!";
            System.out.println("validateUsernamePassword");
            return "index";
        }

    }

    public String registrar() {
        return "Registrar";
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<SelectItem> getEstados() {
        return estados;
    }

    public void setEstados(List<SelectItem> estados) {
        this.estados = estados;
    }

}
