package spacetrader.generators;

<<<<<<< HEAD:src/main/java/spacetrader/generators/PlanetGenerator.java

=======
import spacetrader.Util;
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35:src/main/java/spacetrader/generators/PlanetGenerator.java
import spacetrader.model.Planet;
import spacetrader.model.Position;
import spacetrader.model.StarSystem;

/**
 * @author Michael Lane
 */
public abstract class PlanetGenerator {

	protected String name;
	protected Position pos;
	protected StarSystem system;

	protected PlanetGenerator(String name, Position pos, StarSystem system) {

		setName(name);
		setPosition(pos);
		setSystem(system);
	}

	public abstract Planet generate();

	public final void setName(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException("invalid planet name");
		}
		this.name = name;
	}

	public final void setPosition(Position pos) {
		if (pos == null) {
			throw new IllegalArgumentException("position must be non-null");
		}
		this.pos = pos;
	}

	public final void setSystem(StarSystem system) {
		if (system == null) {
			throw new IllegalArgumentException("system must be non-null");
		}
		this.system = system;
	}

}