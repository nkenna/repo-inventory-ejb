/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author STEINACOZ-PC
 */
@Remote
public interface InventoryRemote {
    
    void addBeer(Beers IE);
    List<Beers> getAllBeers();

    
    
}
