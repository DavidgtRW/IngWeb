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
@Table(name = "TB_ASIGNATURASIMPARTIDAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAsignaturasimpartidas.findAll", query = "SELECT t FROM TbAsignaturasimpartidas t")
    , @NamedQuery(name = "TbAsignaturasimpartidas.findByIdAsignaturasimp", query = "SELECT t FROM TbAsignaturasimpartidas t WHERE t.idAsignaturasimp = :idAsignaturasimp")
    , @NamedQuery(name = "TbAsignaturasimpartidas.findByNombre", query = "SELECT t FROM TbAsignaturasimpartidas t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbAsignaturasimpartidas.findByNumeroHoras", query = "SELECT t FROM TbAsignaturasimpartidas t WHERE t.numeroHoras = :numeroHoras")})
public class TbAsignaturasimpartidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_asignaturasimp")
    private Long idAsignaturasimp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "numero_horas")
    private Integer numeroHoras;
    @JoinColumn(name = "id_historial", referencedColumnName = "id_historial")
    @ManyToOne
    private TbHistorial idHistorial;
    @JoinColumn(name = "id_programa", referencedColumnName = "id_programa")
    @ManyToOne
    private TbPrograma idPrograma;

    public TbAsignaturasimpartidas() {
    }

    public TbAsignaturasimpartidas(Long idAsignaturasimp) {
        this.idAsignaturasimp = idAsignaturasimp;
    }

    public TbAsignaturasimpartidas(Long idAsignaturasimp, String nombre) {
        this.idAsignaturasimp = idAsignaturasimp;
        this.nombre = nombre;
    }

    public Long getIdAsignaturasimp() {
        return idAsignaturasimp;
    }

    public void setIdAsignaturasimp(Long idAsignaturasimp) {
        this.idAsignaturasimp = idAsignaturasimp;
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

    public TbHistorial getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(TbHistorial idHistorial) {
        this.idHistorial = idHistorial;
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
        hash += (idAsignaturasimp != null ? idAsignaturasimp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAsignaturasimpartidas)) {
            return false;
        }
        TbAsignaturasimpartidas other = (TbAsignaturasimpartidas) object;
        if ((this.idAsignaturasimp == null && other.idAsignaturasimp != null) || (this.idAsignaturasimp != null && !this.idAsignaturasimp.equals(other.idAsignaturasimp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbAsignaturasimpartidas[ idAsignaturasimp=" + idAsignaturasimp + " ]";
    }
    
}
