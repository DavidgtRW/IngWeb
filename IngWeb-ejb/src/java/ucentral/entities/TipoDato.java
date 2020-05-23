/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "tipo_dato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDato.findAll", query = "SELECT t FROM TipoDato t")
    , @NamedQuery(name = "TipoDato.findByIdtipo", query = "SELECT t FROM TipoDato t WHERE t.idtipo = :idtipo")
    , @NamedQuery(name = "TipoDato.findByNombre", query = "SELECT t FROM TipoDato t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoDato.findByPuntostipo", query = "SELECT t FROM TipoDato t WHERE t.puntostipo = :puntostipo")})
public class TipoDato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipo")
    private Long idtipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntostipo")
    private int puntostipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipo")
    private List<DatosHojaVida> datosHojaVidaList;

    public TipoDato() {
    }

    public TipoDato(Long idtipo) {
        this.idtipo = idtipo;
    }

    public TipoDato(Long idtipo, String nombre, int puntostipo) {
        this.idtipo = idtipo;
        this.nombre = nombre;
        this.puntostipo = puntostipo;
    }

    public Long getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(Long idtipo) {
        this.idtipo = idtipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntostipo() {
        return puntostipo;
    }

    public void setPuntostipo(int puntostipo) {
        this.puntostipo = puntostipo;
    }

    @XmlTransient
    public List<DatosHojaVida> getDatosHojaVidaList() {
        return datosHojaVidaList;
    }

    public void setDatosHojaVidaList(List<DatosHojaVida> datosHojaVidaList) {
        this.datosHojaVidaList = datosHojaVidaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipo != null ? idtipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDato)) {
            return false;
        }
        TipoDato other = (TipoDato) object;
        if ((this.idtipo == null && other.idtipo != null) || (this.idtipo != null && !this.idtipo.equals(other.idtipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TipoDato[ idtipo=" + idtipo + " ]";
    }
    
}
