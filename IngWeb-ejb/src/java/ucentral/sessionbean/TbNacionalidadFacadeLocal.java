/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbNacionalidad;

/**
 *
 * @author david
 */
@Local
public interface TbNacionalidadFacadeLocal {

    void create(TbNacionalidad tbNacionalidad);

    void edit(TbNacionalidad tbNacionalidad);

    void remove(TbNacionalidad tbNacionalidad);

    TbNacionalidad find(Object id);

    List<TbNacionalidad> findAll();

    List<TbNacionalidad> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
    
}
