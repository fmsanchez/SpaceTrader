package model;

import model.StarSystem;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Galaxy {

	private HashMap<Position,StarSystem> systems;

	public Galaxy () {
		systems = new HashMap();
	}

	public void addSystem(StarSystem system) {
		systems.put(system.getPosition(),system);
	}
        public HashMap<Position,StarSystem> getHashMap(){
            return systems;
        }
	public List<StarSystem> getSystems() {
		return new ArrayList<StarSystem>(systems.values());
	}

}