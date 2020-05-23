/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "investigador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Investigador.findAll", query = "SELECT i FROM Investigador i")
    , @NamedQuery(name = "Investigador.findByIdinvestigador", query = "SELECT i FROM Investigador i WHERE i.idinvestigador = :idinvestigador")
    , @NamedQuery(name = "Investigador.findByNombre", query = "SELECT i FROM Investigador i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Investigador.findByApellido", query = "SELECT i FROM Investigador i WHERE i.apellido = :apellido")
    , @NamedQuery(name = "Investigador.findByCorreo", query = "SELECT i FROM Investigador i WHERE i.correo = :correo")
    , @NamedQuery(name = "Investigador.findByEstado", query = "SELECT i FROM Investigador i WHERE i.estado = :estado")})
public class Investigador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idinvestigador")
    private Long idinvestigador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "idclasificacion", referencedColumnName = "idclasificacion")
    @ManyToOne
    private ClasificacionInvestigador idclasificacion;
    @JoinColumn(name = "idconvocatoria", referencedColumnName = "idconvocatoria")
    @ManyToOne
    private Convocatoria idconvocatoria;
    @JoinColumn(name = "idgrupo", referencedColumnName = "idgrupo")
    @ManyToOne
    private GrupoInvestigadores idgrupo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idinvestigador")
    private List<HojaVida> hojaVidaList;

    public Investigador() {
    }

    public Investigador(Long idinvestigador) {
        this.idinvestigador = idinvestigador;
    }

    public Investigador(Long idinvestigador, String nombre, String apellido, String correo, String estado) {
        this.idinvestigador = idinvestigador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.estado = estado;
    }

    public Long getIdinvestigador() {
        return idinvestigador;
    }

    public void setIdinvestigador(Long idinvestigador) {
        this.idinvestigador = idinvestigador;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ClasificacionInvestigador getIdclasificacion() {
        return idclasificacion;
    }

    public void setIdclasificacion(ClasificacionInvestigador idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public Convocatoria getIdconvocatoria() {
        return idconvocatoria;
    }

    public void setIdconvocatoria(Convocatoria idconvocatoria) {
        this.idconvocatoria = idconvocatoria;
    }

    public GrupoInvestigadores getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(GrupoInvestigadores idgrupo) {
        this.idgrupo = idgrupo;
    }

    @XmlTransient
    public List<HojaVida> getHojaVidaList() {
        return hojaVidaList;
    }

    public void setHojaVidaList(List<HojaVida> hojaVidaList) {
        this.hojaVidaList = hojaVidaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinvestigador != null ? idinvestigador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Investigador)) {
            return false;
        }
        Investigador other = (Investigador) object;
        if ((this.idinvestigador == null && other.idinvestigador != null) || (this.idinvestigador != null && !this.idinvestigador.equals(other.idinvestigador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.Investigador[ idinvestigador=" + idinvestigador + " ]";
    }
    
}
