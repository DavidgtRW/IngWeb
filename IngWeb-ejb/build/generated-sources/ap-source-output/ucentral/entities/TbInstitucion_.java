package ucentral.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucentral.entities.TbDireccion;
import ucentral.entities.TbInstitucionprograma;
import ucentral.entities.TbTipoprograma;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T22:13:25")
@StaticMetamodel(TbInstitucion.class)
public class TbInstitucion_ { 

    public static volatile SingularAttribute<TbInstitucion, String> tipo;
    public static volatile SingularAttribute<TbInstitucion, TbDireccion> idDireccion;
    public static volatile SingularAttribute<TbInstitucion, Long> idInstitucion;
    public static volatile SingularAttribute<TbInstitucion, String> correo;
    public static volatile ListAttribute<TbInstitucion, TbInstitucionprograma> tbInstitucionprogramaList;
    public static volatile SingularAttribute<TbInstitucion, String> telefono;
    public static volatile SingularAttribute<TbInstitucion, String> nombre;
    public static volatile ListAttribute<TbInstitucion, TbTipoprograma> tbTipoprogramaList;
    public static volatile SingularAttribute<TbInstitucion, Long> numeroResolucion;

}