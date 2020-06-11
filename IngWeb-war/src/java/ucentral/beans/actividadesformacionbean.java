/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.beans;

import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionListener;
import javax.inject.Named;
import ucentral.entities.TbActividadesform;
import ucentral.entities.TbAutoresActform;
import ucentral.entities.TbLineainvestigacion;
import ucentral.sessionbean.TbActividadesformFacadeLocal;
import ucentral.sessionbean.TbAutoresActformFacade;
import ucentral.sessionbean.TbAutoresActformFacadeLocal;
import ucentral.sessionbean.TbLineainvestigacionFacadeLocal;

/**
 *
 * @author GUTIERREZ
 */
@Named(value = "actividadesformacionbean")
@SessionScoped
public class actividadesformacionbean implements Serializable {

    @EJB
    private TbActividadesformFacadeLocal actividadesformfacade;
    @EJB
    private TbAutoresActformFacadeLocal otrosautoresfacade;
    @EJB
    private TbLineainvestigacionFacadeLocal lineainvesfacade;

    private String titulotrabajo;
    private Date fechaInicio;
    private Date fechaFin;
    private int puntos;

    private String nombreautor;
    private String apellidoautor;

    private String areainvestigacion;
    private String nombrelinainvestigacion;
    private String descripcionlineainvestigacion;

    /**
     * Creates a new instance of actividadesformacionbean
     */
    public actividadesformacionbean() {
    }

    public void crear(ActionListener actionListener) {
        TbLineainvestigacion lineainves = new TbLineainvestigacion();
        Long id_investigacion = Long.valueOf(lineainvesfacade.ultimoRegistro());
        lineainves.setIdLineainvestigacion(id_investigacion);
        lineainves.setArea(areainvestigacion);
        lineainves.setNombre(nombrelinainvestigacion);
        lineainves.setDescripcion(descripcionlineainvestigacion);

        lineainvesfacade.create(lineainves);

        TbActividadesform actividadesf = new TbActividadesform();
        Long id_actividadesf = Long.valueOf(actividadesformfacade.ultimoRegistro());
        actividadesf.setIdActividadesForm(id_actividadesf);
        actividadesf.setTituloTrabajo(titulotrabajo);
        actividadesf.setFechaInicio(fechaInicio);
        actividadesf.setFechaFin(fechaFin);
        actividadesf.setPuntos(puntos);
        actividadesf.setIdLineainvestigacion(lineainves);

        actividadesformfacade.create(actividadesf);

        TbAutoresActform otrosautores = new TbAutoresActform();
        Long id_otrosautores = Long.valueOf(otrosautoresfacade.ultimoRegistro());
        otrosautores.setIdAutactfor(id_otrosautores);
        otrosautores.setNombre(nombreautor);
        otrosautores.setApellido(apellidoautor);
        otrosautores.setIdActividadesform(actividadesf);

        otrosautoresfacade.create(otrosautores);

    }

    public String getNombreautor() {
        return nombreautor;
    }

    public void setNombreautor(String nombreautor) {
        this.nombreautor = nombreautor;
    }

    public String getTitulotrabajo() {
        return titulotrabajo;
    }

    public void setTitulotrabajo(String titulotrabajo) {
        this.titulotrabajo = titulotrabajo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getApellidoautor() {
        return apellidoautor;
    }

    public void setApellidoautor(String apellidoautor) {
        this.apellidoautor = apellidoautor;
    }

    public String getAreainvestigacion() {
        return areainvestigacion;
    }

    public void setAreainvestigacion(String areainvestigacion) {
        this.areainvestigacion = areainvestigacion;
    }

    public String getNombrelinainvestigacion() {
        return nombrelinainvestigacion;
    }

    public void setNombrelinainvestigacion(String nombrelinainvestigacion) {
        this.nombrelinainvestigacion = nombrelinainvestigacion;
    }

    public String getDescripcionlineainvestigacion() {
        return descripcionlineainvestigacion;
    }

    public void setDescripcionlineainvestigacion(String descripcionlineainvestigacion) {
        this.descripcionlineainvestigacion = descripcionlineainvestigacion;
    }

}
