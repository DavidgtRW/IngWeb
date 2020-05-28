/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbDireccion;

/**
 *
 * @author david
 */
@Local
public interface TbDireccionFacadeLocal {

    void create(TbDireccion tbDireccion);

    void edit(TbDireccion tbDireccion);

    void remove(TbDireccion tbDireccion);

    TbDireccion find(Object id);

    List<TbDireccion> findAll();

    List<TbDireccion> findRange(int[] range);

    int count();
    
}
