package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbAutoresProdta;
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbLineainvestigacion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbProduccionTA.class)
public class TbProduccionTA_ { 

    public static volatile SingularAttribute<TbProduccionTA, Long> idProduccionta;
    public static volatile SingularAttribute<TbProduccionTA, String> tituloMaximo;
    public static volatile ListAttribute<TbProduccionTA, TbAutoresProdta> tbAutoresProdtaList;
    public static volatile SingularAttribute<TbProduccionTA, TbLineainvestigacion> idLineainvestigacion;
    public static volatile SingularAttribute<TbProduccionTA, TbInvestigador> idInvestigador;
    public static volatile SingularAttribute<TbProduccionTA, String> resumen;
    public static volatile SingularAttribute<TbProduccionTA, String> tipoProduccion;
    public static volatile SingularAttribute<TbProduccionTA, Integer> puntos;
    public static volatile SingularAttribute<TbProduccionTA, String> nombre;

}