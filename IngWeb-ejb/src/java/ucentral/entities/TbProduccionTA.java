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
@Table(name = "TB_PRODUCCION_T_A")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbProduccionTA.findAll", query = "SELECT t FROM TbProduccionTA t")
    , @NamedQuery(name = "TbProduccionTA.findByIdProduccionta", query = "SELECT t FROM TbProduccionTA t WHERE t.idProduccionta = :idProduccionta")
    , @NamedQuery(name = "TbProduccionTA.findByPuntos", query = "SELECT t FROM TbProduccionTA t WHERE t.puntos = :puntos")
    , @NamedQuery(name = "TbProduccionTA.findByNombre", query = "SELECT t FROM TbProduccionTA t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbProduccionTA.findByResumen", query = "SELECT t FROM TbProduccionTA t WHERE t.resumen = :resumen")
    , @NamedQuery(name = "TbProduccionTA.findByTituloMaximo", query = "SELECT t FROM TbProduccionTA t WHERE t.tituloMaximo = :tituloMaximo")
    , @NamedQuery(name = "TbProduccionTA.findByTipoProduccion", query = "SELECT t FROM TbProduccionTA t WHERE t.tipoProduccion = :tipoProduccion")})
public class TbProduccionTA implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_produccionta")
    private Long idProduccionta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntos")
    private int puntos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 200)
    @Column(name = "resumen")
    private String resumen;
    @Size(max = 150)
    @Column(name = "titulo_maximo")
    private String tituloMaximo;
    @Size(max = 100)
    @Column(name = "tipo_produccion")
    private String tipoProduccion;
    @OneToMany(mappedBy = "idProduccionta")
    private List<TbAutoresProdta> tbAutoresProdtaList;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id_investigador")
    @ManyToOne
    private TbInvestigador idInvestigador;
    @JoinColumn(name = "id_lineainvestigacion", referencedColumnName = "id_lineainvestigacion")
    @ManyToOne
    private TbLineainvestigacion idLineainvestigacion;

    public TbProduccionTA() {
    }

    public TbProduccionTA(Long idProduccionta) {
        this.idProduccionta = idProduccionta;
    }

    public TbProduccionTA(Long idProduccionta, int puntos, String nombre) {
        this.idProduccionta = idProduccionta;
        this.puntos = puntos;
        this.nombre = nombre;
    }

    public Long getIdProduccionta() {
        return idProduccionta;
    }

    public void setIdProduccionta(Long idProduccionta) {
        this.idProduccionta = idProduccionta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getTituloMaximo() {
        return tituloMaximo;
    }

    public void setTituloMaximo(String tituloMaximo) {
        this.tituloMaximo = tituloMaximo;
    }

    public String getTipoProduccion() {
        return tipoProduccion;
    }

    public void setTipoProduccion(String tipoProduccion) {
        this.tipoProduccion = tipoProduccion;
    }

    @XmlTransient
    public List<TbAutoresProdta> getTbAutoresProdtaList() {
        return tbAutoresProdtaList;
    }

    public void setTbAutoresProdtaList(List<TbAutoresProdta> tbAutoresProdtaList) {
        this.tbAutoresProdtaList = tbAutoresProdtaList;
    }

    public TbInvestigador getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(TbInvestigador idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public TbLineainvestigacion getIdLineainvestigacion() {
        return idLineainvestigacion;
    }

    public void setIdLineainvestigacion(TbLineainvestigacion idLineainvestigacion) {
        this.idLineainvestigacion = idLineainvestigacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduccionta != null ? idProduccionta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProduccionTA)) {
            return false;
        }
        TbProduccionTA other = (TbProduccionTA) object;
        if ((this.idProduccionta == null && other.idProduccionta != null) || (this.idProduccionta != null && !this.idProduccionta.equals(other.idProduccionta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbProduccionTA[ idProduccionta=" + idProduccionta + " ]";
    }
    
}
