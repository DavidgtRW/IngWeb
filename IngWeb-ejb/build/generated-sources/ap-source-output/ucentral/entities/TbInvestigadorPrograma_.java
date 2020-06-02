package ucentral.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbInstitucionprograma;
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbTesis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbInvestigadorPrograma.class)
public class TbInvestigadorPrograma_ { 

    public static volatile SingularAttribute<TbInvestigadorPrograma, TbTesis> idTesis;
    public static volatile SingularAttribute<TbInvestigadorPrograma, Date> fechaInicio;
    public static volatile SingularAttribute<TbInvestigadorPrograma, Long> idInvProg;
    public static volatile SingularAttribute<TbInvestigadorPrograma, Double> promedioAcademico;
    public static volatile SingularAttribute<TbInvestigadorPrograma, TbInvestigador> idInvestigador;
    public static volatile SingularAttribute<TbInvestigadorPrograma, Date> fechaFin;
    public static volatile SingularAttribute<TbInvestigadorPrograma, TbInstitucionprograma> idInstitucionprograma;

}