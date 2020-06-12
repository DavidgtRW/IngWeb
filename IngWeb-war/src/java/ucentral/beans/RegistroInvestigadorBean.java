/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.beans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbUsuario;
import ucentral.sessionbean.TbInvestigadorFacadeLocal;
import ucentral.sessionbean.TbUsuarioFacadeLocal;
import ucentral.swii.utilidades.UtilidadesFacade;

/**
 *
 * @author david
 */
@Named(value = "registroInvestigadorBean")
@SessionScoped
public class RegistroInvestigadorBean implements Serializable {

    @EJB
    private TbInvestigadorFacadeLocal tbInvestigadorFacadeLocal;

    @EJB
    private TbUsuarioFacadeLocal tbUsuarioFacadeLocal;
    
    @EJB
    private UtilidadesFacade utilFacade;

    private int idUsuario;
    private String contrasena;
    private String estado;

    private int idInvestigador;
    private String nombre;
    private String primerApellido;
    private String correo;
    private String tipoDocuemnto;
    private String numDocumento;

    /**
     * Creates a new instance of RegistroInvestigadorBean
     */
    public RegistroInvestigadorBean() {
        inicializar();
    }

    private void inicializar() {
        nombre = "";
        contrasena = "";
        estado = "";
        primerApellido="";
        correo="";
        tipoDocuemnto="";
        numDocumento="";
    }

    public String crearUsuarioInvestigador() {

        try {

            TbUsuario usuarioAux = new TbUsuario();

            usuarioAux.setIdUsuario(Long.valueOf(tbUsuarioFacadeLocal.ultimoRegistro()));
            usuarioAux.setNombre(generarNombreUsuario());
            usuarioAux.setEstado("ACTIVO");
            usuarioAux.setContrasena(contrasena);

            tbUsuarioFacadeLocal.create(usuarioAux);

            TbInvestigador investigadorAux = new TbInvestigador();
            investigadorAux.setIdInvestigador(Long.valueOf(tbInvestigadorFacadeLocal.ultimoRegistro()));
            investigadorAux.setNombre(nombre);
            investigadorAux.setPrimerApellido(primerApellido);
            investigadorAux.setNoDocumento(Long.valueOf(numDocumento));
            investigadorAux.setCorreo(correo);
            investigadorAux.setTipoDocumento(tipoDocuemnto);
            investigadorAux.setIdUsuario(usuarioAux);
            
            tbInvestigadorFacadeLocal.create(investigadorAux);
            
            utilFacade.enviarCorreo(correo, generarNombreUsuario(), contrasena, nombre);

        } catch (Exception e ) {
            System.out.println("ERROR crearUsuarioInvestigador"+e);
        }
        
        return "activar";
    }

    private String generarNombreUsuario() {

        String usuarioGenerado = "" + nombre.charAt(0) + "" + primerApellido
                + "" + idUsuario;

        return usuarioGenerado;
    }

    public String ingresar() {
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

    public TbInvestigadorFacadeLocal getTbInvestigadorFacadeLocal() {
        return tbInvestigadorFacadeLocal;
    }

    public void setTbInvestigadorFacadeLocal(TbInvestigadorFacadeLocal tbInvestigadorFacadeLocal) {
        this.tbInvestigadorFacadeLocal = tbInvestigadorFacadeLocal;
    }

    public TbUsuarioFacadeLocal getTbUsuarioFacadeLocal() {
        return tbUsuarioFacadeLocal;
    }

    public void setTbUsuarioFacadeLocal(TbUsuarioFacadeLocal tbUsuarioFacadeLocal) {
        this.tbUsuarioFacadeLocal = tbUsuarioFacadeLocal;
    }

    public UtilidadesFacade getUtilFacade() {
        return utilFacade;
    }

    public void setUtilFacade(UtilidadesFacade utilFacade) {
        this.utilFacade = utilFacade;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(int idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
