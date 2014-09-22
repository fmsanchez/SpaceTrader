import java.util.ArrayList;

public class System {

	private Position pos;
	private ArrayList<Planet> planets;
	private ArrayList<JumpPoint> jumpPoints;

	public System(Position pos) {
		this.pos = pos;
		this.planets = new ArrayList<Planet>();
	}

	public void addPlanet(Planet planet) {
		planets.add(planet);
	}

	public void addJumpPoint(Position pos, System targetSys, Position targetPos) {
		jumpPoints.add(new JumpPoint(pos, targetSys, targetPos));
		targetSys.asymetricalAddJumpPoint(new JumpPoint(targetPos, this, pos));
	}

	private void asymetricalAddJumpPoint(JumpPoint jumpPoint) {
		jumpPoints.add(jumpPoint);
	}

}
