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
@Table(name = "datos_hoja_vida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosHojaVida.findAll", query = "SELECT d FROM DatosHojaVida d")
    , @NamedQuery(name = "DatosHojaVida.findByIddatoshv", query = "SELECT d FROM DatosHojaVida d WHERE d.iddatoshv = :iddatoshv")
    , @NamedQuery(name = "DatosHojaVida.findByDescripcion", query = "SELECT d FROM DatosHojaVida d WHERE d.descripcion = :descripcion")})
public class DatosHojaVida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddatoshv")
    private Long iddatoshv;
    @Size(max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idhojavida", referencedColumnName = "idhojavida")
    @ManyToOne(optional = false)
    private HojaVida idhojavida;
    @JoinColumn(name = "idtipo", referencedColumnName = "idtipo")
    @ManyToOne(optional = false)
    private TipoDato idtipo;

    public DatosHojaVida() {
    }

    public DatosHojaVida(Long iddatoshv) {
        this.iddatoshv = iddatoshv;
    }

    public Long getIddatoshv() {
        return iddatoshv;
    }

    public void setIddatoshv(Long iddatoshv) {
        this.iddatoshv = iddatoshv;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public HojaVida getIdhojavida() {
        return idhojavida;
    }

    public void setIdhojavida(HojaVida idhojavida) {
        this.idhojavida = idhojavida;
    }

    public TipoDato getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(TipoDato idtipo) {
        this.idtipo = idtipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddatoshv != null ? iddatoshv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosHojaVida)) {
            return false;
        }
        DatosHojaVida other = (DatosHojaVida) object;
        if ((this.iddatoshv == null && other.iddatoshv != null) || (this.iddatoshv != null && !this.iddatoshv.equals(other.iddatoshv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.DatosHojaVida[ iddatoshv=" + iddatoshv + " ]";
    }
    
}
