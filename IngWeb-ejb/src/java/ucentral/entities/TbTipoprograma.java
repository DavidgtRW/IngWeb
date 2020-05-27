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
@Table(name = "TB_TIPOPROGRAMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoprograma.findAll", query = "SELECT t FROM TbTipoprograma t")
    , @NamedQuery(name = "TbTipoprograma.findByIdTipoprograma", query = "SELECT t FROM TbTipoprograma t WHERE t.idTipoprograma = :idTipoprograma")
    , @NamedQuery(name = "TbTipoprograma.findByNombre", query = "SELECT t FROM TbTipoprograma t WHERE t.nombre = :nombre")})
public class TbTipoprograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipoprograma")
    private Long idTipoprograma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "id_institucion", referencedColumnName = "id_institucion")
    @ManyToOne
    private TbInstitucion idInstitucion;

    public TbTipoprograma() {
    }

    public TbTipoprograma(Long idTipoprograma) {
        this.idTipoprograma = idTipoprograma;
    }

    public TbTipoprograma(Long idTipoprograma, String nombre) {
        this.idTipoprograma = idTipoprograma;
        this.nombre = nombre;
    }

    public Long getIdTipoprograma() {
        return idTipoprograma;
    }

    public void setIdTipoprograma(Long idTipoprograma) {
        this.idTipoprograma = idTipoprograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TbInstitucion getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(TbInstitucion idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoprograma != null ? idTipoprograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTipoprograma)) {
            return false;
        }
        TbTipoprograma other = (TbTipoprograma) object;
        if ((this.idTipoprograma == null && other.idTipoprograma != null) || (this.idTipoprograma != null && !this.idTipoprograma.equals(other.idTipoprograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbTipoprograma[ idTipoprograma=" + idTipoprograma + " ]";
    }
    
}
