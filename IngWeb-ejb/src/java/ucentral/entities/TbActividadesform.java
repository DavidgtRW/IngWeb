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
@Table(name = "TB_ACTIVIDADESFORM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbActividadesform.findAll", query = "SELECT t FROM TbActividadesform t")
    , @NamedQuery(name = "TbActividadesform.findByIdActividadesForm", query = "SELECT t FROM TbActividadesform t WHERE t.idActividadesForm = :idActividadesForm")
    , @NamedQuery(name = "TbActividadesform.findByPuntos", query = "SELECT t FROM TbActividadesform t WHERE t.puntos = :puntos")
    , @NamedQuery(name = "TbActividadesform.findByTituloTrabajo", query = "SELECT t FROM TbActividadesform t WHERE t.tituloTrabajo = :tituloTrabajo")
    , @NamedQuery(name = "TbActividadesform.findByFechaInicio", query = "SELECT t FROM TbActividadesform t WHERE t.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "TbActividadesform.findByFechaFin", query = "SELECT t FROM TbActividadesform t WHERE t.fechaFin = :fechaFin")})
public class TbActividadesform implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_actividades_form")
    private Long idActividadesForm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntos")
    private int puntos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "titulo_trabajo")
    private String tituloTrabajo;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @OneToMany(mappedBy = "idActividadesform")
    private List<TbLineainvestigacion> tbLineainvestigacionList;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id_investigador")
    @ManyToOne
    private TbInvestigador idInvestigador;
    @JoinColumn(name = "id_lineainvestigacion", referencedColumnName = "id_lineainvestigacion")
    @ManyToOne
    private TbLineainvestigacion idLineainvestigacion;

    public TbActividadesform() {
    }

    public TbActividadesform(Long idActividadesForm) {
        this.idActividadesForm = idActividadesForm;
    }

    public TbActividadesform(Long idActividadesForm, int puntos, String tituloTrabajo) {
        this.idActividadesForm = idActividadesForm;
        this.puntos = puntos;
        this.tituloTrabajo = tituloTrabajo;
    }

    public Long getIdActividadesForm() {
        return idActividadesForm;
    }

    public void setIdActividadesForm(Long idActividadesForm) {
        this.idActividadesForm = idActividadesForm;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getTituloTrabajo() {
        return tituloTrabajo;
    }

    public void setTituloTrabajo(String tituloTrabajo) {
        this.tituloTrabajo = tituloTrabajo;
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

    @XmlTransient
    public List<TbLineainvestigacion> getTbLineainvestigacionList() {
        return tbLineainvestigacionList;
    }

    public void setTbLineainvestigacionList(List<TbLineainvestigacion> tbLineainvestigacionList) {
        this.tbLineainvestigacionList = tbLineainvestigacionList;
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
        hash += (idActividadesForm != null ? idActividadesForm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbActividadesform)) {
            return false;
        }
        TbActividadesform other = (TbActividadesform) object;
        if ((this.idActividadesForm == null && other.idActividadesForm != null) || (this.idActividadesForm != null && !this.idActividadesForm.equals(other.idActividadesForm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbActividadesform[ idActividadesForm=" + idActividadesForm + " ]";
    }
    
}
