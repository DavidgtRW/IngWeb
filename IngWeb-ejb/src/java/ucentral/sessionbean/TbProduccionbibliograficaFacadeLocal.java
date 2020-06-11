/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbProduccionbibliografica;

/**
 *
 * @author david
 */
@Local
public interface TbProduccionbibliograficaFacadeLocal {

    void create(TbProduccionbibliografica tbProduccionbibliografica);

    void edit(TbProduccionbibliografica tbProduccionbibliografica);

    void remove(TbProduccionbibliografica tbProduccionbibliografica);

    TbProduccionbibliografica find(Object id);

    List<TbProduccionbibliografica> findAll();

    List<TbProduccionbibliografica> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
    
}
