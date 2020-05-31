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
@Table(name = "TB_DIRECCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbDireccion.findAll", query = "SELECT t FROM TbDireccion t")
    , @NamedQuery(name = "TbDireccion.findByIdDireccion", query = "SELECT t FROM TbDireccion t WHERE t.idDireccion = :idDireccion")
    , @NamedQuery(name = "TbDireccion.findByCarrera", query = "SELECT t FROM TbDireccion t WHERE t.carrera = :carrera")
    , @NamedQuery(name = "TbDireccion.findByCalle", query = "SELECT t FROM TbDireccion t WHERE t.calle = :calle")})
public class TbDireccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_direccion")
    private Long idDireccion;
    @Size(max = 30)
    @Column(name = "carrera")
    private String carrera;
    @Size(max = 30)
    @Column(name = "calle")
    private String calle;
    @OneToMany(mappedBy = "idDireccion")
    private List<TbInstitucion> tbInstitucionList;
    @OneToMany(mappedBy = "idDireccion")
    private List<TbInvestigador> tbInvestigadorList;

    public TbDireccion() {
    }

    public TbDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
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

    @XmlTransient
    public List<TbInstitucion> getTbInstitucionList() {
        return tbInstitucionList;
    }

    public void setTbInstitucionList(List<TbInstitucion> tbInstitucionList) {
        this.tbInstitucionList = tbInstitucionList;
    }

    @XmlTransient
    public List<TbInvestigador> getTbInvestigadorList() {
        return tbInvestigadorList;
    }

    public void setTbInvestigadorList(List<TbInvestigador> tbInvestigadorList) {
        this.tbInvestigadorList = tbInvestigadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccion != null ? idDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbDireccion)) {
            return false;
        }
        TbDireccion other = (TbDireccion) object;
        if ((this.idDireccion == null && other.idDireccion != null) || (this.idDireccion != null && !this.idDireccion.equals(other.idDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbDireccion[ idDireccion=" + idDireccion + " ]";
    }
    
}
