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
@Table(name = "TB_AUTORES_PRODTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAutoresProdta.findAll", query = "SELECT t FROM TbAutoresProdta t")
    , @NamedQuery(name = "TbAutoresProdta.findByIdAutprodta", query = "SELECT t FROM TbAutoresProdta t WHERE t.idAutprodta = :idAutprodta")
    , @NamedQuery(name = "TbAutoresProdta.findByNombre", query = "SELECT t FROM TbAutoresProdta t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbAutoresProdta.findByApellido", query = "SELECT t FROM TbAutoresProdta t WHERE t.apellido = :apellido")})
public class TbAutoresProdta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_autprodta")
    private Long idAutprodta;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @JoinColumn(name = "id_produccionta", referencedColumnName = "id_produccionta")
    @ManyToOne
    private TbProduccionTA idProduccionta;

    public TbAutoresProdta() {
    }

    public TbAutoresProdta(Long idAutprodta) {
        this.idAutprodta = idAutprodta;
    }

    public Long getIdAutprodta() {
        return idAutprodta;
    }

    public void setIdAutprodta(Long idAutprodta) {
        this.idAutprodta = idAutprodta;
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

    public TbProduccionTA getIdProduccionta() {
        return idProduccionta;
    }

    public void setIdProduccionta(TbProduccionTA idProduccionta) {
        this.idProduccionta = idProduccionta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutprodta != null ? idAutprodta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAutoresProdta)) {
            return false;
        }
        TbAutoresProdta other = (TbAutoresProdta) object;
        if ((this.idAutprodta == null && other.idAutprodta != null) || (this.idAutprodta != null && !this.idAutprodta.equals(other.idAutprodta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbAutoresProdta[ idAutprodta=" + idAutprodta + " ]";
    }
    
}
