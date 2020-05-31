/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbInstitucion;

/**
 *
 * @author david
 */
@Local
public interface TbInstitucionFacadeLocal {

    void create(TbInstitucion tbInstitucion);

    void edit(TbInstitucion tbInstitucion);

    void remove(TbInstitucion tbInstitucion);

    TbInstitucion find(Object id);

    List<TbInstitucion> findAll();

    List<TbInstitucion> findRange(int[] range);

    int count();
    
}
