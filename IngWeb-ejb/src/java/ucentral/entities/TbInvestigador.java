/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "TB_INVESTIGADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbInvestigador.findAll", query = "SELECT t FROM TbInvestigador t")
    , @NamedQuery(name = "TbInvestigador.findByIdInvestigador", query = "SELECT t FROM TbInvestigador t WHERE t.idInvestigador = :idInvestigador")
    , @NamedQuery(name = "TbInvestigador.findByNombre", query = "SELECT t FROM TbInvestigador t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbInvestigador.findByNoDocumento", query = "SELECT t FROM TbInvestigador t WHERE t.noDocumento = :noDocumento")
    , @NamedQuery(name = "TbInvestigador.findByPrimerApellido", query = "SELECT t FROM TbInvestigador t WHERE t.primerApellido = :primerApellido")
    , @NamedQuery(name = "TbInvestigador.findBySegundoApellido", query = "SELECT t FROM TbInvestigador t WHERE t.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "TbInvestigador.findByTipoDocumento", query = "SELECT t FROM TbInvestigador t WHERE t.tipoDocumento = :tipoDocumento")
    , @NamedQuery(name = "TbInvestigador.findByGenero", query = "SELECT t FROM TbInvestigador t WHERE t.genero = :genero")
    , @NamedQuery(name = "TbInvestigador.findByFechaNacimiento", query = "SELECT t FROM TbInvestigador t WHERE t.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "TbInvestigador.findByEdad", query = "SELECT t FROM TbInvestigador t WHERE t.edad = :edad")
    , @NamedQuery(name = "TbInvestigador.findByFechaInscripcion", query = "SELECT t FROM TbInvestigador t WHERE t.fechaInscripcion = :fechaInscripcion")
    , @NamedQuery(name = "TbInvestigador.findByWeb", query = "SELECT t FROM TbInvestigador t WHERE t.web = :web")
    , @NamedQuery(name = "TbInvestigador.findByCorreo", query = "SELECT t FROM TbInvestigador t WHERE t.correo = :correo")
    , @NamedQuery(name = "TbInvestigador.findByTelefono", query = "SELECT t FROM TbInvestigador t WHERE t.telefono = :telefono")})
public class TbInvestigador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_investigador")
    private Long idInvestigador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "no_documento")
    private long noDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Size(max = 150)
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Size(max = 20)
    @Column(name = "genero")
    private String genero;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "fecha_inscripcion")
    @Temporal(TemporalType.DATE)
    private Date fechaInscripcion;
    @Size(max = 150)
    @Column(name = "web")
    private String web;
    @Size(max = 150)
    @Column(name = "correo")
    private String correo;
    @Size(max = 150)
    @Column(name = "telefono")
    private String telefono;
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @Lob
    @Column(name = "hoja_vida")
    private byte[] hojaVida;
    @OneToMany(mappedBy = "idInvestigador")
    private List<TbHistorial> tbHistorialList;
    @OneToMany(mappedBy = "idInvestigador")
    private List<TbActividadesform> tbActividadesformList;
    @OneToMany(mappedBy = "idInvestigador")
    private List<TbProduccionbibliografica> tbProduccionbibliograficaList;
    @OneToMany(mappedBy = "idInvestigador")
    private List<TbArticulospublicados> tbArticulospublicadosList;
    @OneToMany(mappedBy = "idInvestigador")
    private List<TbActividadesevaluador> tbActividadesevaluadorList;
    @OneToMany(mappedBy = "idInvestigador")
    private List<TbInvestigadorPrograma> tbInvestigadorProgramaList;
    @JoinColumn(name = "id_direccion", referencedColumnName = "id_direccion")
    @ManyToOne
    private TbDireccion idDireccion;
    @JoinColumn(name = "id_libretamilitar", referencedColumnName = "id_libretamilitar")
    @ManyToOne
    private TbLibretamilitar idLibretamilitar;
    @JoinColumn(name = "id_nacionalidad", referencedColumnName = "id_nacionalidad")
    @ManyToOne
    private TbNacionalidad idNacionalidad;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private TbUsuario idUsuario;
    @OneToMany(mappedBy = "idInvestigador")
    private List<TbProduccionTA> tbProduccionTAList;

    public TbInvestigador() {
    }

    public TbInvestigador(Long idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public TbInvestigador(Long idInvestigador, String nombre, long noDocumento, String primerApellido, String tipoDocumento) {
        this.idInvestigador = idInvestigador;
        this.nombre = nombre;
        this.noDocumento = noDocumento;
        this.primerApellido = primerApellido;
        this.tipoDocumento = tipoDocumento;
    }

    public Long getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(Long idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(long noDocumento) {
        this.noDocumento = noDocumento;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public byte[] getHojaVida() {
        return hojaVida;
    }

    public void setHojaVida(byte[] hojaVida) {
        this.hojaVida = hojaVida;
    }

    @XmlTransient
    public List<TbHistorial> getTbHistorialList() {
        return tbHistorialList;
    }

    public void setTbHistorialList(List<TbHistorial> tbHistorialList) {
        this.tbHistorialList = tbHistorialList;
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
    public List<TbInvestigadorPrograma> getTbInvestigadorProgramaList() {
        return tbInvestigadorProgramaList;
    }

    public void setTbInvestigadorProgramaList(List<TbInvestigadorPrograma> tbInvestigadorProgramaList) {
        this.tbInvestigadorProgramaList = tbInvestigadorProgramaList;
    }

    public TbDireccion getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(TbDireccion idDireccion) {
        this.idDireccion = idDireccion;
    }

    public TbLibretamilitar getIdLibretamilitar() {
        return idLibretamilitar;
    }

    public void setIdLibretamilitar(TbLibretamilitar idLibretamilitar) {
        this.idLibretamilitar = idLibretamilitar;
    }

    public TbNacionalidad getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(TbNacionalidad idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public TbUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(TbUsuario idUsuario) {
        this.idUsuario = idUsuario;
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
        hash += (idInvestigador != null ? idInvestigador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbInvestigador)) {
            return false;
        }
        TbInvestigador other = (TbInvestigador) object;
        if ((this.idInvestigador == null && other.idInvestigador != null) || (this.idInvestigador != null && !this.idInvestigador.equals(other.idInvestigador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ucentral.entities.TbInvestigador[ idInvestigador=" + idInvestigador + " ]";
    }
    
}
