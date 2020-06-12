/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbAsignaturasimpartidas;

/**
 *
 * @author david
 */
@Local
public interface TbAsignaturasimpartidasFacadeLocal {

    void create(TbAsignaturasimpartidas tbAsignaturasimpartidas);

    void edit(TbAsignaturasimpartidas tbAsignaturasimpartidas);

    void remove(TbAsignaturasimpartidas tbAsignaturasimpartidas);

    TbAsignaturasimpartidas find(Object id);

    List<TbAsignaturasimpartidas> findAll();

    List<TbAsignaturasimpartidas> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
    
}
