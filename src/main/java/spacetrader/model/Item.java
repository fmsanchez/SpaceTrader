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
    private final double basePrice;
    
    /**
     * Constructor for Item
     * @param name
     * @param basePrice
     */
    public Item(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }
    
    public String getName() {
        return name;
    }
<<<<<<< HEAD
    
    @Override
=======
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35
    public double getBasePrice() {
        return basePrice;
    }
}
