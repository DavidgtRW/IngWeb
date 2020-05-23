/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.DatosHojaVida;

/**
 *
 * @author david
 */
@Local
public interface DatosHojaVidaFacadeLocal {

    void create(DatosHojaVida datosHojaVida);

    void edit(DatosHojaVida datosHojaVida);

    void remove(DatosHojaVida datosHojaVida);

    DatosHojaVida find(Object id);

    List<DatosHojaVida> findAll();

    List<DatosHojaVida> findRange(int[] range);

    int count();
    
}
