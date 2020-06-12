/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

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

}
