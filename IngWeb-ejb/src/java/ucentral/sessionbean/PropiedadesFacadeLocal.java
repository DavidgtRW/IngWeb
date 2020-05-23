/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.Propiedades;

/**
 *
 * @author david
 */
@Local
public interface PropiedadesFacadeLocal {

    void create(Propiedades propiedades);

    void edit(Propiedades propiedades);

    void remove(Propiedades propiedades);

    Propiedades find(Object id);

    List<Propiedades> findAll();

    List<Propiedades> findRange(int[] range);

    int count();
    
}
