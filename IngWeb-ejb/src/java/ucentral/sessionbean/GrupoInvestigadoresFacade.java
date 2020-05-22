/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ucentral.entities.GrupoInvestigadores;

/**
 *
 * @author david
 */
@Stateless
public class GrupoInvestigadoresFacade extends AbstractFacade<GrupoInvestigadores> implements GrupoInvestigadoresFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GrupoInvestigadoresFacade() {
        super(GrupoInvestigadores.class);
    }
    
}
