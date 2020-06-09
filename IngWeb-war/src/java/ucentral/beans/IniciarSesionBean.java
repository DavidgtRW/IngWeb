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
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import ucentral.entities.TbUsuario;
import ucentral.sessionbean.TbInvestigadorFacadeLocal;
import ucentral.sessionbean.TbUsuarioFacadeLocal;
import ucentral.utils.Util;

/**
 *
 * @author david
 */
@Named(value = "iniciarSesionBean")
@SessionScoped
public class IniciarSesionBean implements Serializable {

    @EJB
    private TbInvestigadorFacadeLocal tbInvestigadorFacadeLocal;

    @EJB
    private TbUsuarioFacadeLocal tbUsuarioFacadeLocal;

    private String nombreUsuario;
    private String contrasena;

    /**
     * Creates a new instance of iniciarSesionBean
     */
    public IniciarSesionBean() {
    }

    public String validateUsernamePassword() {
        TbUsuario usuario = tbUsuarioFacadeLocal.findByCredenciales(nombreUsuario, contrasena);
        boolean result = usuario == null;
        System.out.println("validateUsernamePassword");
        if (!result) {

            // get Http Session and store username
            HttpSession session = Util.getSession();
            session.setAttribute("usuario", usuario);
            /*
            String tipoUsuarios = usuario.getTipoUsuario();
            switch (tipoUsuarios) {
                case Usuario.TIPO_ADMIN:
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                            "Login!",
                            "Admin"));
                    return tipoUsuarios;
                case Usuario.TIPO_PROFE:
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                            "Login!",
                            "Profesor"));
                    return tipoUsuarios;
                case Usuario.TIPO_ESTUDIANTE:
                    return cambioDeRuta(usuario);
                default:
                    return "NO EXISTE ESE USUARIO";
            }*/
            if (usuario.getNombre().equals("admin")) {
                return "admin";
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "Invalid Login!",
                        "Please Try Again!"));

                // invalidate session, and redirect to other pages
                //message = "Invalid Login. Please Try Again!";
                System.out.println("validateUsernamePassword");
                return "";

            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Invalid Login!",
                    "Please Try Again!"));

            // invalidate session, and redirect to other pages
            //message = "Invalid Login. Please Try Again!";
            System.out.println("validateUsernamePassword");
            return "";
        }

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

}
