/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ucentral.entities.TbUsuario;

/**
 *
 * @author david
 */
@Stateless
public class TbUsuarioFacade extends AbstractFacade<TbUsuario> implements TbUsuarioFacadeLocal {

    @PersistenceContext(unitName = "IngWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbUsuarioFacade() {
        super(TbUsuario.class);
    }
    
    @Override
    public TbUsuario findByCredenciales(String usuario, String contrasena) {
        String sql = "SELECT u.id_usuario, u.contrasena, u.estado, u.nombre FROM public.tb_usuario u WHERE u.nombre = \'"+ usuario +"\' AND  u.contrasena = \'"+ contrasena +"\'";
        Query query = em.createNativeQuery(sql,TbUsuario.class);   
        List<TbUsuario> usuarios = query.getResultList();
        if(usuarios.size()>0){
            return usuarios.get(0);
        }else{
            return null;
        }
    }
    
    @Override
    public int ultimoRegistro() {
        Query query = em.createNativeQuery("SELECT max(id_usuario) FROM public.tb_usuario");
        int valor = 1;
        if(query.getSingleResult()==null){
            return valor;
        }else{
            valor = ((Long) query.getSingleResult()).intValue() + 1;
        }
            
        return valor;
    }
    
}
