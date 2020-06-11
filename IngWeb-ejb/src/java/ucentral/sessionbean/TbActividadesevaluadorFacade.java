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
import ucentral.entities.TbActividadesevaluador;

/**
 *
 * @author david
 */
@Stateless
public class TbActividadesevaluadorFacade extends AbstractFacade<TbActividadesevaluador> implements TbActividadesevaluadorFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbActividadesevaluadorFacade() {
        super(TbActividadesevaluador.class);
    }

    @Override
    public int ultimoRegistro() {
        Query query = em.createNativeQuery("SELECT max(id_actividadeseval) FROM public.tb_actividadesevaluador");
        int valor = 1;
        if(query.getSingleResult()==null){
            return valor;
        }else{
            valor = ((Long) query.getSingleResult()).intValue() + 1;
        }
            
        return valor;
    }
    
}
