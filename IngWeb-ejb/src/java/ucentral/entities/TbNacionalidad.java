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
@Table(name = "TB_NACIONALIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbNacionalidad.findAll", query = "SELECT t FROM TbNacionalidad t")
    , @NamedQuery(name = "TbNacionalidad.findByIdNacionalidad", query = "SELECT t FROM TbNacionalidad t WHERE t.idNacionalidad = :idNacionalidad")
    , @NamedQuery(name = "TbNacionalidad.findByNombrePais", query = "SELECT t FROM TbNacionalidad t WHERE t.nombrePais = :nombrePais")})
public class TbNacionalidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nacionalidad")
    private Long idNacionalidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre_pais")
    private String nombrePais;
    @OneToMany(mappedBy = "idNacionalidad")
    private List<TbInvestigador> tbInvestigadorList;

    public TbNacionalidad() {
    }

    public TbNacionalidad(Long idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public TbNacionalidad(Long idNacionalidad, String nombrePais) {
        this.idNacionalidad = idNacionalidad;
        this.nombrePais = nombrePais;
    }

    public Long getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Long idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
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
        hash += (idNacionalidad != null ? idNacionalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbNacionalidad)) {
            return false;
        }
        TbNacionalidad other = (TbNacionalidad) object;
        if ((this.idNacionalidad == null && other.idNacionalidad != null) || (this.idNacionalidad != null && !this.idNacionalidad.equals(other.idNacionalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbNacionalidad[ idNacionalidad=" + idNacionalidad + " ]";
    }
    
}
