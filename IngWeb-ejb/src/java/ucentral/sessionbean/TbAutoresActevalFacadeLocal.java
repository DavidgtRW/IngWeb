/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbAutoresActeval;

/**
 *
 * @author david
 */
@Local
public interface TbAutoresActevalFacadeLocal {

    void create(TbAutoresActeval tbAutoresActeval);

    void edit(TbAutoresActeval tbAutoresActeval);

    void remove(TbAutoresActeval tbAutoresActeval);

    TbAutoresActeval find(Object id);

    List<TbAutoresActeval> findAll();

    List<TbAutoresActeval> findRange(int[] range);

    int count();
    
}
