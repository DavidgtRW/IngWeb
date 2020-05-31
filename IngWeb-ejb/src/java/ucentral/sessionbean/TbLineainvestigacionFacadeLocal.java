/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbLineainvestigacion;

/**
 *
 * @author david
 */
@Local
public interface TbLineainvestigacionFacadeLocal {

    void create(TbLineainvestigacion tbLineainvestigacion);

    void edit(TbLineainvestigacion tbLineainvestigacion);

    void remove(TbLineainvestigacion tbLineainvestigacion);

    TbLineainvestigacion find(Object id);

    List<TbLineainvestigacion> findAll();

    List<TbLineainvestigacion> findRange(int[] range);

    int count();
    
}
