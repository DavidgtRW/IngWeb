/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbTipoprograma;

/**
 *
 * @author david
 */
@Local
public interface TbTipoprogramaFacadeLocal {

    void create(TbTipoprograma tbTipoprograma);

    void edit(TbTipoprograma tbTipoprograma);

    void remove(TbTipoprograma tbTipoprograma);

    TbTipoprograma find(Object id);

    List<TbTipoprograma> findAll();

    List<TbTipoprograma> findRange(int[] range);

    int count();
    
}
