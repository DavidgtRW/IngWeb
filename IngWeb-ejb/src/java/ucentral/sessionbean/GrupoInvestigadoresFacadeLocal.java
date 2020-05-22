/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.GrupoInvestigadores;

/**
 *
 * @author david
 */
@Local
public interface GrupoInvestigadoresFacadeLocal {

    void create(GrupoInvestigadores grupoInvestigadores);

    void edit(GrupoInvestigadores grupoInvestigadores);

    void remove(GrupoInvestigadores grupoInvestigadores);

    GrupoInvestigadores find(Object id);

    List<GrupoInvestigadores> findAll();

    List<GrupoInvestigadores> findRange(int[] range);

    int count();
    
}
