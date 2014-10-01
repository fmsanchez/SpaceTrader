/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader.model;
<<<<<<< HEAD
=======
import java.util.List;
import java.util.ArrayList;
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35

/**
 *
 * @author fsanchez
 */
public class Market {
<<<<<<< HEAD
    private Inventory cargo;
    private final Planet planet;
    
    public Market(Inventory cargo, Planet planet) {
        this.cargo = cargo;
        this.planet = planet;
    }
    
    public boolean addItem(Item i) {
        return cargo.add(i);
    }
    
    public boolean removeItem(Item i) {
        return cargo.remove(i);
    }
    
    public Inventory getItems() {
        return cargo;
    }
    public Planet getPlanet() {
        return planet;
    }
    public Inventory getCargo() {
        return cargo;
    }

    public void setCargo(Inventory cargo) {
        this.cargo = cargo;
=======
    private List<Item> items;
    private Planet planet;
    
    public Market(List<Item> items, Planet planet) {
        this.items = items;
        this.planet = planet;
    }
    public Market(List<Item> items) {
        this.items = items;
    }
    
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35
    }
}
