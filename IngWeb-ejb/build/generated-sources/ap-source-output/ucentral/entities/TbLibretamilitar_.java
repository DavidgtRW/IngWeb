package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbInvestigador;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbLibretamilitar.class)
public class TbLibretamilitar_ { 

    public static volatile SingularAttribute<TbLibretamilitar, String> distrito;
    public static volatile SingularAttribute<TbLibretamilitar, Long> numero;
    public static volatile ListAttribute<TbLibretamilitar, TbInvestigador> tbInvestigadorList;
    public static volatile SingularAttribute<TbLibretamilitar, Long> idLibretamilitar;
    public static volatile SingularAttribute<TbLibretamilitar, String> clase;

}