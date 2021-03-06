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
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionListener;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import ucentral.entities.TbDireccion;
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbLibretamilitar;
import ucentral.entities.TbNacionalidad;
import ucentral.entities.TbUsuario;
import ucentral.sessionbean.TbDireccionFacadeLocal;
import ucentral.sessionbean.TbInvestigadorFacade;
import ucentral.sessionbean.TbInvestigadorFacadeLocal;
import ucentral.sessionbean.TbLibretamilitarFacadeLocal;
import ucentral.sessionbean.TbNacionalidadFacadeLocal;
import ucentral.utils.Util;

/**
 *
 * @author GUTIERREZ
 */
@Named(value = "investigadorBean")
@SessionScoped
public class investigador implements Serializable {

    @EJB
    private TbInvestigadorFacadeLocal investigadorfade;
    @EJB
    private TbLibretamilitarFacadeLocal libretafacade;
    @EJB
    private TbNacionalidadFacadeLocal nacionalidadfacade;
    @EJB
    private TbDireccionFacadeLocal direccionfacade;

    //DATOS DE LA TABLA INVESTIGADOR 
    //private String id_investigador;
    private String nombre;
    private String primerapellido;
    private String segundopellido;
    private Date fechanacimiento;
    private Date fechainscripcion;
    private String tipodocumento;
    private Long numerodocumento;
    private String edad;
    private String link;
    private String correo;
    private String telefono;
    private String genero;

    //DATOS DE LA TABLA NACIONALIDAD
    private Long id_nacionalidad;
    private String nacionalidad;

    //DATOS DE LA TABLA LIBRETA MILITAR
    private Long id_libretam; //Resive String
    private Long numero;
    private String clase;
    private String distrito;

    //DATOS DE LA TABLA DIRECCION
    private Long id_direccion;
    private String carrera;
    private String calle;
    private int idUsuario;

    /**
     * Creates a new instance of investigador
     */
    public investigador() {
        HttpSession session = Util.getSession();
        TbInvestigador inv = (TbInvestigador) session.getAttribute("investigador");
        this.setNombre(inv.getNombre());
        this.setPrimerapellido(inv.getPrimerApellido());
        this.setSegundopellido(inv.getSegundoApellido());
        this.setFechanacimiento(inv.getFechaNacimiento());
        this.setFechainscripcion(inv.getFechaInscripcion());
        this.setTipodocumento(inv.getTipoDocumento());
        this.setNumerodocumento(inv.getNoDocumento());
        if (inv.getEdad() != null) {
            this.setEdad(inv.getEdad().toString());
        }
        this.setLink(inv.getWeb());
        this.setCorreo(inv.getCorreo());
        this.setTelefono(inv.getTelefono());
        this.setGenero(inv.getGenero());
        if (inv.getIdNacionalidad() != null) {
            this.setId_nacionalidad(inv.getIdNacionalidad().getIdNacionalidad());
            this.setNacionalidad(inv.getIdNacionalidad().getNombrePais());
        }

        if (inv.getIdLibretamilitar() != null) {
            this.setId_libretam(inv.getIdLibretamilitar().getIdLibretamilitar());
            this.setNumero(inv.getIdLibretamilitar().getNumero());
            this.setClase(inv.getIdLibretamilitar().getClase());
            this.setDistrito(inv.getIdLibretamilitar().getDistrito());
        }
        if (inv.getIdDireccion()!= null) {
            this.setId_direccion(inv.getIdDireccion().getIdDireccion());
            this.setCarrera(inv.getIdDireccion().getCarrera());
            this.setCalle(inv.getIdDireccion().getCalle());
        }

    }

