/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbProduccionTA;

/**
 *
 * @author david
 */
@Local
public interface TbProduccionTAFacadeLocal {

    void create(TbProduccionTA tbProduccionTA);

    void edit(TbProduccionTA tbProduccionTA);

    void remove(TbProduccionTA tbProduccionTA);

    TbProduccionTA find(Object id);

    List<TbProduccionTA> findAll();

    List<TbProduccionTA> findRange(int[] range);

    int count();

    int ultimoRegistro();

}
