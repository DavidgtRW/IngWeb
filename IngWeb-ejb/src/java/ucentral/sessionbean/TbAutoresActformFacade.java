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
import ucentral.entities.TbAutoresActform;

/**
 *
 * @author david
 */
@Stateless
public class TbAutoresActformFacade extends AbstractFacade<TbAutoresActform> implements TbAutoresActformFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbAutoresActformFacade() {
        super(TbAutoresActform.class);
    }

    @Override
    public int ultimoRegistro() {
         Query query = em.createNativeQuery("SELECT max(id_autactfor) FROM public.tb_autores_actform");
        int valor = 1;
        if(query.getSingleResult()==null){
            return valor;
        }else{
            valor = ((Long) query.getSingleResult()).intValue() + 1;
        }
            
        return valor;
    }
    
}
