package model;

import java.util.List;
import java.util.ArrayList;
import graph.Node;
import java.util.HashMap;
import java.util.Objects;
public class StarSystem implements Node{

	private String name;
	private Position pos;
	private StarType starType;
	private List<Planet> planets;
	private HashMap<Node,JumpPoint> jumpPoints;
        private Faction faction;
	public Position getPosition() {
		return pos;
	}

	public StarSystem(String name, Position pos, StarType starType) {
		this.name = name;
		this.pos = pos;
		this.planets = new ArrayList<Planet>();
		this.jumpPoints = new HashMap<Node,JumpPoint>();
		this.starType = starType;
                this.faction=Faction.NoFaction;
	}

	public void addPlanet(Planet planet) {
		planets.add(planet);
	}

	public void addJumpPoint(Position pos, StarSystem targetSys, Position targetPos) {
		jumpPoints.put(targetSys,new JumpPoint(pos, targetSys, targetPos));
		targetSys.asymmetricalAddJumpPoint(this,new JumpPoint(targetPos, this, pos));
	}

	private void asymmetricalAddJumpPoint(StarSystem from,JumpPoint jumpPoint) {
		jumpPoints.put(from,jumpPoint);
	}
        public ArrayList<StarSystem> getNeighbors(){
            ArrayList<StarSystem> out=new ArrayList();
            jumpPoints.forEach((k,v) -> {
                out.add(v.getTargetSystem());
            });
            return out;
        }
        public void setFaction(Faction f){
            faction=f;
        }
        public Faction getFaction(){
            return faction;
        }
        public JumpPoint getJumpPoint(StarSystem s){
            return jumpPoints.get(s);
        }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.pos);
        return hash;
    }

}