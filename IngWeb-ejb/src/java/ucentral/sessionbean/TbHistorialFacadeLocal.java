/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbHistorial;

/**
 *
 * @author david
 */
@Local
public interface TbHistorialFacadeLocal {

    void create(TbHistorial tbHistorial);

    void edit(TbHistorial tbHistorial);

    void remove(TbHistorial tbHistorial);

    TbHistorial find(Object id);

    List<TbHistorial> findAll();

    List<TbHistorial> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
    
}
