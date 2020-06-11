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
import ucentral.entities.TbAutoresProdbib;

/**
 *
 * @author david
 */
@Stateless
public class TbAutoresProdbibFacade extends AbstractFacade<TbAutoresProdbib> implements TbAutoresProdbibFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbAutoresProdbibFacade() {
        super(TbAutoresProdbib.class);
    }

    @Override
    public int ultimoRegistro() {
        Query query = em.createNativeQuery("SELECT max(id_autprodbib) FROM public.tb_autores_prodbib");
        int valor = 1;
        if(query.getSingleResult()==null){
            return valor;
        }else{
            valor = ((Long) query.getSingleResult()).intValue() + 1;
        }
            
        return valor;
    }
    
}
