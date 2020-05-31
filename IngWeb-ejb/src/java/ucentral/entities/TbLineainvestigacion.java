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
@Table(name = "TB_LINEAINVESTIGACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbLineainvestigacion.findAll", query = "SELECT t FROM TbLineainvestigacion t")
    , @NamedQuery(name = "TbLineainvestigacion.findByIdLineainvestigacion", query = "SELECT t FROM TbLineainvestigacion t WHERE t.idLineainvestigacion = :idLineainvestigacion")
    , @NamedQuery(name = "TbLineainvestigacion.findByArea", query = "SELECT t FROM TbLineainvestigacion t WHERE t.area = :area")
    , @NamedQuery(name = "TbLineainvestigacion.findByNombre", query = "SELECT t FROM TbLineainvestigacion t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbLineainvestigacion.findByDescripcion", query = "SELECT t FROM TbLineainvestigacion t WHERE t.descripcion = :descripcion")})
public class TbLineainvestigacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_lineainvestigacion")
    private Long idLineainvestigacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "area")
    private String area;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idLineainvestigacion")
    private List<TbActividadesform> tbActividadesformList;
    @OneToMany(mappedBy = "idLineainvestigacion")
    private List<TbProduccionbibliografica> tbProduccionbibliograficaList;
    @OneToMany(mappedBy = "idLineainvestigacion")
    private List<TbArticulospublicados> tbArticulospublicadosList;
    @OneToMany(mappedBy = "idLineainvestigacion")
    private List<TbActividadesevaluador> tbActividadesevaluadorList;
    @OneToMany(mappedBy = "idLineainvestigacion")
    private List<TbProduccionTA> tbProduccionTAList;

    public TbLineainvestigacion() {
    }

    public TbLineainvestigacion(Long idLineainvestigacion) {
        this.idLineainvestigacion = idLineainvestigacion;
    }

    public TbLineainvestigacion(Long idLineainvestigacion, String area, String nombre) {
        this.idLineainvestigacion = idLineainvestigacion;
        this.area = area;
        this.nombre = nombre;
    }

    public Long getIdLineainvestigacion() {
        return idLineainvestigacion;
    }

    public void setIdLineainvestigacion(Long idLineainvestigacion) {
        this.idLineainvestigacion = idLineainvestigacion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<TbActividadesform> getTbActividadesformList() {
        return tbActividadesformList;
    }

    public void setTbActividadesformList(List<TbActividadesform> tbActividadesformList) {
        this.tbActividadesformList = tbActividadesformList;
    }

    @XmlTransient
    public List<TbProduccionbibliografica> getTbProduccionbibliograficaList() {
        return tbProduccionbibliograficaList;
    }

    public void setTbProduccionbibliograficaList(List<TbProduccionbibliografica> tbProduccionbibliograficaList) {
        this.tbProduccionbibliograficaList = tbProduccionbibliograficaList;
    }

    @XmlTransient
    public List<TbArticulospublicados> getTbArticulospublicadosList() {
        return tbArticulospublicadosList;
    }

    public void setTbArticulospublicadosList(List<TbArticulospublicados> tbArticulospublicadosList) {
        this.tbArticulospublicadosList = tbArticulospublicadosList;
    }

    @XmlTransient
    public List<TbActividadesevaluador> getTbActividadesevaluadorList() {
        return tbActividadesevaluadorList;
    }

    public void setTbActividadesevaluadorList(List<TbActividadesevaluador> tbActividadesevaluadorList) {
        this.tbActividadesevaluadorList = tbActividadesevaluadorList;
    }

    @XmlTransient
    public List<TbProduccionTA> getTbProduccionTAList() {
        return tbProduccionTAList;
    }

    public void setTbProduccionTAList(List<TbProduccionTA> tbProduccionTAList) {
        this.tbProduccionTAList = tbProduccionTAList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLineainvestigacion != null ? idLineainvestigacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbLineainvestigacion)) {
            return false;
        }
        TbLineainvestigacion other = (TbLineainvestigacion) object;
        if ((this.idLineainvestigacion == null && other.idLineainvestigacion != null) || (this.idLineainvestigacion != null && !this.idLineainvestigacion.equals(other.idLineainvestigacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbLineainvestigacion[ idLineainvestigacion=" + idLineainvestigacion + " ]";
    }
    
}
