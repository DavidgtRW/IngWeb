package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbPrograma;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbAsignaturasPrograma.class)
public class TbAsignaturasPrograma_ { 

    public static volatile SingularAttribute<TbAsignaturasPrograma, Long> idAsignaturasprog;
    public static volatile SingularAttribute<TbAsignaturasPrograma, TbPrograma> idPrograma;
    public static volatile SingularAttribute<TbAsignaturasPrograma, Integer> numeroHoras;
    public static volatile SingularAttribute<TbAsignaturasPrograma, String> nombre;

}