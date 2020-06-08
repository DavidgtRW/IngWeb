/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.beans;

import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionListener;
import ucentral.entities.TbDireccion;
import ucentral.entities.TbInstitucion;
import ucentral.entities.TbInstitucionprograma;
import ucentral.entities.TbInvestigadorPrograma;
import ucentral.entities.TbPrograma;
import ucentral.entities.TbTipoprograma;
import ucentral.sessionbean.TbDireccionFacadeLocal;
import ucentral.sessionbean.TbInstitucionFacadeLocal;
import ucentral.sessionbean.TbInstitucionprogramaFacade;
import ucentral.sessionbean.TbInstitucionprogramaFacadeLocal;
import ucentral.sessionbean.TbInvestigadorProgramaFacade;
import ucentral.sessionbean.TbInvestigadorProgramaFacadeLocal;
import ucentral.sessionbean.TbProgramaFacadeLocal;
import ucentral.sessionbean.TbTipoprogramaFacade;
import ucentral.sessionbean.TbTipoprogramaFacadeLocal;

/**
 *
 * @author GUTIERREZ
 */
@Named(value = "historialacademicoBean")
@SessionScoped
public class historialacademicoBean implements Serializable {

    @EJB
    private TbTipoprogramaFacadeLocal tipoprogramafacade;
    
    private String tipoprograma;

    /*
    @EJB
    private TbInvestigadorProgramaFacadeLocal programainvestigador;
    
    private String idInvProg;
     */
 /*
    @EJB
    private TbProgramaFacadeLocal programafacade;
     */
 /*
    
    @EJB
    private TbInstitucionFacadeLocal institucionfacade;
    @EJB
    private TbInstitucionprogramaFacadeLocal institucionprofacade;
    
    @EJB
    private TbDireccionFacadeLocal direccionfacade;

    private Date fechaInicio;
    private Date fechaFin;
    //private double promediocademico;
     */
 /*
    private String nombre;
   
    private String numerosemestres;
    private Double promediocademico;
    private String nombreinstitucion;
    private String telefonoinstitucion;
    private String correoinstitucion;
    private String resolucioninstitucion;
    private String tipoinstitucion;
    
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

        /*
        TbInvestigadorPrograma I = new TbInvestigadorPrograma();
        Long idInvProg = Long.valueOf(programainvestigador.ultimoRegistropro());
        I.setIdInvProg(idInvProg);
        System.out.println(idInvProg);
         */
 /*
        I.setFechaInicio(fechaInicio);
        System.out.println(fechaInicio);
        
        I.setFechaFin(fechaFin);
         System.out.println(fechaFin);
        programainvestigador.create(I);
         */
 /*
        TbInstitucion I = new TbInstitucion();
        Long id_institucion = Long.valueOf(institucionfacade.ultimoRegistro());
        I.setIdInstitucion(id_institucion);
        System.out.println("id_institucion");
        System.out.println(id_institucion);
        I.setNombre(nombreinstitucion);
        I.setCorreo(correoinstitucion);
        I.setNumeroResolucion(Integer.parseInt(resolucioninstitucion));
        I.setTelefono(telefonoinstitucion);
        I.setTipo(tipoinstitucion);
        institucionfacade.create(I);
        
        TbDireccion D = new TbDireccion();
        Long id_direccion = Long.valueOf(direccionfacade.ultimoRegistro());
        D.setIdDireccion(id_direccion);
        D.setCarrera(carrera);
        D.setCalle(calle);
        direccionfacade.create(D);
        
        
        
        TbInstitucionprograma O = new TbInstitucionprograma();
        Long id_institucionpro = Long.valueOf(institucionprofacade.ultimoRegistro());
        O.setIdInstitucionprograma(id_institucionpro);
        System.out.println("id_institucionpro");
        System.out.println(id_institucionpro);
       
        O.setNumerosemestre(Integer.parseInt(numerosemestres));
        
        institucionprofacade.create(O);
        
        TbPrograma C = new TbPrograma();
        Long id_programa = Long.valueOf(programafacade.ultimoRegistro());
        C.setIdPrograma(id_programa);
        System.out.println("id_programa");
        System.out.println(id_programa);
        
        C.setNombre(nombre);
        
        programafacade.create(C);
        
        
        
         */
        TbTipoprograma T = new TbTipoprograma();
        Long id_tipoprograma = Long.valueOf(tipoprogramafacade.ultimoRegistro());
        T.setIdTipoprograma(id_tipoprograma);
        System.out.println(id_tipoprograma);
        System.out.println(tipoprograma);
        //T.setNombre(tipoprograma);
        //tipoprogramafacade.create(T);
        /*
        System.out.println("id_tipoprograma");
        System.out.println(id_tipoprograma);
        
        
         */
    }

    public String getTipoprograma() {
        return tipoprograma;
    }

    public void setTipoprograma(String tipoprograma) {
        this.tipoprograma = tipoprograma;
    }
    


}
