/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbAsignaturasPrograma;

/**
 *
 * @author david
 */
@Local
public interface TbAsignaturasProgramaFacadeLocal {

    void create(TbAsignaturasPrograma tbAsignaturasPrograma);

    void edit(TbAsignaturasPrograma tbAsignaturasPrograma);

    void remove(TbAsignaturasPrograma tbAsignaturasPrograma);

    TbAsignaturasPrograma find(Object id);

    List<TbAsignaturasPrograma> findAll();

    List<TbAsignaturasPrograma> findRange(int[] range);

    int count();
    
}
