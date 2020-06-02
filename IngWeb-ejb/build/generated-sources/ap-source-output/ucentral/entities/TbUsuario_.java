package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbInvestigador;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbUsuario.class)
public class TbUsuario_ { 

    public static volatile SingularAttribute<TbUsuario, String> estado;
    public static volatile SingularAttribute<TbUsuario, Long> idUsuario;
    public static volatile SingularAttribute<TbUsuario, String> contrasena;
    public static volatile ListAttribute<TbUsuario, TbInvestigador> tbInvestigadorList;
    public static volatile SingularAttribute<TbUsuario, String> nombre;

}