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
import ucentral.entities.TbAsignaturasimpartidas;
import ucentral.entities.TbDireccion;
import ucentral.entities.TbHistorial;
import ucentral.entities.TbInstitucion;
import ucentral.sessionbean.TbAsignaturasimpartidasFacadeLocal;
import ucentral.sessionbean.TbDireccionFacadeLocal;
import ucentral.sessionbean.TbHistorialFacadeLocal;
import ucentral.sessionbean.TbInstitucionFacadeLocal;

/**
 *
 * @author GUTIERREZ
 */
@Named(value = "historiallaboralbean")
@SessionScoped
public class historiallaboralbean implements Serializable {

    @EJB
    private TbHistorialFacadeLocal historialfacade;
    @EJB
    private TbAsignaturasimpartidasFacadeLocal asignaturafacade;
    @EJB
    private TbInstitucionFacadeLocal institucionfacade;
    @EJB
    private TbDireccionFacadeLocal direccionfacade;

    private Date fechaInicio;
    private Date fechaFin;
    private String dedicacion;
    private String tipo;
    private String nombreasignatura;
    private String númerodehoras;

    private String nombreinstitucion;
    private String telefonoinstitucion;
    private String correoinstitucion;
    private String tipoinstitucion;
    
    private String carrera;
    private String calle;

    /**
     * Creates a new instance of historiallaboralbean
     */
    public historiallaboralbean() {
        System.out.println("Funciona registro laboral");

    }

    public void crear(ActionListener actionListener) {
        //Objeto Nacionalidad
        TbHistorial historial = new TbHistorial();
        Long id_historial = Long.valueOf(historialfacade.ultimoRegistro());
        historial.setIdHistorial(id_historial);
        historial.setFechaInicio(fechaInicio);
        historial.setFechaFin(fechaFin);
        historial.setDedicacion(dedicacion);
        historial.setTipo(tipo);

        historialfacade.create(historial);

        TbAsignaturasimpartidas A = new TbAsignaturasimpartidas();
        Long id_asignaturas = Long.valueOf(asignaturafacade.ultimoRegistro());
        A.setIdAsignaturasimp(id_asignaturas);
        A.setNombre(nombreasignatura);
        A.setNumeroHoras(Integer.parseInt(númerodehoras));
        A.setIdHistorial(historial);

        asignaturafacade.create(A);

        
        
        TbDireccion direccion = new TbDireccion();
        Long id_direccion = Long.valueOf(direccionfacade.ultimoRegistro());
        direccion.setIdDireccion(id_direccion);
        direccion.setCarrera(carrera);
        direccion.setCalle(calle);

        direccionfacade.create(direccion);
        
        TbInstitucion institucion = new TbInstitucion();
        Long id_ins = Long.valueOf(institucionfacade.ultimoRegistro());
        institucion.setIdInstitucion(id_ins);
        institucion.setNombre(nombreinstitucion);
        institucion.setCorreo(correoinstitucion);
        institucion.setTelefono(telefonoinstitucion);
        institucion.setTipo(tipoinstitucion);
        institucion.setIdDireccion(direccion);
        
        institucionfacade.create(institucion);
        

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

    public String getTipoinstitucion() {
        return tipoinstitucion;
    }

    public void setTipoinstitucion(String tipoinstitucion) {
        this.tipoinstitucion = tipoinstitucion;
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
    
    

    public String getNombreasignatura() {
        return nombreasignatura;
    }

    public void setNombreasignatura(String nombreasignatura) {
        this.nombreasignatura = nombreasignatura;
    }

    public String getNúmerodehoras() {
        return númerodehoras;
    }

    public void setNúmerodehoras(String númerodehoras) {
        this.númerodehoras = númerodehoras;
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

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
