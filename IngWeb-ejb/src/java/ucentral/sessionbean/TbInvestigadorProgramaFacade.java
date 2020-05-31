/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ucentral.entities.TbInvestigadorPrograma;

/**
 *
 * @author david
 */
@Stateless
public class TbInvestigadorProgramaFacade extends AbstractFacade<TbInvestigadorPrograma> implements TbInvestigadorProgramaFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbInvestigadorProgramaFacade() {
        super(TbInvestigadorPrograma.class);
    }
    
}