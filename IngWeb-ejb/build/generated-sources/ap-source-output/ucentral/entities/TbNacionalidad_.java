package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbInvestigador;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbNacionalidad.class)
public class TbNacionalidad_ { 

    public static volatile SingularAttribute<TbNacionalidad, Long> idNacionalidad;
    public static volatile ListAttribute<TbNacionalidad, TbInvestigador> tbInvestigadorList;
    public static volatile SingularAttribute<TbNacionalidad, String> nombrePais;

}