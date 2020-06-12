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
import javax.faces.event.ActionListener;
import ucentral.entities.TbAutoresProdta;
import ucentral.entities.TbLineainvestigacion;
import ucentral.entities.TbProduccionTA;
import ucentral.sessionbean.TbAutoresProdtaFacadeLocal;
import ucentral.sessionbean.TbLineainvestigacionFacadeLocal;
import ucentral.sessionbean.TbProduccionTAFacadeLocal;

/**
 *
 * @author GUTIERREZ
 */
@Named(value = "produccionTAbean")
@SessionScoped
public class produccionTAbean implements Serializable {
    
    @EJB
    private TbProduccionTAFacadeLocal produccionfacade;
    @EJB
    private TbAutoresProdtaFacadeLocal otrosautoresfacade;
    @EJB
    private TbLineainvestigacionFacadeLocal lineainvesfacade;;

    private String nombrepro;
    private String puntos;
    private String resumenpro;
    private String tipopro;
    private String titulomax;

    private String nombreautor;
    private String apellidoautor;

    private String areainvestigacion;
    private String nombrelinainvestigacion;
    private String descripcionlineainvestigacion;

    /**
     * Creates a new instance of produccionTAbean
     */
    public produccionTAbean() {
    }
    
     public void crear(ActionListener actionListener){
        
        TbLineainvestigacion lineainves = new TbLineainvestigacion();
        Long id_investigacion = Long.valueOf(lineainvesfacade.ultimoRegistro());
        lineainves.setIdLineainvestigacion(id_investigacion);
        lineainves.setArea(areainvestigacion);
        lineainves.setNombre(nombrelinainvestigacion);
        lineainves.setDescripcion(descripcionlineainvestigacion);


        lineainvesfacade.create(lineainves);
       
        TbProduccionTA produccionta = new TbProduccionTA();
         Long id_produccionta = Long.valueOf(produccionfacade.ultimoRegistro());
         produccionta.setIdProduccionta(id_produccionta);
         produccionta.setNombre(nombrepro);
         produccionta.setResumen(resumenpro);
         produccionta.setTipoProduccion(tipopro);
         produccionta.setTituloMaximo(titulomax);
         produccionta.setPuntos(Integer.parseInt(puntos));
         produccionta.setIdLineainvestigacion(lineainves);
         
         produccionfacade.create(produccionta);
       
        
        TbAutoresProdta otrosautores = new TbAutoresProdta();
        Long id_otrosautores = Long.valueOf(otrosautoresfacade.ultimoRegistro());
        otrosautores.setIdAutprodta(id_otrosautores);
        otrosautores.setNombre(nombreautor);
        otrosautores.setApellido(apellidoautor);
        otrosautores.setIdProduccionta(produccionta);


        otrosautoresfacade.create(otrosautores);
    
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getResumenpro() {
        return resumenpro;
    }

    public void setResumenpro(String resumenpro) {
        this.resumenpro = resumenpro;
    }

    public String getTipopro() {
        return tipopro;
    }

    public void setTipopro(String tipopro) {
        this.tipopro = tipopro;
    }

    public String getTitulomax() {
        return titulomax;
    }

    public void setTitulomax(String titulomax) {
        this.titulomax = titulomax;
    }

    public String getNombreautor() {
        return nombreautor;
    }

    public void setNombreautor(String nombreautor) {
        this.nombreautor = nombreautor;
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
