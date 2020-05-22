/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TipoDato;

/**
 *
 * @author david
 */
@Local
public interface TipoDatoFacadeLocal {

    void create(TipoDato tipoDato);

    void edit(TipoDato tipoDato);

    void remove(TipoDato tipoDato);

    TipoDato find(Object id);

    List<TipoDato> findAll();

    List<TipoDato> findRange(int[] range);

    int count();
    
}
