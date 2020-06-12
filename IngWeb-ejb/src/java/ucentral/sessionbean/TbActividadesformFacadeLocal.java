/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbActividadesform;

/**
 *
 * @author david
 */
@Local
public interface TbActividadesformFacadeLocal {

    void create(TbActividadesform tbActividadesform);

    void edit(TbActividadesform tbActividadesform);

    void remove(TbActividadesform tbActividadesform);

    TbActividadesform find(Object id);

    List<TbActividadesform> findAll();

    List<TbActividadesform> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
    
}
