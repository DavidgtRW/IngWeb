/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionListener;
import javax.inject.Named;
import ucentral.entities.TbDireccion;
import ucentral.entities.TbInstitucion;
import ucentral.entities.TbInstitucionprograma;
import ucentral.entities.TbInvestigadorPrograma;
import ucentral.entities.TbJurado;
import ucentral.entities.TbPrograma;
import ucentral.entities.TbTesis;
import ucentral.entities.TbTipoprograma;
import ucentral.sessionbean.TbDireccionFacadeLocal;
import ucentral.sessionbean.TbInstitucionFacadeLocal;
import ucentral.sessionbean.TbInstitucionprogramaFacadeLocal;
import ucentral.sessionbean.TbInvestigadorProgramaFacadeLocal;
import ucentral.sessionbean.TbJuradoFacadeLocal;
import ucentral.sessionbean.TbProgramaFacadeLocal;
import ucentral.sessionbean.TbTesisFacadeLocal;
import ucentral.sessionbean.TbTipoprogramaFacadeLocal;

/**
 *
 * @author GUTIERREZ
 */
@Named(value = "historialacademicoBe")
@SessionScoped
public class historialacademicoBean implements Serializable {

    @EJB
    private TbTipoprogramaFacadeLocal tipoprogramafacade;
    @EJB
    private TbProgramaFacadeLocal programafacade;
    @EJB
    private TbInstitucionprogramaFacadeLocal institucionprofacade;
    @EJB
    private TbInvestigadorProgramaFacadeLocal programainvestigador;
    @EJB
    private TbInstitucionFacadeLocal institucionfacade;
    @EJB
    private TbDireccionFacadeLocal direccionfacade;
    @EJB
    private TbTesisFacadeLocal tesisfacade;
    @EJB
    private TbJuradoFacadeLocal juradofacade;

    /*
    
    
    private String idInvProg;
     */
    private String tipoprograma;
    private Date fechaInicio;
    private Date fechaFin;
    private double promediocademico;
    private String numerosemestres;
    private String nombrepre;
    private String nombreinstitucion;
    private String telefonoinstitucion;
    private String correoinstitucion;
    private String resolucioninstitucion;
    private String tipoinstitucion;
    private String carrera;
    private String calle;
    private String emailjurado;
    private String nombrejurado;
    private String titulotesis;
    private String lineainvestigacion;
    private String descripciontesis;


    /*
    private String carrera;
    private String calle;
     */
    /**
     * Creates a new instance of historialacademicoBean
     */
    public historialacademicoBean() {
        System.out.println("Funciona el registro");
    }

