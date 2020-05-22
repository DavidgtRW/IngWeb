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
@Table(name = "propiedades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propiedades.findAll", query = "SELECT p FROM Propiedades p")
    , @NamedQuery(name = "Propiedades.findByIdpropiedad", query = "SELECT p FROM Propiedades p WHERE p.idpropiedad = :idpropiedad")
    , @NamedQuery(name = "Propiedades.findByDescripcion", query = "SELECT p FROM Propiedades p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Propiedades.findByValor1", query = "SELECT p FROM Propiedades p WHERE p.valor1 = :valor1")
    , @NamedQuery(name = "Propiedades.findByValor2", query = "SELECT p FROM Propiedades p WHERE p.valor2 = :valor2")})
public class Propiedades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpropiedad")
    private Long idpropiedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 100)
    @Column(name = "valor1")
    private String valor1;
    @Size(max = 100)
    @Column(name = "valor2")
    private String valor2;

    public Propiedades() {
    }

    public Propiedades(Long idpropiedad) {
        this.idpropiedad = idpropiedad;
    }

    public Propiedades(Long idpropiedad, String descripcion) {
        this.idpropiedad = idpropiedad;
        this.descripcion = descripcion;
    }

    public Long getIdpropiedad() {
        return idpropiedad;
    }

    public void setIdpropiedad(Long idpropiedad) {
        this.idpropiedad = idpropiedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpropiedad != null ? idpropiedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propiedades)) {
            return false;
        }
        Propiedades other = (Propiedades) object;
        if ((this.idpropiedad == null && other.idpropiedad != null) || (this.idpropiedad != null && !this.idpropiedad.equals(other.idpropiedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.Propiedades[ idpropiedad=" + idpropiedad + " ]";
    }
    
}
