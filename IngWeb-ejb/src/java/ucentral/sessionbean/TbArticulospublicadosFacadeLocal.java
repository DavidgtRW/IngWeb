/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbArticulospublicados;

/**
 *
 * @author david
 */
@Local
public interface TbArticulospublicadosFacadeLocal {

    void create(TbArticulospublicados tbArticulospublicados);

    void edit(TbArticulospublicados tbArticulospublicados);

    void remove(TbArticulospublicados tbArticulospublicados);

    TbArticulospublicados find(Object id);

    List<TbArticulospublicados> findAll();

    List<TbArticulospublicados> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
    
}
