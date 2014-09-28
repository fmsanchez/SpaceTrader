/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader.economy;

import java.util.ArrayList;
import java.util.HashMap;
import spacetrader.model.Item;

/**
 * Work in progress. 
 * Handles the pricing and transfer of items in between traders. Validates if the trade is reasonable. 
 * @author Tyler Allen <tallen40@gatech.edu>
 */
class Trade {
    /*
    Subtrade is a class that keeps track of prices and amounts from one side of a trade request.
    I.E t sells and t buys are both subtrades 
    For a trade there are 4 subtrades, a buy and sell for each trader. 
    */
    public class SubTrade{
        private Trader t;
        private HashMap<Item,Integer> amount;
        private HashMap<Item,Integer> price;
        public SubTrade(Trader t1){
            t=t1;
        }
        public void addItem(Item i,int a,int p){
            this.amount.put(i,a);
            this.price.put(i, p);
        }
        public ArrayList<Item> getItems(){
            return new ArrayList<Item>(this.amount.keySet());
        }
        public int getPrice(Item i){
            return price.get(i);
        }
        public int getAmount(Item i){
            return amount.get(i);
        }
        public HashMap<Item,Integer> getAmountMap(){
            return amount;
        }
        public HashMap<Item,Integer> getPriceMap(){
            return price;
        }

        public int getTotal(Item i){
            return price.get(i)*amount.get(i);
        }
        public int getTotal(){
            int sum=0;
            for(Item i: price.keySet()){
                sum=sum+getTotal(i);
            }
            return sum;
        }
    }
    private Trader t1,t2;
    private SubTrade t1Sell;
    private SubTrade t1Buy;
    private SubTrade t2Sell;
    private SubTrade t2Buy;
    public Trade(Trader t1,Trader t2){
        this.t1=t1;
        this.t2=t2;
    }
    public void setSubTrade(SubTrade t1b,SubTrade t1s,SubTrade t2b,SubTrade t2s){
        t1Sell=t1s;
        t1Buy=t1b;
        t2Sell=t2s;
        t2Buy=t2b;
    }
    public boolean validate(){
        boolean t1Good=t1.getMoney()+t1Sell.getTotal()>=t1Buy.getTotal();
        boolean t2Good=t2.getMoney()+t2Sell.getTotal()>=t2Buy.getTotal();
        return t1Good&&t2Good;
    }
    public void transfer(){
        t1.addMoney(t1Sell.getTotal());
        t1.addMoney(t1Buy.getTotal());
        t1.addItems(t1Buy.getAmountMap());
        t1.removeItems(t1Sell.getAmountMap());

        
        t2.addMoney(t2Sell.getTotal());
        t2.addMoney(t2Buy.getTotal());
        t2.addItems(t2Buy.getAmountMap());
        t2.removeItems(t2Sell.getAmountMap());

    }
}
