package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbAutoresArtpubl;
import ucentral.entities.TbInvestigador;
import ucentral.entities.TbLineainvestigacion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbArticulospublicados.class)
public class TbArticulospublicados_ { 

    public static volatile SingularAttribute<TbArticulospublicados, String> tituloMaximo;
    public static volatile SingularAttribute<TbArticulospublicados, String> tipo;
    public static volatile ListAttribute<TbArticulospublicados, TbAutoresArtpubl> tbAutoresArtpublList;
    public static volatile SingularAttribute<TbArticulospublicados, TbLineainvestigacion> idLineainvestigacion;
    public static volatile SingularAttribute<TbArticulospublicados, String> isbn;
    public static volatile SingularAttribute<TbArticulospublicados, String> titulo;
    public static volatile SingularAttribute<TbArticulospublicados, String> resumen;
    public static volatile SingularAttribute<TbArticulospublicados, Integer> puntos;
    public static volatile SingularAttribute<TbArticulospublicados, String> nombre;
    public static volatile SingularAttribute<TbArticulospublicados, Integer> añoPublicacion;
    public static volatile SingularAttribute<TbArticulospublicados, Integer> numeroPaginas;
    public static volatile SingularAttribute<TbArticulospublicados, TbInvestigador> idInvestigador;
    public static volatile SingularAttribute<TbArticulospublicados, String> revistaPubl;
    public static volatile SingularAttribute<TbArticulospublicados, Long> idArticulospub;

}