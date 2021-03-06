/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbInstitucionprograma;

/**
 *
 * @author david
 */
@Local
public interface TbInstitucionprogramaFacadeLocal {

    void create(TbInstitucionprograma tbInstitucionprograma);

    void edit(TbInstitucionprograma tbInstitucionprograma);

    void remove(TbInstitucionprograma tbInstitucionprograma);

    TbInstitucionprograma find(Object id);

    List<TbInstitucionprograma> findAll();

    List<TbInstitucionprograma> findRange(int[] range);

    int count();
    
    int ultimoRegistro();
    
}
