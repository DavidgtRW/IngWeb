/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.beans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionListener;
import ucentral.entities.TbArticulospublicados;
import ucentral.entities.TbAutoresArtpubl;
import ucentral.entities.TbLineainvestigacion;
import ucentral.sessionbean.TbArticulospublicadosFacadeLocal;
import ucentral.sessionbean.TbAutoresArtpublFacadeLocal;
import ucentral.sessionbean.TbLineainvestigacionFacadeLocal;


/**
 *
 * @author GUTIERREZ
 */
@Named(value = "articulospublicadobean")
@SessionScoped
public class articulospublicadobean implements Serializable {

    @EJB
    private TbArticulospublicadosFacadeLocal articulopublifacade;  
    @EJB
    private TbAutoresArtpublFacadeLocal otrosautoresfacade;
    @EJB
    private TbLineainvestigacionFacadeLocal lineainvesfacade;

    private String resumen;
    private String revista_publ;
    private String tipo;
    private String titulo;
    private int aniopublicacion;
    private String isbn;
    private String nombrearticulo;
    private String puntos;
    private String titulomaximo;
    private String numeropagina;

    private String nombreautor;
    private String apellidoautor;

    private String areainvestigacion;
    private String nombrelinainvestigacion;
    private String descripcionlineainvestigacion;

    /**
     * Creates a new instance of articulospublicadobean
     */
    public articulospublicadobean() {
    }

    public void crear(ActionListener actionListener) {
        
        TbLineainvestigacion lineainves = new TbLineainvestigacion();
        Long id_investigacion = Long.valueOf(lineainvesfacade.ultimoRegistro());
        lineainves.setIdLineainvestigacion(id_investigacion);
        lineainves.setArea(areainvestigacion);
        lineainves.setNombre(nombrelinainvestigacion);
        lineainves.setDescripcion(descripcionlineainvestigacion);

        lineainvesfacade.create(lineainves);

        TbArticulospublicados articulopub = new TbArticulospublicados();
        Long id_articulopub = Long.valueOf(articulopublifacade.ultimoRegistro());
        articulopub.setIdArticulospub(id_articulopub);
        articulopub.setTitulo(titulo);
        articulopub.setResumen(resumen);
        articulopub.setTipo(tipo);
        articulopub.setRevistaPubl(revista_publ);
        articulopub.setNombre(nombrearticulo);
        articulopub.setIsbn(isbn);
        articulopub.setNumeroPaginas(Integer.parseInt(numeropagina));
        articulopub.setAñoPublicacion(aniopublicacion);
        articulopub.setTituloMaximo(titulomaximo);
        articulopub.setPuntos(Integer.parseInt(puntos));
        articulopub.setIdLineainvestigacion(lineainves);
        


        articulopublifacade.create(articulopub);

        
  

        TbAutoresArtpubl otrosautores = new TbAutoresArtpubl();
        Long id_otrosautores = Long.valueOf(otrosautoresfacade.ultimoRegistro());
        otrosautores.setIdAutartpubl(id_otrosautores);
        otrosautores.setNombre(nombreautor);
        otrosautores.setApellido(apellidoautor);
        otrosautores.setIdArticulospub(articulopub);

        otrosautoresfacade.create(otrosautores);
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getRevista_publ() {
        return revista_publ;
    }

    public void setRevista_publ(String revista_publ) {
        this.revista_publ = revista_publ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniopublicacion() {
        return aniopublicacion;
    }

    public void setAniopublicacion(int aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombrearticulo() {
        return nombrearticulo;
    }

    public void setNombrearticulo(String nombrearticulo) {
        this.nombrearticulo = nombrearticulo;
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

    public String getNumeropagina() {
        return numeropagina;
    }

    public void setNumeropagina(String numeropagina) {
        this.numeropagina = numeropagina;
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
