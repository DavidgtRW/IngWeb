package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbInstitucion;
import ucentral.entities.TbInvestigador;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbDireccion.class)
public class TbDireccion_ { 

    public static volatile SingularAttribute<TbDireccion, Long> idDireccion;
    public static volatile SingularAttribute<TbDireccion, String> calle;
    public static volatile ListAttribute<TbDireccion, TbInstitucion> tbInstitucionList;
    public static volatile SingularAttribute<TbDireccion, String> carrera;
    public static volatile ListAttribute<TbDireccion, TbInvestigador> tbInvestigadorList;

}