    public void crear(ActionListener actionListener) {

        TbPrograma C = new TbPrograma();
        Long id_programa = Long.valueOf(programafacade.ultimoRegistro());
        C.setIdPrograma(id_programa);
        System.out.println(id_programa);
        C.setNombre(nombrepre);

        programafacade.create(C);

        TbTipoprograma T = new TbTipoprograma();
        Long id_tipopro = Long.valueOf(tipoprogramafacade.ultimoRegistro());
        T.setIdTipoprograma(id_tipopro);
        T.setNombre(tipoprograma);
        tipoprogramafacade.create(T);

        TbInstitucionprograma I = new TbInstitucionprograma();
        Long id_instipro = Long.valueOf(institucionprofacade.ultimoRegistro());
        I.setIdInstitucionprograma(id_instipro);
        I.setNumerosemestre(Integer.parseInt(numerosemestres));

        institucionprofacade.create(I);

        TbInvestigadorPrograma P = new TbInvestigadorPrograma();
        Long id_inpro = Long.valueOf(programainvestigador.ultimoRegistropro());
        P.setIdInvProg(id_inpro);
        P.setFechaInicio(fechaInicio);
        P.setFechaFin(fechaFin);
        P.setPromedioAcademico(promediocademico);

        programainvestigador.create(P);

        TbInstitucion R = new TbInstitucion();
        Long id_ins = Long.valueOf(institucionfacade.ultimoRegistro());
        R.setIdInstitucion(id_ins);
        R.setNombre(nombreinstitucion);
        R.setCorreo(correoinstitucion);
        R.setNumeroResolucion(Long.parseLong(resolucioninstitucion));
        R.setTelefono(telefonoinstitucion);
        R.setTipo(tipoinstitucion);

        institucionfacade.create(R);

        TbDireccion D = new TbDireccion();
        Long id_direccion = Long.valueOf(direccionfacade.ultimoRegistro());
        D.setIdDireccion(id_direccion);
        D.setCarrera(carrera);
        D.setCalle(calle);

        direccionfacade.create(D);

        TbJurado J = new TbJurado();
        Long id_jurado = Long.valueOf(juradofacade.ultimoRegistro());
        J.setIdJurado(id_jurado);
        J.setNombre(nombrejurado);
        J.setEmail(emailjurado);
        
        juradofacade.create(J);
        
        TbTesis Tesis = new TbTesis();
        Long id_tesis = Long.valueOf(tesisfacade.ultimoRegistro());
        Tesis.setIdTesis(id_tesis);
        Tesis.setTitulo(titulotesis);
        Tesis.setNombreLinea(lineainvestigacion);
        Tesis.setDescripcion(descripciontesis);
        
        tesisfacade.create(Tesis);
    }

    public String getEmailjurado() {
        return emailjurado;
    }

    public void setEmailjurado(String emailjurado) {
        this.emailjurado = emailjurado;
    }

    public String getNombrejurado() {
        return nombrejurado;
    }

    public void setNombrejurado(String nombrejurado) {
        this.nombrejurado = nombrejurado;
    }

    public String getTitulotesis() {
        return titulotesis;
    }

    public void setTitulotesis(String titulotesis) {
        this.titulotesis = titulotesis;
    }

    public String getLineainvestigacion() {
        return lineainvestigacion;
    }

    public void setLineainvestigacion(String lineainvestigacion) {
        this.lineainvestigacion = lineainvestigacion;
    }

    public String getDescripciontesis() {
        return descripciontesis;
    }

    public void setDescripciontesis(String descripciontesis) {
        this.descripciontesis = descripciontesis;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNombreinstitucion() {
        return nombreinstitucion;
    }

    public void setNombreinstitucion(String nombreinstitucion) {
        this.nombreinstitucion = nombreinstitucion;
    }

    public String getTelefonoinstitucion() {
        return telefonoinstitucion;
    }

    public void setTelefonoinstitucion(String telefonoinstitucion) {
        this.telefonoinstitucion = telefonoinstitucion;
    }

    public String getCorreoinstitucion() {
        return correoinstitucion;
    }

    public void setCorreoinstitucion(String correoinstitucion) {
        this.correoinstitucion = correoinstitucion;
    }

    public String getResolucioninstitucion() {
        return resolucioninstitucion;
    }

    public void setResolucioninstitucion(String resolucioninstitucion) {
        this.resolucioninstitucion = resolucioninstitucion;
    }

    public String getTipoinstitucion() {
        return tipoinstitucion;
    }

    public void setTipoinstitucion(String tipoinstitucion) {
        this.tipoinstitucion = tipoinstitucion;
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

    public double getPromediocademico() {
        return promediocademico;
    }

    public void setPromediocademico(double promediocademico) {
        this.promediocademico = promediocademico;
    }

    public String getNumerosemestres() {
        return numerosemestres;
    }

    public void setNumerosemestres(String numerosemestres) {
        this.numerosemestres = numerosemestres;
    }

    public String getTipoprograma() {
        return tipoprograma;
    }

    public void setTipoprograma(String tipoprograma) {
        this.tipoprograma = tipoprograma;
    }

    public String getNombrepre() {
        return nombrepre;
    }

    public void setNombrepre(String nombrepre) {
        this.nombrepre = nombrepre;
    }

}
