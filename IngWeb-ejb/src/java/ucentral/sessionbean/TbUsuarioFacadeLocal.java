/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbUsuario;

/**
 *
 * @author david
 */
@Local
public interface TbUsuarioFacadeLocal {

    void create(TbUsuario tbUsuario);

    void edit(TbUsuario tbUsuario);

    void remove(TbUsuario tbUsuario);

    TbUsuario find(Object id);

    List<TbUsuario> findAll();

    List<TbUsuario> findRange(int[] range);

    int count();
    
    TbUsuario findByCredenciales(String usuario, String contraseña);
    
    int ultimoRegistro();
    
}
