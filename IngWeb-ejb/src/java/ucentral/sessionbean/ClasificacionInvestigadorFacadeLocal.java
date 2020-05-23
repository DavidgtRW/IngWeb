/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.ClasificacionInvestigador;

/**
 *
 * @author david
 */
@Local
public interface ClasificacionInvestigadorFacadeLocal {

    void create(ClasificacionInvestigador clasificacionInvestigador);

    void edit(ClasificacionInvestigador clasificacionInvestigador);

    void remove(ClasificacionInvestigador clasificacionInvestigador);

    ClasificacionInvestigador find(Object id);

    List<ClasificacionInvestigador> findAll();

    List<ClasificacionInvestigador> findRange(int[] range);

    int count();
    
}
