package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbInvestigadorPrograma;
import ucentral.entities.TbJurado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbTesis.class)
public class TbTesis_ { 

    public static volatile SingularAttribute<TbTesis, String> descripcion;
    public static volatile ListAttribute<TbTesis, TbInvestigadorPrograma> tbInvestigadorProgramaList;
    public static volatile SingularAttribute<TbTesis, Long> idTesis;
    public static volatile ListAttribute<TbTesis, TbJurado> tbJuradoList;
    public static volatile SingularAttribute<TbTesis, String> nombreLinea;
    public static volatile SingularAttribute<TbTesis, String> titulo;

}