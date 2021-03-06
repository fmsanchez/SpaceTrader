package spacetrader.model;

public class Planet {

	private Position pos;
	private System system;
	private int techLevel;
	private String government;
	private String name;
        private Market market;

	public Planet(Position pos, System system, int techLevel, String government,
		String name) {
		this.name = name;
		this.pos = pos;
		this.system = system;
		this.techLevel = techLevel;
		this.government = government;
	}

    public Planet(String name, Position pos) {
        this.name=name;
        this.pos=pos;
    }
    
    public Market getMarket() {
        return market;
    }

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public System getSystem() {
		return system;
	}

}