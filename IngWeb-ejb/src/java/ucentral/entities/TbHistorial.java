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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "TB_HISTORIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbHistorial.findAll", query = "SELECT t FROM TbHistorial t")
    , @NamedQuery(name = "TbHistorial.findByIdHistorial", query = "SELECT t FROM TbHistorial t WHERE t.idHistorial = :idHistorial")
    , @NamedQuery(name = "TbHistorial.findByTipo", query = "SELECT t FROM TbHistorial t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "TbHistorial.findByFechaInicio", query = "SELECT t FROM TbHistorial t WHERE t.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "TbHistorial.findByFechaFin", query = "SELECT t FROM TbHistorial t WHERE t.fechaFin = :fechaFin")
    , @NamedQuery(name = "TbHistorial.findByDedicacion", query = "SELECT t FROM TbHistorial t WHERE t.dedicacion = :dedicacion")})
public class TbHistorial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_historial")
    private Long idHistorial;
    @Size(max = 150)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Size(max = 150)
    @Column(name = "dedicacion")
    private String dedicacion;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id_investigador")
    @ManyToOne
    private TbInvestigador idInvestigador;
    @OneToMany(mappedBy = "idHistorial")
    private List<TbAsignaturasimpartidas> tbAsignaturasimpartidasList;

    public TbHistorial() {
    }

    public TbHistorial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Long getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public TbInvestigador getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(TbInvestigador idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    @XmlTransient
    public List<TbAsignaturasimpartidas> getTbAsignaturasimpartidasList() {
        return tbAsignaturasimpartidasList;
    }

    public void setTbAsignaturasimpartidasList(List<TbAsignaturasimpartidas> tbAsignaturasimpartidasList) {
        this.tbAsignaturasimpartidasList = tbAsignaturasimpartidasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistorial != null ? idHistorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbHistorial)) {
            return false;
        }
        TbHistorial other = (TbHistorial) object;
        if ((this.idHistorial == null && other.idHistorial != null) || (this.idHistorial != null && !this.idHistorial.equals(other.idHistorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbHistorial[ idHistorial=" + idHistorial + " ]";
    }
    
}
