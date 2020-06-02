package ucentral.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbAutoresActform;
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbLineainvestigacion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbActividadesform.class)
public class TbActividadesform_ { 

    public static volatile SingularAttribute<TbActividadesform, TbLineainvestigacion> idLineainvestigacion;
    public static volatile SingularAttribute<TbActividadesform, Date> fechaInicio;
    public static volatile SingularAttribute<TbActividadesform, Long> idActividadesForm;
    public static volatile SingularAttribute<TbActividadesform, String> tituloTrabajo;
    public static volatile SingularAttribute<TbActividadesform, TbInvestigador> idInvestigador;
    public static volatile SingularAttribute<TbActividadesform, Integer> puntos;
    public static volatile SingularAttribute<TbActividadesform, Date> fechaFin;
    public static volatile ListAttribute<TbActividadesform, TbAutoresActform> tbAutoresActformList;

}