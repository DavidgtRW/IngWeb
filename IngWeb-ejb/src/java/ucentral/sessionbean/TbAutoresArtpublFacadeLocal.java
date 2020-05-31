/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucentral.sessionbean;

import java.util.List;
import javax.ejb.Local;
import ucentral.entities.TbAutoresArtpubl;

/**
 *
 * @author david
 */
@Local
public interface TbAutoresArtpublFacadeLocal {

    void create(TbAutoresArtpubl tbAutoresArtpubl);

    void edit(TbAutoresArtpubl tbAutoresArtpubl);

    void remove(TbAutoresArtpubl tbAutoresArtpubl);

    TbAutoresArtpubl find(Object id);

    List<TbAutoresArtpubl> findAll();

    List<TbAutoresArtpubl> findRange(int[] range);

    int count();
    
}
