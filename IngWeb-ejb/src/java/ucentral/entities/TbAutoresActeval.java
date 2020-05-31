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
@Table(name = "TB_AUTORES_ACTEVAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAutoresActeval.findAll", query = "SELECT t FROM TbAutoresActeval t")
    , @NamedQuery(name = "TbAutoresActeval.findByIdAutacteval", query = "SELECT t FROM TbAutoresActeval t WHERE t.idAutacteval = :idAutacteval")
    , @NamedQuery(name = "TbAutoresActeval.findByNombre", query = "SELECT t FROM TbAutoresActeval t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbAutoresActeval.findByApellido", query = "SELECT t FROM TbAutoresActeval t WHERE t.apellido = :apellido")})
public class TbAutoresActeval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_autacteval")
    private Long idAutacteval;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @JoinColumn(name = "id_actividadeseval", referencedColumnName = "id_actividadeseval")
    @ManyToOne
    private TbActividadesevaluador idActividadeseval;

    public TbAutoresActeval() {
    }

    public TbAutoresActeval(Long idAutacteval) {
        this.idAutacteval = idAutacteval;
    }

    public Long getIdAutacteval() {
        return idAutacteval;
    }

    public void setIdAutacteval(Long idAutacteval) {
        this.idAutacteval = idAutacteval;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TbActividadesevaluador getIdActividadeseval() {
        return idActividadeseval;
    }

    public void setIdActividadeseval(TbActividadesevaluador idActividadeseval) {
        this.idActividadeseval = idActividadeseval;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutacteval != null ? idAutacteval.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAutoresActeval)) {
            return false;
        }
        TbAutoresActeval other = (TbAutoresActeval) object;
        if ((this.idAutacteval == null && other.idAutacteval != null) || (this.idAutacteval != null && !this.idAutacteval.equals(other.idAutacteval))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbAutoresActeval[ idAutacteval=" + idAutacteval + " ]";
    }
    
}
