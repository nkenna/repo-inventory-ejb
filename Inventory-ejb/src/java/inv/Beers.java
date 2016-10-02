/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author STEINACOZ-PC
 */
@Entity
@Table(name = "beers")
@NamedQueries({
    @NamedQuery(name = "Beers.findAll", query = "SELECT b FROM Beers b")})
public class Beers implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
 
    private String beername;
   

    private String price;

    public Beers() {
    }

   

   

    @Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="id")
    public int getId() {
        return id;
        
    }

    public void setId(int bid) {
  this.id = bid;
    }

    public String getBeername() {
        return beername;
    }

    public void setBeername(String beername) {
        this.beername = beername;
    }
    
    
    public String getPrice() {
        return price;
    }

    public void setPrice(String beerPrice) {
        this.price = beerPrice;
    }

  
    
}
