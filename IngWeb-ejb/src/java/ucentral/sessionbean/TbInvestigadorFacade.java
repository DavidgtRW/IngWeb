/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ucentral.entities.TbInvestigador;

/**
 *
 * @author david
 */
@Stateless
public class TbInvestigadorFacade extends AbstractFacade<TbInvestigador> implements TbInvestigadorFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbInvestigadorFacade() {
        super(TbInvestigador.class);
    }

    @Override
    public int ultimoRegistro() {
        Query query = em.createNativeQuery("SELECT max(id_investigador) FROM public.tb_investigador");
        int valor = 1;
        if (query.getSingleResult() == null) {
            return valor;
        } else {
            valor = ((Long) query.getSingleResult()).intValue() + 1;
        }

        return valor;
    }

    @Override
    public void modificar(TbInvestigador tbInvestigador) {
        Query query = em.createNativeQuery("UPDATE public.tb_investigador "
                + " SET correo='" + tbInvestigador.getCorreo() + "', edad=" + tbInvestigador.getEdad() + ", genero='" + tbInvestigador.getGenero() + "',"
                + " no_documento=" + tbInvestigador.getNoDocumento() + ", nombre='" + tbInvestigador.getNombre() + "', "
                + " primer_apellido='"+tbInvestigador.getPrimerApellido()+"' "
                + " WHERE id_investigador=" + tbInvestigador.getIdInvestigador());
        
        System.out.println("MARCA:"+query);
        query.executeUpdate();
        
        query = em.createNativeQuery("UPDATE public.tb_usuario "
                + " SET estado='" + tbInvestigador.getIdUsuario().getEstado() + "' "
                + " WHERE id_usuario=" + tbInvestigador.getIdUsuario().getIdUsuario());
        
        System.out.println("MARCA2:"+query);
        query.executeUpdate();
    }

    @Override
    public List<TbInvestigador> getInvestigadores() {
        Query query = em.createNativeQuery("SELECT id_investigador, correo, edad, fecha_inscripcion, fecha_nacimiento, "
                + "foto, genero, hoja_vida, no_documento, nombre, primer_apellido, segundo_apellido, "
                + "telefono, tipo_documento, web, id_direccion, id_libretamilitar, id_nacionalidad, id_usuario FROM public.tb_investigador", TbInvestigador.class);
        
        System.out.println("Query:"+query);
        return query.getResultList();
    }

    @Override
    public TbInvestigador findByUsuario(Long id) {
        Query query = em.createNativeQuery("SELECT id_investigador, correo, edad, fecha_inscripcion, fecha_nacimiento, "
                + "foto, genero, hoja_vida, no_documento, nombre, primer_apellido, segundo_apellido, "
                + "telefono, tipo_documento, web, id_direccion, id_libretamilitar, id_nacionalidad, id_usuario FROM public.tb_investigador"
                + " WHERE id_usuario ="+id, TbInvestigador.class);
        
        System.out.println("Query:"+query);
        
        return (TbInvestigador) query.getSingleResult();
    }

}
