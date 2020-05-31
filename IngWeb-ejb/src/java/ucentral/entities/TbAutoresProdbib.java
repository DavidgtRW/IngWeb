/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "TB_AUTORES_PRODBIB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAutoresProdbib.findAll", query = "SELECT t FROM TbAutoresProdbib t")
    , @NamedQuery(name = "TbAutoresProdbib.findByIdAutprodbib", query = "SELECT t FROM TbAutoresProdbib t WHERE t.idAutprodbib = :idAutprodbib")
    , @NamedQuery(name = "TbAutoresProdbib.findByNombre", query = "SELECT t FROM TbAutoresProdbib t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbAutoresProdbib.findByApellido", query = "SELECT t FROM TbAutoresProdbib t WHERE t.apellido = :apellido")})
public class TbAutoresProdbib implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_autprodbib")
    private Long idAutprodbib;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @JoinColumn(name = "id_produccionbib", referencedColumnName = "id_produccionbib")
    @ManyToOne
    private TbProduccionbibliografica idProduccionbib;

    public TbAutoresProdbib() {
    }

    public TbAutoresProdbib(Long idAutprodbib) {
        this.idAutprodbib = idAutprodbib;
    }

    public Long getIdAutprodbib() {
        return idAutprodbib;
    }

    public void setIdAutprodbib(Long idAutprodbib) {
        this.idAutprodbib = idAutprodbib;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TbProduccionbibliografica getIdProduccionbib() {
        return idProduccionbib;
    }

    public void setIdProduccionbib(TbProduccionbibliografica idProduccionbib) {
        this.idProduccionbib = idProduccionbib;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutprodbib != null ? idAutprodbib.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAutoresProdbib)) {
            return false;
        }
        TbAutoresProdbib other = (TbAutoresProdbib) object;
        if ((this.idAutprodbib == null && other.idAutprodbib != null) || (this.idAutprodbib != null && !this.idAutprodbib.equals(other.idAutprodbib))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbAutoresProdbib[ idAutprodbib=" + idAutprodbib + " ]";
    }
    
}
