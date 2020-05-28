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
@Table(name = "TB_TESIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTesis.findAll", query = "SELECT t FROM TbTesis t")
    , @NamedQuery(name = "TbTesis.findByIdTesis", query = "SELECT t FROM TbTesis t WHERE t.idTesis = :idTesis")
    , @NamedQuery(name = "TbTesis.findByTitulo", query = "SELECT t FROM TbTesis t WHERE t.titulo = :titulo")
    , @NamedQuery(name = "TbTesis.findByNombreLinea", query = "SELECT t FROM TbTesis t WHERE t.nombreLinea = :nombreLinea")
    , @NamedQuery(name = "TbTesis.findByDescripcion", query = "SELECT t FROM TbTesis t WHERE t.descripcion = :descripcion")})
public class TbTesis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tesis")
    private Long idTesis;
    @Size(max = 150)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 150)
    @Column(name = "nombre_linea")
    private String nombreLinea;
    @Size(max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_investigadorprograma", referencedColumnName = "id_inv_prog")
    @ManyToOne
    private TbInvestigadorPrograma idInvestigadorprograma;
    @OneToMany(mappedBy = "idTesis")
    private List<TbInvestigadorPrograma> tbInvestigadorProgramaList;
    @OneToMany(mappedBy = "idTesis")
    private List<TbJurado> tbJuradoList;

    public TbTesis() {
    }

    public TbTesis(Long idTesis) {
        this.idTesis = idTesis;
    }

    public Long getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(Long idTesis) {
        this.idTesis = idTesis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreLinea() {
        return nombreLinea;
    }

    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TbInvestigadorPrograma getIdInvestigadorprograma() {
        return idInvestigadorprograma;
    }

    public void setIdInvestigadorprograma(TbInvestigadorPrograma idInvestigadorprograma) {
        this.idInvestigadorprograma = idInvestigadorprograma;
    }

    @XmlTransient
    public List<TbInvestigadorPrograma> getTbInvestigadorProgramaList() {
        return tbInvestigadorProgramaList;
    }

    public void setTbInvestigadorProgramaList(List<TbInvestigadorPrograma> tbInvestigadorProgramaList) {
        this.tbInvestigadorProgramaList = tbInvestigadorProgramaList;
    }

    @XmlTransient
    public List<TbJurado> getTbJuradoList() {
        return tbJuradoList;
    }

    public void setTbJuradoList(List<TbJurado> tbJuradoList) {
        this.tbJuradoList = tbJuradoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTesis != null ? idTesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTesis)) {
            return false;
        }
        TbTesis other = (TbTesis) object;
        if ((this.idTesis == null && other.idTesis != null) || (this.idTesis != null && !this.idTesis.equals(other.idTesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbTesis[ idTesis=" + idTesis + " ]";
    }
    
}
