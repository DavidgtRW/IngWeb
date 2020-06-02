package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbAutoresProdbib;
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbLineainvestigacion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbProduccionbibliografica.class)
public class TbProduccionbibliografica_ { 

    public static volatile SingularAttribute<TbProduccionbibliografica, String> tituloMaximo;
    public static volatile SingularAttribute<TbProduccionbibliografica, TbLineainvestigacion> idLineainvestigacion;
    public static volatile SingularAttribute<TbProduccionbibliografica, String> isbn;
    public static volatile SingularAttribute<TbProduccionbibliografica, Integer> añoPublicacion;
    public static volatile SingularAttribute<TbProduccionbibliografica, TbInvestigador> idInvestigador;
    public static volatile SingularAttribute<TbProduccionbibliografica, Integer> puntos;
    public static volatile SingularAttribute<TbProduccionbibliografica, String> nombre;
    public static volatile SingularAttribute<TbProduccionbibliografica, Long> idProduccionbib;
    public static volatile ListAttribute<TbProduccionbibliografica, TbAutoresProdbib> tbAutoresProdbibList;

}