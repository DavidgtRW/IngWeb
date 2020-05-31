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
@Table(name = "TB_JURADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbJurado.findAll", query = "SELECT t FROM TbJurado t")
    , @NamedQuery(name = "TbJurado.findByIdJurado", query = "SELECT t FROM TbJurado t WHERE t.idJurado = :idJurado")
    , @NamedQuery(name = "TbJurado.findByNombre", query = "SELECT t FROM TbJurado t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbJurado.findByEmail", query = "SELECT t FROM TbJurado t WHERE t.email = :email")})
public class TbJurado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_jurado")
    private Long idJurado;
    @Size(max = 150)
    @Column(name = "nombre")
    private String nombre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 150)
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "id_tesis", referencedColumnName = "id_tesis")
    @ManyToOne
    private TbTesis idTesis;

    public TbJurado() {
    }

    public TbJurado(Long idJurado) {
        this.idJurado = idJurado;
    }

    public Long getIdJurado() {
        return idJurado;
    }

    public void setIdJurado(Long idJurado) {
        this.idJurado = idJurado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        hash += (idJurado != null ? idJurado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbJurado)) {
            return false;
        }
        TbJurado other = (TbJurado) object;
        if ((this.idJurado == null && other.idJurado != null) || (this.idJurado != null && !this.idJurado.equals(other.idJurado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbJurado[ idJurado=" + idJurado + " ]";
    }
    
}
