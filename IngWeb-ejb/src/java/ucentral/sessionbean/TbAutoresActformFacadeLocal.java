/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbAutoresActform;

/**
 *
 * @author david
 */
@Local
public interface TbAutoresActformFacadeLocal {

    void create(TbAutoresActform tbAutoresActform);

    void edit(TbAutoresActform tbAutoresActform);

    void remove(TbAutoresActform tbAutoresActform);

    TbAutoresActform find(Object id);

    List<TbAutoresActform> findAll();

    List<TbAutoresActform> findRange(int[] range);

    int count();
    
     int ultimoRegistro();
}
