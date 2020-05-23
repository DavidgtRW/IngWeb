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
@Table(name = "convocatoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Convocatoria.findAll", query = "SELECT c FROM Convocatoria c")
    , @NamedQuery(name = "Convocatoria.findByIdconvocatoria", query = "SELECT c FROM Convocatoria c WHERE c.idconvocatoria = :idconvocatoria")
    , @NamedQuery(name = "Convocatoria.findByNombre", query = "SELECT c FROM Convocatoria c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Convocatoria.findByTema", query = "SELECT c FROM Convocatoria c WHERE c.tema = :tema")
    , @NamedQuery(name = "Convocatoria.findByDescripcion", query = "SELECT c FROM Convocatoria c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "Convocatoria.findByFechainicio", query = "SELECT c FROM Convocatoria c WHERE c.fechainicio = :fechainicio")
    , @NamedQuery(name = "Convocatoria.findByFechafin", query = "SELECT c FROM Convocatoria c WHERE c.fechafin = :fechafin")})
public class Convocatoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idconvocatoria")
    private Long idconvocatoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tema")
    private String tema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    @Column(name = "fechafin")
    @Temporal(TemporalType.DATE)
    private Date fechafin;
    @OneToMany(mappedBy = "idconvocatoria")
    private List<Investigador> investigadorList;

    public Convocatoria() {
    }

    public Convocatoria(Long idconvocatoria) {
        this.idconvocatoria = idconvocatoria;
    }

    public Convocatoria(Long idconvocatoria, String nombre, String tema, String descripcion) {
        this.idconvocatoria = idconvocatoria;
        this.nombre = nombre;
        this.tema = tema;
        this.descripcion = descripcion;
    }

    public Long getIdconvocatoria() {
        return idconvocatoria;
    }

    public void setIdconvocatoria(Long idconvocatoria) {
        this.idconvocatoria = idconvocatoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    @XmlTransient
    public List<Investigador> getInvestigadorList() {
        return investigadorList;
    }

    public void setInvestigadorList(List<Investigador> investigadorList) {
        this.investigadorList = investigadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconvocatoria != null ? idconvocatoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Convocatoria)) {
            return false;
        }
        Convocatoria other = (Convocatoria) object;
        if ((this.idconvocatoria == null && other.idconvocatoria != null) || (this.idconvocatoria != null && !this.idconvocatoria.equals(other.idconvocatoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.Convocatoria[ idconvocatoria=" + idconvocatoria + " ]";
    }
    
}
