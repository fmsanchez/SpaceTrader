/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package economy;

/**
 * This class handles the control of the economy and trading. This is a rough work in progress, and probably will be changed at some point. 
 * @author Tyler Allen <tallen40@gatech.edu>
 */
public class SimpleEconomyManager extends EconomyManager {
    public final int TRADE_DISTANCE=10;
    @Override
    public boolean initiateTrade(Trader t1, Trader t2) {
        return t1.getPosition().distTo(t2.getPosition())<TRADE_DISTANCE;
    }

    @Override
    public boolean handleTradeLogic(Trade t) {
        if(isTradeViable(t)){
            t.transfer();
            return true;
        }
        return false;
    }

    @Override
    public boolean isTradeViable(Trade t) {
        return t.validate();
    }

    @Override
    public Trade generateTrade(Trader t1, Trader t2) {
        return new Trade(t1,t2);
    }
    
}
