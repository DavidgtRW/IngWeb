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
@Table(name = "TB_LIBRETAMILITAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbLibretamilitar.findAll", query = "SELECT t FROM TbLibretamilitar t")
    , @NamedQuery(name = "TbLibretamilitar.findByIdLibretamilitar", query = "SELECT t FROM TbLibretamilitar t WHERE t.idLibretamilitar = :idLibretamilitar")
    , @NamedQuery(name = "TbLibretamilitar.findByNumero", query = "SELECT t FROM TbLibretamilitar t WHERE t.numero = :numero")
    , @NamedQuery(name = "TbLibretamilitar.findByClase", query = "SELECT t FROM TbLibretamilitar t WHERE t.clase = :clase")
    , @NamedQuery(name = "TbLibretamilitar.findByDistrito", query = "SELECT t FROM TbLibretamilitar t WHERE t.distrito = :distrito")})
public class TbLibretamilitar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_libretamilitar")
    private Long idLibretamilitar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private long numero;
    @Size(max = 150)
    @Column(name = "clase")
    private String clase;
    @Size(max = 150)
    @Column(name = "distrito")
    private String distrito;
    @OneToMany(mappedBy = "idLibretamilitar")
    private List<TbInvestigador> tbInvestigadorList;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id_investigador")
    @ManyToOne
    private TbInvestigador idInvestigador;

    public TbLibretamilitar() {
    }

    public TbLibretamilitar(Long idLibretamilitar) {
        this.idLibretamilitar = idLibretamilitar;
    }

    public TbLibretamilitar(Long idLibretamilitar, long numero) {
        this.idLibretamilitar = idLibretamilitar;
        this.numero = numero;
    }

    public Long getIdLibretamilitar() {
        return idLibretamilitar;
    }

    public void setIdLibretamilitar(Long idLibretamilitar) {
        this.idLibretamilitar = idLibretamilitar;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    @XmlTransient
    public List<TbInvestigador> getTbInvestigadorList() {
        return tbInvestigadorList;
    }

    public void setTbInvestigadorList(List<TbInvestigador> tbInvestigadorList) {
        this.tbInvestigadorList = tbInvestigadorList;
    }

    public TbInvestigador getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(TbInvestigador idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibretamilitar != null ? idLibretamilitar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbLibretamilitar)) {
            return false;
        }
        TbLibretamilitar other = (TbLibretamilitar) object;
        if ((this.idLibretamilitar == null && other.idLibretamilitar != null) || (this.idLibretamilitar != null && !this.idLibretamilitar.equals(other.idLibretamilitar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbLibretamilitar[ idLibretamilitar=" + idLibretamilitar + " ]";
    }
    
}
