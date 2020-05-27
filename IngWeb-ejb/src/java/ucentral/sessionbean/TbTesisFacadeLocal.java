/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbTesis;

/**
 *
 * @author david
 */
@Local
public interface TbTesisFacadeLocal {

    void create(TbTesis tbTesis);

    void edit(TbTesis tbTesis);

    void remove(TbTesis tbTesis);

    TbTesis find(Object id);

    List<TbTesis> findAll();

    List<TbTesis> findRange(int[] range);

    int count();
    
}
