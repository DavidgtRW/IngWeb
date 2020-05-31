/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "TB_ASIGNATURAS_PROGRAMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAsignaturasPrograma.findAll", query = "SELECT t FROM TbAsignaturasPrograma t")
    , @NamedQuery(name = "TbAsignaturasPrograma.findByIdAsignaturasprog", query = "SELECT t FROM TbAsignaturasPrograma t WHERE t.idAsignaturasprog = :idAsignaturasprog")
    , @NamedQuery(name = "TbAsignaturasPrograma.findByNombre", query = "SELECT t FROM TbAsignaturasPrograma t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbAsignaturasPrograma.findByNumeroHoras", query = "SELECT t FROM TbAsignaturasPrograma t WHERE t.numeroHoras = :numeroHoras")})
public class TbAsignaturasPrograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_asignaturasprog")
    private Long idAsignaturasprog;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "numero_horas")
    private Integer numeroHoras;
    @JoinColumn(name = "id_programa", referencedColumnName = "id_programa")
    @ManyToOne
    private TbPrograma idPrograma;

    public TbAsignaturasPrograma() {
    }

    public TbAsignaturasPrograma(Long idAsignaturasprog) {
        this.idAsignaturasprog = idAsignaturasprog;
    }

    public Long getIdAsignaturasprog() {
        return idAsignaturasprog;
    }

    public void setIdAsignaturasprog(Long idAsignaturasprog) {
        this.idAsignaturasprog = idAsignaturasprog;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(Integer numeroHoras) {
        this.numeroHoras = numeroHoras;
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
        hash += (idAsignaturasprog != null ? idAsignaturasprog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAsignaturasPrograma)) {
            return false;
        }
        TbAsignaturasPrograma other = (TbAsignaturasPrograma) object;
        if ((this.idAsignaturasprog == null && other.idAsignaturasprog != null) || (this.idAsignaturasprog != null && !this.idAsignaturasprog.equals(other.idAsignaturasprog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbAsignaturasPrograma[ idAsignaturasprog=" + idAsignaturasprog + " ]";
    }
    
}
