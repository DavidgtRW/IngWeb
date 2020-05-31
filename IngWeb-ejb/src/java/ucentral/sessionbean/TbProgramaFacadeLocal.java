/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbPrograma;

/**
 *
 * @author david
 */
@Local
public interface TbProgramaFacadeLocal {

    void create(TbPrograma tbPrograma);

    void edit(TbPrograma tbPrograma);

    void remove(TbPrograma tbPrograma);

    TbPrograma find(Object id);

    List<TbPrograma> findAll();

    List<TbPrograma> findRange(int[] range);

    int count();
    
}
