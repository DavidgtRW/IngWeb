package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbAsignaturasPrograma;
import ucentral.entities.TbInstitucionprograma;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbPrograma.class)
public class TbPrograma_ { 

    public static volatile SingularAttribute<TbPrograma, Long> idPrograma;
    public static volatile ListAttribute<TbPrograma, TbAsignaturasPrograma> tbAsignaturasProgramaList;
    public static volatile ListAttribute<TbPrograma, TbInstitucionprograma> tbInstitucionprogramaList;
    public static volatile SingularAttribute<TbPrograma, String> nombre;

}