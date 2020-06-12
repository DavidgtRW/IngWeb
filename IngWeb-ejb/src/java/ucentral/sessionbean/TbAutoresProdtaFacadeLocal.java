/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbAutoresProdta;

/**
 *
 * @author david
 */
@Local
public interface TbAutoresProdtaFacadeLocal {

    void create(TbAutoresProdta tbAutoresProdta);

    void edit(TbAutoresProdta tbAutoresProdta);

    void remove(TbAutoresProdta tbAutoresProdta);

    TbAutoresProdta find(Object id);

    List<TbAutoresProdta> findAll();

    List<TbAutoresProdta> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
}
