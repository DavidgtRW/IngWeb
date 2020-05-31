/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbInvestigadorPrograma;

/**
 *
 * @author david
 */
@Local
public interface TbInvestigadorProgramaFacadeLocal {

    void create(TbInvestigadorPrograma tbInvestigadorPrograma);

    void edit(TbInvestigadorPrograma tbInvestigadorPrograma);

    void remove(TbInvestigadorPrograma tbInvestigadorPrograma);

    TbInvestigadorPrograma find(Object id);

    List<TbInvestigadorPrograma> findAll();

    List<TbInvestigadorPrograma> findRange(int[] range);

    int count();
    
}