    public void crear(ActionListener actionListener) {
        //Objeto Nacionalidad
        try{
        HttpSession session = Util.getSession();
        TbInvestigador invAntes = (TbInvestigador) session.getAttribute("investigador");

        TbNacionalidad N = new TbNacionalidad();
        if (invAntes.getIdNacionalidad() == null) {
            
            Long id_nacionalidad = Long.valueOf(nacionalidadfacade.ultimoRegistro());
            N.setIdNacionalidad(id_nacionalidad);
            N.setNombrePais(nacionalidad);

            System.out.println("NACIONALIDAD");
            System.out.println(nacionalidad);

            nacionalidadfacade.create(N);
        } else {
            N = nacionalidadfacade.find(invAntes.getIdNacionalidad().getIdNacionalidad());
            N.setNombrePais(nacionalidad);
            nacionalidadfacade.edit(N);
        }

        //Objeto Libreta (Check)
        TbLibretamilitar L = new TbLibretamilitar();
        if (invAntes.getIdLibretamilitar() == null) {
           
            Long id_libretam = Long.valueOf(libretafacade.ultimoRegistrolibreta());
            L.setIdLibretamilitar(id_libretam);

            System.out.println("id_libreta");
            System.out.println(id_libretam);

            L.setNumero(numero);
            System.out.println("numero libreta");
            System.out.println(numero);

            L.setDistrito(distrito);
            System.out.println("distrito");
            System.out.println(distrito);

            L.setClase(clase);
            System.out.println("CLASE");
            System.out.println(clase);

            libretafacade.create(L);
        } else {
            L = libretafacade.find(invAntes.getIdLibretamilitar().getIdLibretamilitar());
            L.setNumero(numero);
            L.setDistrito(distrito);
            L.setClase(clase);
            libretafacade.edit(L);
        }

        //Objeto Direccion
        TbDireccion D = new TbDireccion();
        if (invAntes.getIdDireccion() == null) {
            Long id_direccion = Long.valueOf(direccionfacade.ultimoRegistro());
            D.setIdDireccion(id_direccion);
            D.setCarrera(carrera);
            D.setCalle(calle);
            direccionfacade.create(D);
        } else {
            D = direccionfacade.find(invAntes.getIdDireccion().getIdDireccion());
            D.setCarrera(carrera);
            D.setCalle(calle);
            direccionfacade.edit(D);
        }

        // Objeto investigador
        TbInvestigador I = new TbInvestigador();
        I.setIdInvestigador(invAntes.getIdInvestigador());

        I.setNombre(nombre);
        System.out.println("nombre _investigador");
        System.out.println(nombre);
        I.setPrimerApellido(primerapellido);
        I.setSegundoApellido(segundopellido);
        I.setTipoDocumento(tipodocumento);
        I.setNoDocumento(numerodocumento);
        I.setGenero(genero);
        I.setFechaNacimiento(fechanacimiento);
        I.setFechaInscripcion(fechainscripcion);

        I.setEdad(Integer.parseInt(edad));
        I.setWeb(link);
        I.setCorreo(correo);
        I.setTelefono(telefono);
        I.setIdDireccion(D);
        I.setIdLibretamilitar(L);
        I.setIdNacionalidad(N);
        TbUsuario usuario = (TbUsuario) session.getAttribute("usuario");
        I.setIdUsuario(usuario);
        investigadorfade.edit(I);
        session.setAttribute("investigador", I);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "El investiagor ha sido actualizado con exito!",
                    "Investigador Actualizado!"));
        //System.out.println("Funcionaaa! :)");
        //return "investigador";
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Contacte con soporte!",
                    "Ocurrio un error inesperado!"));
        }
    }

 

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getId_nacionalidad() {
        return id_nacionalidad;
    }

    public void setId_nacionalidad(Long id_nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
    }

    public Long getId_libretam() {
        return id_libretam;
    }

    public void setId_libretam(Long id_libretam) {
        this.id_libretam = id_libretam;
    }

    public Long getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }

    
    
    
    public TbDireccionFacadeLocal getDireccionfacade() {
        return direccionfacade;
    }

    public void setDireccionfacade(TbDireccionFacadeLocal direccionfacade) {
        this.direccionfacade = direccionfacade;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Date getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(Date fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public TbNacionalidadFacadeLocal getNacionalidadfacade() {
        return nacionalidadfacade;
    }

    public void setNacionalidadfacade(TbNacionalidadFacadeLocal nacionalidadfacade) {
        this.nacionalidadfacade = nacionalidadfacade;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
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

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public List<TbInvestigador> getInvestigador() {
        return investigadorfade.findAll();
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

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

}
