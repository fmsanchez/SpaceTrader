package spacetrader.model;
import java.util.List;
import java.util.ArrayList;

/**
 * Ship model!
 */
public class Ship implements Tradeable {
    private final double basePrice;
    private final String name;
    private int firePower = 10;
    private int cargoSize = 15;
    private final List<Item> cargo;
    
    public Ship(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        cargo = new ArrayList<>();
    }
    
    @Override
    public double getBasePrice() {
        return basePrice;
    }
    
    public void setCargoSize(int size) {
        cargoSize = size;
    }
    
    public void setFirePower(int power) {
        firePower = power;
    }
    
    public boolean addToCargo(Item i) {
        if (cargo.size() < cargoSize) {
            cargo.add(i);
            return true;
        }
        return false;
    }
}