/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv;

import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author STEINACOZ-PC
 */
@Stateless
@WebService(serviceName = "BeerService")
public class InventoryPersistBean implements InventoryRemote{
    
    Beers b = null;

    public InventoryPersistBean() {
    }
    
@PersistenceContext(unitName="Inventory-ejbPU")
    private EntityManager em;    

    @Override
    public void addBeer(Beers IE) {
        
        em.persist(IE);
       em.flush();
      }

    @Override
    @WebMethod(operationName = "getAllBeers")
    public List<Beers> getAllBeers() {
        return em.createQuery("From Beers").getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

   

   
}
