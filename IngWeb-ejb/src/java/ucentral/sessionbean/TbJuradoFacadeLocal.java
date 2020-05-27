/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbJurado;

/**
 *
 * @author david
 */
@Local
public interface TbJuradoFacadeLocal {

    void create(TbJurado tbJurado);

    void edit(TbJurado tbJurado);

    void remove(TbJurado tbJurado);

    TbJurado find(Object id);

    List<TbJurado> findAll();

    List<TbJurado> findRange(int[] range);

    int count();
    
}
