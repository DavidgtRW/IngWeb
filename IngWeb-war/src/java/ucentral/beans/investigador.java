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
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbLibretamilitar;
import ucentral.entities.TbNacionalidad;
import ucentral.sessionbean.TbInvestigadorFacade;
import ucentral.sessionbean.TbInvestigadorFacadeLocal;
import ucentral.sessionbean.TbLibretamilitarFacadeLocal;

/**
 *
 * @author GUTIERREZ
 */

@Named(value = "investigadorBean")
@SessionScoped
public class investigador implements Serializable{

    @EJB
    private TbInvestigadorFacadeLocal investigadorfade;
    @EJB
    private TbLibretamilitarFacadeLocal libretafacade;

    //DATOS DE LA TABLA INVESTIGADOR 
    private String id_investigador ;
    private String nombre;
    private String primerapellido;
    private String segundopellido;
    private Date fechanacimiento;
    private String fechainscripcion;
    private String tipodocumento;
    private Long numerodocumento;
    private int edad;
    private String link;
    private String correo;
    private String telefono;
    private String genero;

    //DATOS DE LA TABLA NACIONALIDAD
    private Long id_nacionalidad;
    private String nacionalidad;

    //DATOS DE LA TABLA LIBRETA MILITAR
    private String id_libreta; //Resive String
    private Long numero;
    private String clase;
    private String distrito;

    //DATOS DE LA TABLA DIRECCION
    private Long id_direccion;
    private String carrera;
    private String calle;

    /**
     * Creates a new instance of investigador
     */
    public investigador() {
        System.out.println("aaaaaaaaa");
        //this.id_investigador = "";

    }

    public void crear(ActionListener actionListener) {
        //Objeto Nacionalidad
        //TbNacionalidad N = new TbNacionalidad();
        //N.setIdNacionalidad(id_nacionalidad);
        //N.setNombrePais(nacionalidad);
        
        //Objeto Direccion
        //TbDireccion D = new TbDireccion();
        //D.setIdDireccion(id_direccion);
        //D.setCarrera(carrera);
        //D.setCalle(calle);
        
        
        
        // Objeto investigador
        TbInvestigador I = new TbInvestigador();
        //I.setIdInvestigador(Long.parseLong(id_investigador));
        //I.setNombre(nombre);
        //I.setPrimerApellido(primerapellido);
        //I.setSegundoApellido(segundopellido);
        //I.setTipoDocumento(tipodocumento);
        //I.setNoDocumento(numerodocumento);
        //I.setGenero(genero);
        //I.setFechaNacimiento(fechanacimiento);
        // I.setFechaInscripcion(null);
        
        
        //I.setEdad(edad);
        //I.setWeb(link);
        //I.setCorreo(correo);
        //I.setTelefono(telefono);
        

        //investigadorfade.create(I);
        //System.out.println("Funcionaaa! :)");
        //return "investigador";
        
        //Objeto Libreta 
        TbLibretamilitar L = new TbLibretamilitar();
        L.setIdLibretamilitar(Long.parseLong(id_libreta));
        System.out.println("ucentral.beans.investigador.crear()");
        //L.setNumero(numero);
        //L.setClase(clase);
        //L.setDistrito(distrito);
        
        libretafacade.create(L);
        
        
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    public List<TbInvestigador> getInvestigador(){
        return investigadorfade.findAll();
    }

    public String getId_investigador() {
        return id_investigador;
    }

    public void setId_investigador(String id_investigador) {
        this.id_investigador = id_investigador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundopellido() {
        return segundopellido;
    }

    public void setSegundopellido(String segundopellido) {
        this.segundopellido = segundopellido;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public Long getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(Long numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public TbInvestigadorFacadeLocal getInvestigadorfade() {
        return investigadorfade;
    }

    public void setInvestigadorfade(TbInvestigadorFacadeLocal investigadorfade) {
        this.investigadorfade = investigadorfade;
    }

    public TbLibretamilitarFacadeLocal getLibretafacade() {
        return libretafacade;
    }

    public void setLibretafacade(TbLibretamilitarFacadeLocal libretafacade) {
        this.libretafacade = libretafacade;
    }

    public String getId_libreta() {
        return id_libreta;
    }

    public void setId_libreta(String id_libreta) {
        this.id_libreta = id_libreta;
    }


    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

   

    
    
    
    
    
    
    

}
