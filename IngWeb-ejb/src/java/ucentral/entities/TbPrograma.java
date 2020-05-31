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
@Table(name = "TB_PROGRAMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPrograma.findAll", query = "SELECT t FROM TbPrograma t")
    , @NamedQuery(name = "TbPrograma.findByIdPrograma", query = "SELECT t FROM TbPrograma t WHERE t.idPrograma = :idPrograma")
    , @NamedQuery(name = "TbPrograma.findByNombre", query = "SELECT t FROM TbPrograma t WHERE t.nombre = :nombre")})
public class TbPrograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_programa")
    private Long idPrograma;
    @Size(max = 150)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idPrograma")
    private List<TbAsignaturasPrograma> tbAsignaturasProgramaList;
    @OneToMany(mappedBy = "idPrograma")
    private List<TbInstitucionprograma> tbInstitucionprogramaList;

    public TbPrograma() {
    }

    public TbPrograma(Long idPrograma) {
        this.idPrograma = idPrograma;
    }

    public Long getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Long idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<TbAsignaturasPrograma> getTbAsignaturasProgramaList() {
        return tbAsignaturasProgramaList;
    }

    public void setTbAsignaturasProgramaList(List<TbAsignaturasPrograma> tbAsignaturasProgramaList) {
        this.tbAsignaturasProgramaList = tbAsignaturasProgramaList;
    }

    @XmlTransient
    public List<TbInstitucionprograma> getTbInstitucionprogramaList() {
        return tbInstitucionprogramaList;
    }

    public void setTbInstitucionprogramaList(List<TbInstitucionprograma> tbInstitucionprogramaList) {
        this.tbInstitucionprogramaList = tbInstitucionprogramaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrograma != null ? idPrograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPrograma)) {
            return false;
        }
        TbPrograma other = (TbPrograma) object;
        if ((this.idPrograma == null && other.idPrograma != null) || (this.idPrograma != null && !this.idPrograma.equals(other.idPrograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbPrograma[ idPrograma=" + idPrograma + " ]";
    }
    
}
