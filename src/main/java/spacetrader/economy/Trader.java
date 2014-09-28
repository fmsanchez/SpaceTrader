/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader.economy;

import java.util.ArrayList;
import java.util.HashMap;
import spacetrader.model.Item;
import spacetrader.model.Position;

/**
 * Interface to handle traders. Not so sure this is the correct way to go about things.
 * @author Tyler Allen <tallen40@gatech.edu>
 */
public interface Trader {
    public ArrayList<Item> getSelling();
    public ArrayList<Item> getBuying();
    public Position getPosition();
    public void addItems(HashMap<Item,Integer> amountMap);
    public void removeItems(HashMap<Item,Integer> amountMap);
    public int getBuyPrice(Item item);
    public int getSellPrice(Item item);
    public int setBuyPrice(Item item,int price);
    public int setSellPrice(Item item,int price);
    public int getMoney();
    public int addMoney(int amount);
}
