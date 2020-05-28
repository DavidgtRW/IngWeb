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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "TB_INSTITUCIONPROGRAMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbInstitucionprograma.findAll", query = "SELECT t FROM TbInstitucionprograma t")
    , @NamedQuery(name = "TbInstitucionprograma.findByIdInstitucionprograma", query = "SELECT t FROM TbInstitucionprograma t WHERE t.idInstitucionprograma = :idInstitucionprograma")
    , @NamedQuery(name = "TbInstitucionprograma.findByNumerosemestre", query = "SELECT t FROM TbInstitucionprograma t WHERE t.numerosemestre = :numerosemestre")})
public class TbInstitucionprograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_institucionprograma")
    private Long idInstitucionprograma;
    @Column(name = "numerosemestre")
    private Integer numerosemestre;
    @OneToMany(mappedBy = "idInstitucionprograma")
    private List<TbInvestigadorPrograma> tbInvestigadorProgramaList;
    @JoinColumn(name = "id_institucion", referencedColumnName = "id_institucion")
    @ManyToOne
    private TbInstitucion idInstitucion;
    @JoinColumn(name = "id_programa", referencedColumnName = "id_programa")
    @ManyToOne
    private TbPrograma idPrograma;

    public TbInstitucionprograma() {
    }

    public TbInstitucionprograma(Long idInstitucionprograma) {
        this.idInstitucionprograma = idInstitucionprograma;
    }

    public Long getIdInstitucionprograma() {
        return idInstitucionprograma;
    }

    public void setIdInstitucionprograma(Long idInstitucionprograma) {
        this.idInstitucionprograma = idInstitucionprograma;
    }

    public Integer getNumerosemestre() {
        return numerosemestre;
    }

    public void setNumerosemestre(Integer numerosemestre) {
        this.numerosemestre = numerosemestre;
    }

    @XmlTransient
    public List<TbInvestigadorPrograma> getTbInvestigadorProgramaList() {
        return tbInvestigadorProgramaList;
    }

    public void setTbInvestigadorProgramaList(List<TbInvestigadorPrograma> tbInvestigadorProgramaList) {
        this.tbInvestigadorProgramaList = tbInvestigadorProgramaList;
    }

    public TbInstitucion getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(TbInstitucion idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public TbPrograma getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(TbPrograma idPrograma) {
        this.idPrograma = idPrograma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInstitucionprograma != null ? idInstitucionprograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbInstitucionprograma)) {
            return false;
        }
        TbInstitucionprograma other = (TbInstitucionprograma) object;
        if ((this.idInstitucionprograma == null && other.idInstitucionprograma != null) || (this.idInstitucionprograma != null && !this.idInstitucionprograma.equals(other.idInstitucionprograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbInstitucionprograma[ idInstitucionprograma=" + idInstitucionprograma + " ]";
    }
    
}
