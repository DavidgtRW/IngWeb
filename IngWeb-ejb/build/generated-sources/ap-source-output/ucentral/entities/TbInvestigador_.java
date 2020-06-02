package ucentral.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbActividadesevaluador;
import ucentral.entities.TbActividadesform;
import ucentral.entities.TbArticulospublicados;
import ucentral.entities.TbDireccion;
import ucentral.entities.TbHistorial;
import ucentral.entities.TbInvestigadorPrograma;
import ucentral.entities.TbLibretamilitar;
import ucentral.entities.TbNacionalidad;
import ucentral.entities.TbProduccionTA;
import ucentral.entities.TbProduccionbibliografica;
import ucentral.entities.TbUsuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbInvestigador.class)
public class TbInvestigador_ { 

    public static volatile SingularAttribute<TbInvestigador, TbNacionalidad> idNacionalidad;
    public static volatile ListAttribute<TbInvestigador, TbActividadesform> tbActividadesformList;
    public static volatile SingularAttribute<TbInvestigador, Date> fechaNacimiento;
    public static volatile SingularAttribute<TbInvestigador, TbUsuario> idUsuario;
    public static volatile SingularAttribute<TbInvestigador, String> segundoApellido;
    public static volatile SingularAttribute<TbInvestigador, String> nombre;
    public static volatile SingularAttribute<TbInvestigador, TbDireccion> idDireccion;
    public static volatile SingularAttribute<TbInvestigador, String> web;
    public static volatile ListAttribute<TbInvestigador, TbHistorial> tbHistorialList;
    public static volatile ListAttribute<TbInvestigador, TbActividadesevaluador> tbActividadesevaluadorList;
    public static volatile SingularAttribute<TbInvestigador, String> genero;
    public static volatile SingularAttribute<TbInvestigador, String> correo;
    public static volatile SingularAttribute<TbInvestigador, String> telefono;
    public static volatile ListAttribute<TbInvestigador, TbProduccionTA> tbProduccionTAList;
    public static volatile ListAttribute<TbInvestigador, TbInvestigadorPrograma> tbInvestigadorProgramaList;
    public static volatile SingularAttribute<TbInvestigador, byte[]> hojaVida;
    public static volatile ListAttribute<TbInvestigador, TbArticulospublicados> tbArticulospublicadosList;
    public static volatile SingularAttribute<TbInvestigador, String> primerApellido;
    public static volatile ListAttribute<TbInvestigador, TbProduccionbibliografica> tbProduccionbibliograficaList;
    public static volatile SingularAttribute<TbInvestigador, Integer> edad;
    public static volatile SingularAttribute<TbInvestigador, Date> fechaInscripcion;
    public static volatile SingularAttribute<TbInvestigador, String> tipoDocumento;
    public static volatile SingularAttribute<TbInvestigador, byte[]> foto;
    public static volatile SingularAttribute<TbInvestigador, Long> idInvestigador;
    public static volatile SingularAttribute<TbInvestigador, Long> noDocumento;
    public static volatile SingularAttribute<TbInvestigador, TbLibretamilitar> idLibretamilitar;

}