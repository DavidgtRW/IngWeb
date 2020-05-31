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
@Table(name = "TB_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuario.findAll", query = "SELECT t FROM TbUsuario t")
    , @NamedQuery(name = "TbUsuario.findByIdUsuario", query = "SELECT t FROM TbUsuario t WHERE t.idUsuario = :idUsuario")
    , @NamedQuery(name = "TbUsuario.findByNombre", query = "SELECT t FROM TbUsuario t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbUsuario.findByContrasena", query = "SELECT t FROM TbUsuario t WHERE t.contrasena = :contrasena")
    , @NamedQuery(name = "TbUsuario.findByEstado", query = "SELECT t FROM TbUsuario t WHERE t.estado = :estado")})
public class TbUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private Long idUsuario;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "contrasena")
    private String contrasena;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "idUsuario")
    private List<TbInvestigador> tbInvestigadorList;

    public TbUsuario() {
    }

    public TbUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<TbInvestigador> getTbInvestigadorList() {
        return tbInvestigadorList;
    }

    public void setTbInvestigadorList(List<TbInvestigador> tbInvestigadorList) {
        this.tbInvestigadorList = tbInvestigadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuario)) {
            return false;
        }
        TbUsuario other = (TbUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
