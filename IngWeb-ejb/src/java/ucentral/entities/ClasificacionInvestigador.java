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
@Table(name = "clasificacion_investigador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClasificacionInvestigador.findAll", query = "SELECT c FROM ClasificacionInvestigador c")
    , @NamedQuery(name = "ClasificacionInvestigador.findByIdclasificacion", query = "SELECT c FROM ClasificacionInvestigador c WHERE c.idclasificacion = :idclasificacion")
    , @NamedQuery(name = "ClasificacionInvestigador.findByNombre", query = "SELECT c FROM ClasificacionInvestigador c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "ClasificacionInvestigador.findByPuntos", query = "SELECT c FROM ClasificacionInvestigador c WHERE c.puntos = :puntos")})
public class ClasificacionInvestigador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclasificacion")
    private Long idclasificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntos")
    private int puntos;
    @OneToMany(mappedBy = "idclasificacion")
    private List<Investigador> investigadorList;

    public ClasificacionInvestigador() {
    }

    public ClasificacionInvestigador(Long idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public ClasificacionInvestigador(Long idclasificacion, String nombre, int puntos) {
        this.idclasificacion = idclasificacion;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public Long getIdclasificacion() {
        return idclasificacion;
    }

    public void setIdclasificacion(Long idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
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
        hash += (idclasificacion != null ? idclasificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasificacionInvestigador)) {
            return false;
        }
        ClasificacionInvestigador other = (ClasificacionInvestigador) object;
        if ((this.idclasificacion == null && other.idclasificacion != null) || (this.idclasificacion != null && !this.idclasificacion.equals(other.idclasificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.ClasificacionInvestigador[ idclasificacion=" + idclasificacion + " ]";
    }
    
}
