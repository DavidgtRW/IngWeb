/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ucentral.entities.TbInstitucion;

/**
 *
 * @author david
 */
@Stateless
public class TbInstitucionFacade extends AbstractFacade<TbInstitucion> implements TbInstitucionFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbInstitucionFacade() {
        super(TbInstitucion.class);
    }
    
}
