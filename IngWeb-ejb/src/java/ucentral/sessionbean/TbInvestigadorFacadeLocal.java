/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbInvestigador;

/**
 *
 * @author david
 */
@Local
public interface TbInvestigadorFacadeLocal {

    void create(TbInvestigador tbInvestigador);

    void edit(TbInvestigador tbInvestigador);

    void remove(TbInvestigador tbInvestigador);

    TbInvestigador find(Object id);

    List<TbInvestigador> findAll();

    List<TbInvestigador> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
    
    void modificar(TbInvestigador tbInvestigador);
    
}
