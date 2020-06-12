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
import javax.inject.Named;

import javax.faces.event.ActionListener;
import ucentral.entities.TbAutoresProdbib;
import ucentral.entities.TbLineainvestigacion;
import ucentral.entities.TbProduccionbibliografica;
import ucentral.sessionbean.TbAutoresProdbibFacadeLocal;
import ucentral.sessionbean.TbLineainvestigacionFacadeLocal;
import ucentral.sessionbean.TbProduccionbibliograficaFacadeLocal;

/**
 *
 * @author GUTIERREZ
 */
@Named(value = "produccionesbibliobean")
@SessionScoped
public class produccionesbibliobean implements Serializable {

    @EJB
    private TbProduccionbibliograficaFacadeLocal produccionbibliofacade;
    @EJB
    private TbAutoresProdbibFacadeLocal otrosautoresfacade;
    @EJB
    private TbLineainvestigacionFacadeLocal lineainvesfacade;
    
    private int anopublicacion;
    private String isbn;
    private String nombreproduccion;
    private String puntos;
    private String titulomaximo;
    
    private String nombreautor;
    private String apellidoautor;

    private String areainvestigacion;
    private String nombrelinainvestigacion;
    private String descripcionlineainvestigacion;

    /**
     * Creates a new instance of produccionesbibliobean
     */
    public produccionesbibliobean() {
    }
    
    public void crear(ActionListener actionListener){
        
        TbLineainvestigacion lineainves = new TbLineainvestigacion();
        Long id_investigacion = Long.valueOf(lineainvesfacade.ultimoRegistro());
        lineainves.setIdLineainvestigacion(id_investigacion);
        lineainves.setArea(areainvestigacion);
        lineainves.setNombre(nombrelinainvestigacion);
        lineainves.setDescripcion(descripcionlineainvestigacion);


        lineainvesfacade.create(lineainves);
       
        TbProduccionbibliografica produccionbli = new TbProduccionbibliografica();
        Long id_probli = Long.valueOf(produccionbibliofacade.ultimoRegistro());
        
        produccionbli.setIdProduccionbib(id_probli);
        System.out.println(id_probli);
        
        produccionbli.setIsbn(isbn);
        System.out.println(isbn);
        
        produccionbli.setAñoPublicacion(anopublicacion);
        System.out.println(anopublicacion);
       
        produccionbli.setNombre(nombreproduccion);
        produccionbli.setPuntos(Integer.parseInt(puntos));
        produccionbli.setTituloMaximo(titulomaximo);
        produccionbli.setIdLineainvestigacion(lineainves);
        
        produccionbibliofacade.create(produccionbli);
       
        
        TbAutoresProdbib otrosautores = new TbAutoresProdbib();
        Long id_otrosautores = Long.valueOf(otrosautoresfacade.ultimoRegistro());
        otrosautores.setIdAutprodbib(id_otrosautores);
        otrosautores.setNombre(nombreautor);
        otrosautores.setApellido(apellidoautor);
        otrosautores.setIdProduccionbib(produccionbli);

        otrosautoresfacade.create(otrosautores);
    
    }

    public String getNombreproduccion() {
        return nombreproduccion;
    }

    public void setNombreproduccion(String nombreproduccion) {
        this.nombreproduccion = nombreproduccion;
    }

    public int getAñopublicacion() {
        return anopublicacion;
    }

    public void setAñopublicacion(int añopublicacion) {
        this.anopublicacion = añopublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getTitulomaximo() {
        return titulomaximo;
    }

    public void setTitulomaximo(String titulomaximo) {
        this.titulomaximo = titulomaximo;
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
