/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ucentral.entities.ClasificacionInvestigador;

/**
 *
 * @author david
 */
@Stateless
public class ClasificacionInvestigadorFacade extends AbstractFacade<ClasificacionInvestigador> implements ClasificacionInvestigadorFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClasificacionInvestigadorFacade() {
        super(ClasificacionInvestigador.class);
    }
    
}
