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
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import ucentral.entities.TbInvestigador;
import ucentral.sessionbean.TbInvestigadorFacadeLocal;

/**
 *
 * @author david
 */
@Named(value = "administradorTablaInvestigadoresBean")
@SessionScoped
public class AdministradorTablaInvestigadoresBean implements Serializable {

    @EJB
    private TbInvestigadorFacadeLocal tbInvestigadorFacadeLocal;

    private List<TbInvestigador> lstTablaInvestigador;

    TbInvestigador tblInvestigador;

    private boolean visiblePanelModificar;

    private List<SelectItem> estados;

    private static final String ESTADO_ACTIVO = "ACTIVO";
    private static final String ESTADO_INACTIVO = "INACTIVO";

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private String estado;

    /**
     * Creates a new instance of AdministradorTablaInvestigadoresBean
     */
    public AdministradorTablaInvestigadoresBean() {
        inicializar();
    }

    public void inicializar() {

        visiblePanelModificar = false;
        tblInvestigador = new TbInvestigador();
        llenarEstados();

    }

    public List<TbInvestigador> getLstTablaInvestigador() {
        lstTablaInvestigador = new ArrayList<>();
        lstTablaInvestigador = tbInvestigadorFacadeLocal.findAll();
        return lstTablaInvestigador;
    }
    
    public void actualizar(ActionEvent actionEvent) {
        lstTablaInvestigador = tbInvestigadorFacadeLocal.findAll();
    }

    private void llenarEstados() {
        estados = new ArrayList<>();
        estados.add(new SelectItem(ESTADO_ACTIVO, ESTADO_ACTIVO));
        estados.add(new SelectItem(ESTADO_INACTIVO, ESTADO_INACTIVO));
    }

    public void iniciarModificar(TbInvestigador tblInvestigadorAux) {
        tblInvestigador = new TbInvestigador();
        tblInvestigador = tblInvestigadorAux;
        System.out.println("MARCA1"+tblInvestigador.getNombre());
        System.out.println("MARCA2"+tblInvestigador.getPrimerApellido());
        System.out.println("MARCA3"+tblInvestigador.getSegundoApellido());

        System.out.println("MARCA4"+tblInvestigador.getCorreo());
        
        System.out.println("MARCA4"+tblInvestigador.getIdUsuario().getEstado());

        
        nombre = tblInvestigador.getNombre();
        primerApellido = tblInvestigador.getPrimerApellido();
        segundoApellido = tblInvestigador.getSegundoApellido();
        correo = tblInvestigador.getCorreo();
        estado = tblInvestigador.getIdUsuario().getEstado();

        visiblePanelModificar = true;
    }

    public void modificar(ActionEvent actionEvent) {
        
        System.out.println("MARCA5");
        tblInvestigador.setNombre(nombre);
        tblInvestigador.setPrimerApellido(primerApellido);
        tblInvestigador.setSegundoApellido(segundoApellido);
        tblInvestigador.setCorreo(correo);
        tblInvestigador.getIdUsuario().setEstado(estado);

        tbInvestigadorFacadeLocal.modificar(tblInvestigador);
        
        lstTablaInvestigador = tbInvestigadorFacadeLocal.findAll();
        
        visiblePanelModificar = false;

    }

    public void cambiarEstado(ValueChangeEvent event) {
        estado = (String) event.getNewValue();
        System.out.println("MARCA2: " + estado);
    }

    public void setLstTablaInvestigador(List<TbInvestigador> lstTablaInvestigador) {
        this.lstTablaInvestigador = lstTablaInvestigador;
    }

    public boolean isVisiblePanelModificar() {
        return visiblePanelModificar;
    }

    public void setVisiblePanelModificar(boolean visiblePanelModificar) {
        this.visiblePanelModificar = visiblePanelModificar;
    }

    public List<SelectItem> getEstados() {
        return estados;
    }

    public void setEstados(List<SelectItem> estados) {
        this.estados = estados;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

}
