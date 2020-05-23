/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.Investigador;

/**
 *
 * @author david
 */
@Local
public interface InvestigadorFacadeLocal {

    void create(Investigador investigador);

    void edit(Investigador investigador);

    void remove(Investigador investigador);

    Investigador find(Object id);

    List<Investigador> findAll();

    List<Investigador> findRange(int[] range);

    int count();
    
}
