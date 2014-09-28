/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader.model;

/**
 *
 * @author Tyler Allen <tallen40@gatech.edu>
 */
public class Item implements Tradeable {
    private final String name;
    private final int basePrice;
    
    /**
     * Constructor for Item
     * @param name
     * @param basePrice
     */
    public Item(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }
    
    public String getName() {
        return name;
    }
    public int getBasePrice() {
        return basePrice;
    }
}
