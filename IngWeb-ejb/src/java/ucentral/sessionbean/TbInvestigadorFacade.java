/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
    
}
