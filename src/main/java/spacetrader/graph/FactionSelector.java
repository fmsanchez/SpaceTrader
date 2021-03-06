/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader.graph;

import spacetrader.model.Faction;
import spacetrader.model.StarSystem;

/**
 *
 * @author Tyler Allen <tallen40@gatech.edu>
 * @param <F>
 */
public class FactionSelector extends GraphGrower<StarSystem>{
    private Faction faction;
    private boolean done;
    public FactionSelector(Heurstic h,Faction f) {
        super(h);
        this.faction=f;
        this.done=false;
    }
    @Override
    public void update(){
        StarSystem sys;
        do{
            sys=popNext();
            if(sys==null){
                done=true;
                return;
            }
        }while(sys.getFaction()!=Faction.NoFaction);
        if(sys.getFaction()==Faction.NoFaction){
            sys.setFaction(faction);
            //System.out.println(sys.getFaction());
            addToSet(sys);
            this.addNeighbor(sys.getNeighbors());
        }else{
            done=true;
        }
    }
    public boolean isDone(){
        return done;
    }
}
