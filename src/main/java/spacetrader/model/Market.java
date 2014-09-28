/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader.model;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author fsanchez
 */
class Market {
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
    }
}
