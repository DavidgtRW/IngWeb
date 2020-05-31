/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "TB_ARTICULOSPUBLICADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbArticulospublicados.findAll", query = "SELECT t FROM TbArticulospublicados t")
    , @NamedQuery(name = "TbArticulospublicados.findByIdArticulospub", query = "SELECT t FROM TbArticulospublicados t WHERE t.idArticulospub = :idArticulospub")
    , @NamedQuery(name = "TbArticulospublicados.findByPuntos", query = "SELECT t FROM TbArticulospublicados t WHERE t.puntos = :puntos")
    , @NamedQuery(name = "TbArticulospublicados.findByTitulo", query = "SELECT t FROM TbArticulospublicados t WHERE t.titulo = :titulo")
    , @NamedQuery(name = "TbArticulospublicados.findByResumen", query = "SELECT t FROM TbArticulospublicados t WHERE t.resumen = :resumen")
    , @NamedQuery(name = "TbArticulospublicados.findByTipo", query = "SELECT t FROM TbArticulospublicados t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "TbArticulospublicados.findByRevistaPubl", query = "SELECT t FROM TbArticulospublicados t WHERE t.revistaPubl = :revistaPubl")
    , @NamedQuery(name = "TbArticulospublicados.findByNombre", query = "SELECT t FROM TbArticulospublicados t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbArticulospublicados.findByIsbn", query = "SELECT t FROM TbArticulospublicados t WHERE t.isbn = :isbn")
    , @NamedQuery(name = "TbArticulospublicados.findByNumeroPaginas", query = "SELECT t FROM TbArticulospublicados t WHERE t.numeroPaginas = :numeroPaginas")
    , @NamedQuery(name = "TbArticulospublicados.findByA\u00f1oPublicacion", query = "SELECT t FROM TbArticulospublicados t WHERE t.a\u00f1oPublicacion = :a\u00f1oPublicacion")
    , @NamedQuery(name = "TbArticulospublicados.findByTituloMaximo", query = "SELECT t FROM TbArticulospublicados t WHERE t.tituloMaximo = :tituloMaximo")})
public class TbArticulospublicados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_articulospub")
    private Long idArticulospub;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntos")
    private int puntos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 200)
    @Column(name = "resumen")
    private String resumen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "revista_publ")
    private String revistaPubl;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "numero_paginas")
    private Integer numeroPaginas;
    @Column(name = "a\u00f1o_publicacion")
    private Integer añoPublicacion;
    @Size(max = 100)
    @Column(name = "titulo_maximo")
    private String tituloMaximo;
    @OneToMany(mappedBy = "idArticulospub")
    private List<TbAutoresArtpubl> tbAutoresArtpublList;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id_investigador")
    @ManyToOne
    private TbInvestigador idInvestigador;
    @JoinColumn(name = "id_lineainvestigacion", referencedColumnName = "id_lineainvestigacion")
    @ManyToOne
    private TbLineainvestigacion idLineainvestigacion;

    public TbArticulospublicados() {
    }

    public TbArticulospublicados(Long idArticulospub) {
        this.idArticulospub = idArticulospub;
    }

    public TbArticulospublicados(Long idArticulospub, int puntos, String titulo, String tipo, String revistaPubl) {
        this.idArticulospub = idArticulospub;
        this.puntos = puntos;
        this.titulo = titulo;
        this.tipo = tipo;
        this.revistaPubl = revistaPubl;
    }

    public Long getIdArticulospub() {
        return idArticulospub;
    }

    public void setIdArticulospub(Long idArticulospub) {
        this.idArticulospub = idArticulospub;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRevistaPubl() {
        return revistaPubl;
    }

    public void setRevistaPubl(String revistaPubl) {
        this.revistaPubl = revistaPubl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Integer getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(Integer añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getTituloMaximo() {
        return tituloMaximo;
    }

    public void setTituloMaximo(String tituloMaximo) {
        this.tituloMaximo = tituloMaximo;
    }

    @XmlTransient
    public List<TbAutoresArtpubl> getTbAutoresArtpublList() {
        return tbAutoresArtpublList;
    }

    public void setTbAutoresArtpublList(List<TbAutoresArtpubl> tbAutoresArtpublList) {
        this.tbAutoresArtpublList = tbAutoresArtpublList;
    }

    public TbInvestigador getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(TbInvestigador idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public TbLineainvestigacion getIdLineainvestigacion() {
        return idLineainvestigacion;
    }

    public void setIdLineainvestigacion(TbLineainvestigacion idLineainvestigacion) {
        this.idLineainvestigacion = idLineainvestigacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticulospub != null ? idArticulospub.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbArticulospublicados)) {
            return false;
        }
        TbArticulospublicados other = (TbArticulospublicados) object;
        if ((this.idArticulospub == null && other.idArticulospub != null) || (this.idArticulospub != null && !this.idArticulospub.equals(other.idArticulospub))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbArticulospublicados[ idArticulospub=" + idArticulospub + " ]";
    }
    
}
