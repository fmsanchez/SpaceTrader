import java.util.List;
import java.util.ArrayList;

public class StarSystem {

	private Position pos;
	private List<Planet> planets;
	private List<JumpPoint> jumpPoints;

	public StarSystem(Position pos) {
		this.pos = pos;
		this.planets = new ArrayList<Planet>();
	}

	public void addPlanet(Planet planet) {
		planets.add(planet);
	}

	public void addJumpPoint(Position pos, StarSystem targetSys, Position targetPos) {
		jumpPoints.add(new JumpPoint(pos, targetSys, targetPos));
		targetSys.asymmetricalAddJumpPoint(new JumpPoint(targetPos, this, pos));
	}

	private void asymmetricalAddJumpPoint(JumpPoint jumpPoint) {
		jumpPoints.add(jumpPoint);
	}

}
