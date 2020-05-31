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
@Table(name = "TB_AUTORES_ACTFORM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAutoresActform.findAll", query = "SELECT t FROM TbAutoresActform t")
    , @NamedQuery(name = "TbAutoresActform.findByIdAutactfor", query = "SELECT t FROM TbAutoresActform t WHERE t.idAutactfor = :idAutactfor")
    , @NamedQuery(name = "TbAutoresActform.findByNombre", query = "SELECT t FROM TbAutoresActform t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbAutoresActform.findByApellido", query = "SELECT t FROM TbAutoresActform t WHERE t.apellido = :apellido")})
public class TbAutoresActform implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_autactfor")
    private Long idAutactfor;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @JoinColumn(name = "id_actividadesform", referencedColumnName = "id_actividades_form")
    @ManyToOne
    private TbActividadesform idActividadesform;

    public TbAutoresActform() {
    }

    public TbAutoresActform(Long idAutactfor) {
        this.idAutactfor = idAutactfor;
    }

    public Long getIdAutactfor() {
        return idAutactfor;
    }

    public void setIdAutactfor(Long idAutactfor) {
        this.idAutactfor = idAutactfor;
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

    public TbActividadesform getIdActividadesform() {
        return idActividadesform;
    }

    public void setIdActividadesform(TbActividadesform idActividadesform) {
        this.idActividadesform = idActividadesform;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutactfor != null ? idAutactfor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAutoresActform)) {
            return false;
        }
        TbAutoresActform other = (TbAutoresActform) object;
        if ((this.idAutactfor == null && other.idAutactfor != null) || (this.idAutactfor != null && !this.idAutactfor.equals(other.idAutactfor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbAutoresActform[ idAutactfor=" + idAutactfor + " ]";
    }
    
}
