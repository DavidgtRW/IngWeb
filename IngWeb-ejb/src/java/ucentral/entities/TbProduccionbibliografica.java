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
@Table(name = "TB_PRODUCCIONBIBLIOGRAFICA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbProduccionbibliografica.findAll", query = "SELECT t FROM TbProduccionbibliografica t")
    , @NamedQuery(name = "TbProduccionbibliografica.findByIdProduccionbib", query = "SELECT t FROM TbProduccionbibliografica t WHERE t.idProduccionbib = :idProduccionbib")
    , @NamedQuery(name = "TbProduccionbibliografica.findByPuntos", query = "SELECT t FROM TbProduccionbibliografica t WHERE t.puntos = :puntos")
    , @NamedQuery(name = "TbProduccionbibliografica.findByNombre", query = "SELECT t FROM TbProduccionbibliografica t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbProduccionbibliografica.findByIsbn", query = "SELECT t FROM TbProduccionbibliografica t WHERE t.isbn = :isbn")
    , @NamedQuery(name = "TbProduccionbibliografica.findByA\u00f1oPublicacion", query = "SELECT t FROM TbProduccionbibliografica t WHERE t.a\u00f1oPublicacion = :a\u00f1oPublicacion")
    , @NamedQuery(name = "TbProduccionbibliografica.findByTituloMaximo", query = "SELECT t FROM TbProduccionbibliografica t WHERE t.tituloMaximo = :tituloMaximo")})
public class TbProduccionbibliografica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_produccionbib")
    private Long idProduccionbib;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntos")
    private int puntos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "a\u00f1o_publicacion")
    private Integer añoPublicacion;
    @Size(max = 100)
    @Column(name = "titulo_maximo")
    private String tituloMaximo;
    @OneToMany(mappedBy = "idProduccionbib")
    private List<TbAutoresProdbib> tbAutoresProdbibList;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id_investigador")
    @ManyToOne
    private TbInvestigador idInvestigador;
    @JoinColumn(name = "id_lineainvestigacion", referencedColumnName = "id_lineainvestigacion")
    @ManyToOne
    private TbLineainvestigacion idLineainvestigacion;

    public TbProduccionbibliografica() {
    }

    public TbProduccionbibliografica(Long idProduccionbib) {
        this.idProduccionbib = idProduccionbib;
    }

    public TbProduccionbibliografica(Long idProduccionbib, int puntos, String nombre) {
        this.idProduccionbib = idProduccionbib;
        this.puntos = puntos;
        this.nombre = nombre;
    }

    public Long getIdProduccionbib() {
        return idProduccionbib;
    }

    public void setIdProduccionbib(Long idProduccionbib) {
        this.idProduccionbib = idProduccionbib;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
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
    public List<TbAutoresProdbib> getTbAutoresProdbibList() {
        return tbAutoresProdbibList;
    }

    public void setTbAutoresProdbibList(List<TbAutoresProdbib> tbAutoresProdbibList) {
        this.tbAutoresProdbibList = tbAutoresProdbibList;
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
        hash += (idProduccionbib != null ? idProduccionbib.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProduccionbibliografica)) {
            return false;
        }
        TbProduccionbibliografica other = (TbProduccionbibliografica) object;
        if ((this.idProduccionbib == null && other.idProduccionbib != null) || (this.idProduccionbib != null && !this.idProduccionbib.equals(other.idProduccionbib))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbProduccionbibliografica[ idProduccionbib=" + idProduccionbib + " ]";
    }
    
}
