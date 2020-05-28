/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbActividadesevaluador;

/**
 *
 * @author david
 */
@Local
public interface TbActividadesevaluadorFacadeLocal {

    void create(TbActividadesevaluador tbActividadesevaluador);

    void edit(TbActividadesevaluador tbActividadesevaluador);

    void remove(TbActividadesevaluador tbActividadesevaluador);

    TbActividadesevaluador find(Object id);

    List<TbActividadesevaluador> findAll();

    List<TbActividadesevaluador> findRange(int[] range);

    int count();
    
}
