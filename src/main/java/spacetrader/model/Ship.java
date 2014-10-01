package spacetrader.model;
<<<<<<< HEAD
=======
import java.util.List;
import java.util.ArrayList;
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35

/**
 * Ship model!
 */
public class Ship implements Tradeable {
<<<<<<< HEAD
    private double basePrice;
    private final String name;
    private int firePower;
    private final Inventory cargo;
    
    public Ship(String name) {
        this.name = name;
        basePrice = 1000;
        firePower = 10;
        cargo = new Inventory();
    }
    public Ship(String name, double basePrice, int firePower, int cargoSize) {
        this.name = name;
        this.firePower = firePower;
        this.basePrice = basePrice;
        cargo = new Inventory(cargoSize);
    }
    
    public boolean addItem(Item i) {
        return cargo.add(i);
    }
    
    public boolean removeItem(Item i) {
        return cargo.remove(i);
=======
    private final double basePrice;
    private final String name;
    private int firePower = 10;
    private int cargoSize = 15;
    private final List<Item> cargo;
    
    public Ship(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        cargo = new ArrayList<>();
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35
    }
    
    @Override
    public double getBasePrice() {
        return basePrice;
    }
    
<<<<<<< HEAD
    public String getName() {
        return name;
    }
    
    public Inventory getCargo() {
        return cargo;
    }
    public int getFirePower() {
        return firePower;
    }

    public void setCargoSize(int size) {
        cargo.setMaxSize(size);
=======
    public void setCargoSize(int size) {
        cargoSize = size;
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35
    }
    
    public void setFirePower(int power) {
        firePower = power;
    }
<<<<<<< HEAD
    public void setBasePrice(double value) {
        basePrice = value;
    }
    
    public boolean addToCargo(Item i) {
        return cargo.add(i);
=======
    
    public boolean addToCargo(Item i) {
        if (cargo.size() < cargoSize) {
            cargo.add(i);
            return true;
        }
        return false;
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35
    }
}