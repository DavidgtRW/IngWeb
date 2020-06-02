package ucentral.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbAsignaturasimpartidas;
import ucentral.entities.TbInvestigador;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbHistorial.class)
public class TbHistorial_ { 

    public static volatile SingularAttribute<TbHistorial, String> dedicacion;
    public static volatile SingularAttribute<TbHistorial, String> tipo;
    public static volatile SingularAttribute<TbHistorial, Date> fechaInicio;
    public static volatile ListAttribute<TbHistorial, TbAsignaturasimpartidas> tbAsignaturasimpartidasList;
    public static volatile SingularAttribute<TbHistorial, TbInvestigador> idInvestigador;
    public static volatile SingularAttribute<TbHistorial, Long> idHistorial;
    public static volatile SingularAttribute<TbHistorial, Date> fechaFin;

}