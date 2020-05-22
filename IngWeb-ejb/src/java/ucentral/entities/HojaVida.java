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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "hoja_vida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HojaVida.findAll", query = "SELECT h FROM HojaVida h")
    , @NamedQuery(name = "HojaVida.findByIdhojavida", query = "SELECT h FROM HojaVida h WHERE h.idhojavida = :idhojavida")
    , @NamedQuery(name = "HojaVida.findByPuntostotales", query = "SELECT h FROM HojaVida h WHERE h.puntostotales = :puntostotales")})
public class HojaVida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idhojavida")
    private Long idhojavida;
    @Column(name = "puntostotales")
    private Integer puntostotales;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhojavida")
    private List<DatosHojaVida> datosHojaVidaList;
    @JoinColumn(name = "idinvestigador", referencedColumnName = "idinvestigador")
    @ManyToOne(optional = false)
    private Investigador idinvestigador;

    public HojaVida() {
    }

    public HojaVida(Long idhojavida) {
        this.idhojavida = idhojavida;
    }

    public Long getIdhojavida() {
        return idhojavida;
    }

    public void setIdhojavida(Long idhojavida) {
        this.idhojavida = idhojavida;
    }

    public Integer getPuntostotales() {
        return puntostotales;
    }

    public void setPuntostotales(Integer puntostotales) {
        this.puntostotales = puntostotales;
    }

    @XmlTransient
    public List<DatosHojaVida> getDatosHojaVidaList() {
        return datosHojaVidaList;
    }

    public void setDatosHojaVidaList(List<DatosHojaVida> datosHojaVidaList) {
        this.datosHojaVidaList = datosHojaVidaList;
    }

    public Investigador getIdinvestigador() {
        return idinvestigador;
    }

    public void setIdinvestigador(Investigador idinvestigador) {
        this.idinvestigador = idinvestigador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhojavida != null ? idhojavida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HojaVida)) {
            return false;
        }
        HojaVida other = (HojaVida) object;
        if ((this.idhojavida == null && other.idhojavida != null) || (this.idhojavida != null && !this.idhojavida.equals(other.idhojavida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.HojaVida[ idhojavida=" + idhojavida + " ]";
    }
    
}
