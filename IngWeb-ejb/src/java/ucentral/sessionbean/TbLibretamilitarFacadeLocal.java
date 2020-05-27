/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbLibretamilitar;

/**
 *
 * @author david
 */
@Local
public interface TbLibretamilitarFacadeLocal {

    void create(TbLibretamilitar tbLibretamilitar);

    void edit(TbLibretamilitar tbLibretamilitar);

    void remove(TbLibretamilitar tbLibretamilitar);

    TbLibretamilitar find(Object id);

    List<TbLibretamilitar> findAll();

    List<TbLibretamilitar> findRange(int[] range);

    int count();
    
}
