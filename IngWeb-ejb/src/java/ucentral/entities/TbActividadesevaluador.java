/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "TB_ACTIVIDADESEVALUADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbActividadesevaluador.findAll", query = "SELECT t FROM TbActividadesevaluador t")
    , @NamedQuery(name = "TbActividadesevaluador.findByIdActividadeseval", query = "SELECT t FROM TbActividadesevaluador t WHERE t.idActividadeseval = :idActividadeseval")
    , @NamedQuery(name = "TbActividadesevaluador.findByPuntos", query = "SELECT t FROM TbActividadesevaluador t WHERE t.puntos = :puntos")
    , @NamedQuery(name = "TbActividadesevaluador.findByFechaSustentacion", query = "SELECT t FROM TbActividadesevaluador t WHERE t.fechaSustentacion = :fechaSustentacion")})
public class TbActividadesevaluador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_actividadeseval")
    private Long idActividadeseval;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntos")
    private int puntos;
    @Column(name = "fecha_sustentacion")
    @Temporal(TemporalType.DATE)
    private Date fechaSustentacion;
    @OneToMany(mappedBy = "idActividadeseval")
    private List<TbAutoresActeval> tbAutoresActevalList;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id_investigador")
    @ManyToOne
    private TbInvestigador idInvestigador;
    @JoinColumn(name = "id_lineainvestigacion", referencedColumnName = "id_lineainvestigacion")
    @ManyToOne
    private TbLineainvestigacion idLineainvestigacion;

    public TbActividadesevaluador() {
    }

    public TbActividadesevaluador(Long idActividadeseval) {
        this.idActividadeseval = idActividadeseval;
    }

    public TbActividadesevaluador(Long idActividadeseval, int puntos) {
        this.idActividadeseval = idActividadeseval;
        this.puntos = puntos;
    }

    public Long getIdActividadeseval() {
        return idActividadeseval;
    }

    public void setIdActividadeseval(Long idActividadeseval) {
        this.idActividadeseval = idActividadeseval;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Date getFechaSustentacion() {
        return fechaSustentacion;
    }

    public void setFechaSustentacion(Date fechaSustentacion) {
        this.fechaSustentacion = fechaSustentacion;
    }

    @XmlTransient
    public List<TbAutoresActeval> getTbAutoresActevalList() {
        return tbAutoresActevalList;
    }

    public void setTbAutoresActevalList(List<TbAutoresActeval> tbAutoresActevalList) {
        this.tbAutoresActevalList = tbAutoresActevalList;
    }

    public TbInvestigador getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(TbInvestigador idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public TbLineainvestigacion getIdLineainvestigacion() {
        return idLineainvestigacion;
    }

    public void setIdLineainvestigacion(TbLineainvestigacion idLineainvestigacion) {
        this.idLineainvestigacion = idLineainvestigacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividadeseval != null ? idActividadeseval.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbActividadesevaluador)) {
            return false;
        }
        TbActividadesevaluador other = (TbActividadesevaluador) object;
        if ((this.idActividadeseval == null && other.idActividadeseval != null) || (this.idActividadeseval != null && !this.idActividadeseval.equals(other.idActividadeseval))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbActividadesevaluador[ idActividadeseval=" + idActividadeseval + " ]";
    }
    
}
