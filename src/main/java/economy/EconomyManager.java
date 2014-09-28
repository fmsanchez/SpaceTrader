/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package economy;

import java.util.HashMap;
import model.Item;

/**
 *
 * @author Tyler Allen <tallen40@gatech.edu>
 */
public abstract class EconomyManager {
    public abstract boolean initiateTrade(Trader t1,Trader t2);
    public abstract boolean handleTradeLogic(Trade t);
    public abstract boolean isTradeViable(Trade t); 
    public abstract Trade generateTrade(Trader t1,Trader t2);
}
