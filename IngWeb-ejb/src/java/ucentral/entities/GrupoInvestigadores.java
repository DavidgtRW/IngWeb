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
@Table(name = "grupo_investigadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupoInvestigadores.findAll", query = "SELECT g FROM GrupoInvestigadores g")
    , @NamedQuery(name = "GrupoInvestigadores.findByIdgrupo", query = "SELECT g FROM GrupoInvestigadores g WHERE g.idgrupo = :idgrupo")
    , @NamedQuery(name = "GrupoInvestigadores.findByNombre", query = "SELECT g FROM GrupoInvestigadores g WHERE g.nombre = :nombre")})
public class GrupoInvestigadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgrupo")
    private Long idgrupo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idgrupo")
    private List<Investigador> investigadorList;

    public GrupoInvestigadores() {
    }

    public GrupoInvestigadores(Long idgrupo) {
        this.idgrupo = idgrupo;
    }

    public GrupoInvestigadores(Long idgrupo, String nombre) {
        this.idgrupo = idgrupo;
        this.nombre = nombre;
    }

    public Long getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Long idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash += (idgrupo != null ? idgrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoInvestigadores)) {
            return false;
        }
        GrupoInvestigadores other = (GrupoInvestigadores) object;
        if ((this.idgrupo == null && other.idgrupo != null) || (this.idgrupo != null && !this.idgrupo.equals(other.idgrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.GrupoInvestigadores[ idgrupo=" + idgrupo + " ]";
    }
    
}
