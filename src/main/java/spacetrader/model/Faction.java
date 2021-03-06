/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader.model;
import spacetrader.graph.Heurstic;
import spacetrader.graph.Node;
/**
 *
 * @author Tyler Allen <tallen40@gatech.edu>
 */
public enum Faction {
    NoFaction,Test1,Test2;
    public static class Test1Heurstic extends Heurstic<StarSystem>{

        @Override
        public int calculate(StarSystem n1, StarSystem n2) {
            return n1.getJumpPoint(n2).getLevel();
        }
    }
}
