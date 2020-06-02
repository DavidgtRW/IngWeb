package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbInstitucion;
import ucentral.entities.TbInvestigadorPrograma;
import ucentral.entities.TbPrograma;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbInstitucionprograma.class)
public class TbInstitucionprograma_ { 

    public static volatile ListAttribute<TbInstitucionprograma, TbInvestigadorPrograma> tbInvestigadorProgramaList;
    public static volatile SingularAttribute<TbInstitucionprograma, TbPrograma> idPrograma;
    public static volatile SingularAttribute<TbInstitucionprograma, TbInstitucion> idInstitucion;
    public static volatile SingularAttribute<TbInstitucionprograma, Integer> numerosemestre;
    public static volatile SingularAttribute<TbInstitucionprograma, Long> idInstitucionprograma;

}