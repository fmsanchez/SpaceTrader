package spacetrader.generators;

import spacetrader.model.Planet;
import spacetrader.model.Position;
import spacetrader.model.StarSystem;
<<<<<<< HEAD:src/main/java/spacetrader/generators/SimplePlanetGenerator.java
=======
import spacetrader.Util;
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35:src/main/java/spacetrader/generators/SimplePlanetGenerator.java

/**
 * @author Michael Lane
 */
public class SimplePlanetGenerator extends PlanetGenerator {

    public SimplePlanetGenerator(
    	String name, 
    	Position pos, 
    	StarSystem system) {
    	
    	super(name, pos, system);
    }
    
	public Planet generate() {
		return new Planet(name, pos);
	}
}
