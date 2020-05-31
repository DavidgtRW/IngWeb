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
@Table(name = "TB_AUTORES_ARTPUBL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAutoresArtpubl.findAll", query = "SELECT t FROM TbAutoresArtpubl t")
    , @NamedQuery(name = "TbAutoresArtpubl.findByIdAutartpubl", query = "SELECT t FROM TbAutoresArtpubl t WHERE t.idAutartpubl = :idAutartpubl")
    , @NamedQuery(name = "TbAutoresArtpubl.findByNombre", query = "SELECT t FROM TbAutoresArtpubl t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbAutoresArtpubl.findByApellido", query = "SELECT t FROM TbAutoresArtpubl t WHERE t.apellido = :apellido")})
public class TbAutoresArtpubl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_autartpubl")
    private Long idAutartpubl;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @JoinColumn(name = "id_articulospub", referencedColumnName = "id_articulospub")
    @ManyToOne
    private TbArticulospublicados idArticulospub;

    public TbAutoresArtpubl() {
    }

    public TbAutoresArtpubl(Long idAutartpubl) {
        this.idAutartpubl = idAutartpubl;
    }

    public Long getIdAutartpubl() {
        return idAutartpubl;
    }

    public void setIdAutartpubl(Long idAutartpubl) {
        this.idAutartpubl = idAutartpubl;
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

    public TbArticulospublicados getIdArticulospub() {
        return idArticulospub;
    }

    public void setIdArticulospub(TbArticulospublicados idArticulospub) {
        this.idArticulospub = idArticulospub;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutartpubl != null ? idAutartpubl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAutoresArtpubl)) {
            return false;
        }
        TbAutoresArtpubl other = (TbAutoresArtpubl) object;
        if ((this.idAutartpubl == null && other.idAutartpubl != null) || (this.idAutartpubl != null && !this.idAutartpubl.equals(other.idAutartpubl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbAutoresArtpubl[ idAutartpubl=" + idAutartpubl + " ]";
    }
    
}
