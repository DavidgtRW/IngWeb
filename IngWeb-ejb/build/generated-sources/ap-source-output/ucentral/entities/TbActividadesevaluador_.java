package ucentral.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbAutoresActeval;
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbLineainvestigacion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbActividadesevaluador.class)
public class TbActividadesevaluador_ { 

    public static volatile SingularAttribute<TbActividadesevaluador, TbLineainvestigacion> idLineainvestigacion;
    public static volatile SingularAttribute<TbActividadesevaluador, Date> fechaSustentacion;
    public static volatile SingularAttribute<TbActividadesevaluador, TbInvestigador> idInvestigador;
    public static volatile SingularAttribute<TbActividadesevaluador, Integer> puntos;
    public static volatile SingularAttribute<TbActividadesevaluador, Long> idActividadeseval;
    public static volatile ListAttribute<TbActividadesevaluador, TbAutoresActeval> tbAutoresActevalList;

}