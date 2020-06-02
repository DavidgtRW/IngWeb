package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbProduccionbibliografica;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbAutoresProdbib.class)
public class TbAutoresProdbib_ { 

    public static volatile SingularAttribute<TbAutoresProdbib, String> apellido;
    public static volatile SingularAttribute<TbAutoresProdbib, Long> idAutprodbib;
    public static volatile SingularAttribute<TbAutoresProdbib, String> nombre;
    public static volatile SingularAttribute<TbAutoresProdbib, TbProduccionbibliografica> idProduccionbib;

}