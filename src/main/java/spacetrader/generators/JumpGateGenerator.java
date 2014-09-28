/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader.generators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import spacetrader.model.Position;
import spacetrader.model.StarSystem;

/**
 *
 * @author Tyler Allen <tallen40@gatech.edu>
 */
public class JumpGateGenerator {
    public final int JUMPGATE_NUM=4;
    private class closeComparator implements Comparator<StarSystem>{
        private StarSystem home;
        public closeComparator(StarSystem home){
            this.home=home;
        }
        @Override
        public int compare(StarSystem t, StarSystem t1) {
            int q1=(int) home.getPosition().distTo(t.getPosition());
            int q2=(int) home.getPosition().distTo(t1.getPosition());
            return q1-q2;
        }
    
    }
    private ArrayList<StarSystem> starSystems;
    public JumpGateGenerator(ArrayList<StarSystem> s){
        starSystems=s;
    }
    public void generate(){
        PriorityQueue<StarSystem> pq;
        for(StarSystem s:starSystems){
            pq=new PriorityQueue(new closeComparator(s));
            pq.addAll(starSystems);
            ArrayList<StarSystem> neighbors=new ArrayList();
            int i=0;
            do{
                StarSystem t=pq.poll();
                if(t==null){
                    break;
                }
                if(!t.getNeighbors().contains(s)){
                    i++;
                    neighbors.add(t);
                }
            }while(neighbors.size()<JUMPGATE_NUM);
            neighbors.stream().forEach((t) -> {
                s.addJumpPoint(s.getPosition(),t,t.getPosition());
            });
        }
    }
}
