/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.Convocatoria;

/**
 *
 * @author david
 */
@Local
public interface ConvocatoriaFacadeLocal {

    void create(Convocatoria convocatoria);

    void edit(Convocatoria convocatoria);

    void remove(Convocatoria convocatoria);

    Convocatoria find(Object id);

    List<Convocatoria> findAll();

    List<Convocatoria> findRange(int[] range);

    int count();
    
}
