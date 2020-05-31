/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "TB_INVESTIGADOR_PROGRAMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbInvestigadorPrograma.findAll", query = "SELECT t FROM TbInvestigadorPrograma t")
    , @NamedQuery(name = "TbInvestigadorPrograma.findByIdInvProg", query = "SELECT t FROM TbInvestigadorPrograma t WHERE t.idInvProg = :idInvProg")
    , @NamedQuery(name = "TbInvestigadorPrograma.findByFechaInicio", query = "SELECT t FROM TbInvestigadorPrograma t WHERE t.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "TbInvestigadorPrograma.findByFechaFin", query = "SELECT t FROM TbInvestigadorPrograma t WHERE t.fechaFin = :fechaFin")
    , @NamedQuery(name = "TbInvestigadorPrograma.findByPromedioAcademico", query = "SELECT t FROM TbInvestigadorPrograma t WHERE t.promedioAcademico = :promedioAcademico")})
public class TbInvestigadorPrograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_inv_prog")
    private Long idInvProg;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "promedio_academico")
    private Double promedioAcademico;
    @JoinColumn(name = "id_institucionprograma", referencedColumnName = "id_institucionprograma")
    @ManyToOne
    private TbInstitucionprograma idInstitucionprograma;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id_investigador")
    @ManyToOne
    private TbInvestigador idInvestigador;
    @JoinColumn(name = "id_tesis", referencedColumnName = "id_tesis")
    @ManyToOne
    private TbTesis idTesis;

    public TbInvestigadorPrograma() {
    }

    public TbInvestigadorPrograma(Long idInvProg) {
        this.idInvProg = idInvProg;
    }

    public Long getIdInvProg() {
        return idInvProg;
    }

    public void setIdInvProg(Long idInvProg) {
        this.idInvProg = idInvProg;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(Double promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }

    public TbInstitucionprograma getIdInstitucionprograma() {
        return idInstitucionprograma;
    }

    public void setIdInstitucionprograma(TbInstitucionprograma idInstitucionprograma) {
        this.idInstitucionprograma = idInstitucionprograma;
    }

    public TbInvestigador getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(TbInvestigador idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public TbTesis getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(TbTesis idTesis) {
        this.idTesis = idTesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInvProg != null ? idInvProg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbInvestigadorPrograma)) {
            return false;
        }
        TbInvestigadorPrograma other = (TbInvestigadorPrograma) object;
        if ((this.idInvProg == null && other.idInvProg != null) || (this.idInvProg != null && !this.idInvProg.equals(other.idInvProg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbInvestigadorPrograma[ idInvProg=" + idInvProg + " ]";
    }
    
}
