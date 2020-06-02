package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbTesis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbJurado.class)
public class TbJurado_ { 

    public static volatile SingularAttribute<TbJurado, TbTesis> idTesis;
    public static volatile SingularAttribute<TbJurado, Long> idJurado;
    public static volatile SingularAttribute<TbJurado, String> nombre;
    public static volatile SingularAttribute<TbJurado, String> email;

}