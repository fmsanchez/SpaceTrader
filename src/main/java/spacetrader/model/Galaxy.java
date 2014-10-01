package spacetrader.model;

import spacetrader.model.StarSystem;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Galaxy {

	private Map<Position,StarSystem> systems;

	public Galaxy () {
		systems = new HashMap();
	}

	public void addSystem(StarSystem system) {
		systems.put(system.getPosition(),system);
	}
<<<<<<< HEAD
        public Map<Position,StarSystem> getHashMap(){
            return systems;
        }
	public List<StarSystem> getSystems() {
		return new ArrayList<StarSystem>(systems.values());
	}

=======

	public void replaceSystems(List<StarSystem> systems) {

		this.systems = new HashMap();
		for (StarSystem system : systems) {
			addSystem(system);
		}
	}

    public Map<Position,StarSystem> getHashMap(){
        return systems;
    }

	public List<StarSystem> getSystems() {
		return new ArrayList<StarSystem>(systems.values());
	}
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35
}