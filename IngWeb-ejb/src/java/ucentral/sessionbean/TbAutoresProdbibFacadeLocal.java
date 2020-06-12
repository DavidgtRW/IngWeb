/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbAutoresProdbib;

/**
 *
 * @author david
 */
@Local
public interface TbAutoresProdbibFacadeLocal {

    void create(TbAutoresProdbib tbAutoresProdbib);

    void edit(TbAutoresProdbib tbAutoresProdbib);

    void remove(TbAutoresProdbib tbAutoresProdbib);

    TbAutoresProdbib find(Object id);

    List<TbAutoresProdbib> findAll();

    List<TbAutoresProdbib> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
}
