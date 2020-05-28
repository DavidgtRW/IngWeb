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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TB_INSTITUCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbInstitucion.findAll", query = "SELECT t FROM TbInstitucion t")
    , @NamedQuery(name = "TbInstitucion.findByIdInstitucion", query = "SELECT t FROM TbInstitucion t WHERE t.idInstitucion = :idInstitucion")
    , @NamedQuery(name = "TbInstitucion.findByNombre", query = "SELECT t FROM TbInstitucion t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbInstitucion.findByNumeroResolucion", query = "SELECT t FROM TbInstitucion t WHERE t.numeroResolucion = :numeroResolucion")
    , @NamedQuery(name = "TbInstitucion.findByTelefono", query = "SELECT t FROM TbInstitucion t WHERE t.telefono = :telefono")
    , @NamedQuery(name = "TbInstitucion.findByCorreo", query = "SELECT t FROM TbInstitucion t WHERE t.correo = :correo")
    , @NamedQuery(name = "TbInstitucion.findByTipo", query = "SELECT t FROM TbInstitucion t WHERE t.tipo = :tipo")})
public class TbInstitucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_institucion")
    private Long idInstitucion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_resolucion")
    private long numeroResolucion;
    @Size(max = 150)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 150)
    @Column(name = "correo")
    private String correo;
    @Size(max = 150)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(mappedBy = "idInstitucion")
    private List<TbDireccion> tbDireccionList;
    @OneToMany(mappedBy = "idInstitucion")
    private List<TbInstitucionprograma> tbInstitucionprogramaList;
    @JoinColumn(name = "id_direccion", referencedColumnName = "id_direccion")
    @ManyToOne
    private TbDireccion idDireccion;
    @OneToMany(mappedBy = "idInstitucion")
    private List<TbTipoprograma> tbTipoprogramaList;

    public TbInstitucion() {
    }

    public TbInstitucion(Long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public TbInstitucion(Long idInstitucion, String nombre, long numeroResolucion) {
        this.idInstitucion = idInstitucion;
        this.nombre = nombre;
        this.numeroResolucion = numeroResolucion;
    }

    public Long getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumeroResolucion() {
        return numeroResolucion;
    }

    public void setNumeroResolucion(long numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public List<TbDireccion> getTbDireccionList() {
        return tbDireccionList;
    }

    public void setTbDireccionList(List<TbDireccion> tbDireccionList) {
        this.tbDireccionList = tbDireccionList;
    }

    @XmlTransient
    public List<TbInstitucionprograma> getTbInstitucionprogramaList() {
        return tbInstitucionprogramaList;
    }

    public void setTbInstitucionprogramaList(List<TbInstitucionprograma> tbInstitucionprogramaList) {
        this.tbInstitucionprogramaList = tbInstitucionprogramaList;
    }

    public TbDireccion getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(TbDireccion idDireccion) {
        this.idDireccion = idDireccion;
    }

    @XmlTransient
    public List<TbTipoprograma> getTbTipoprogramaList() {
        return tbTipoprogramaList;
    }

    public void setTbTipoprogramaList(List<TbTipoprograma> tbTipoprogramaList) {
        this.tbTipoprogramaList = tbTipoprogramaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInstitucion != null ? idInstitucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbInstitucion)) {
            return false;
        }
        TbInstitucion other = (TbInstitucion) object;
        if ((this.idInstitucion == null && other.idInstitucion != null) || (this.idInstitucion != null && !this.idInstitucion.equals(other.idInstitucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbInstitucion[ idInstitucion=" + idInstitucion + " ]";
    }
    
}
