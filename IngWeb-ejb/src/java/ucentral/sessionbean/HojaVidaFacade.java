/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ucentral.entities.HojaVida;

/**
 *
 * @author david
 */
@Stateless
public class HojaVidaFacade extends AbstractFacade<HojaVida> implements HojaVidaFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HojaVidaFacade() {
        super(HojaVida.class);
    }
    
}
