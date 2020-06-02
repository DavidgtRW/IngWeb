package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbActividadesevaluador;
import ucentral.entities.TbActividadesform;
import ucentral.entities.TbArticulospublicados;
import ucentral.entities.TbProduccionTA;
import ucentral.entities.TbProduccionbibliografica;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbLineainvestigacion.class)
public class TbLineainvestigacion_ { 

    public static volatile SingularAttribute<TbLineainvestigacion, String> area;
    public static volatile SingularAttribute<TbLineainvestigacion, String> descripcion;
    public static volatile ListAttribute<TbLineainvestigacion, TbArticulospublicados> tbArticulospublicadosList;
    public static volatile SingularAttribute<TbLineainvestigacion, Long> idLineainvestigacion;
    public static volatile ListAttribute<TbLineainvestigacion, TbActividadesform> tbActividadesformList;
    public static volatile ListAttribute<TbLineainvestigacion, TbActividadesevaluador> tbActividadesevaluadorList;
    public static volatile ListAttribute<TbLineainvestigacion, TbProduccionbibliografica> tbProduccionbibliograficaList;
    public static volatile SingularAttribute<TbLineainvestigacion, String> nombre;
    public static volatile ListAttribute<TbLineainvestigacion, TbProduccionTA> tbProduccionTAList;

}