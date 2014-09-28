public class Planet {

	private Position pos;
	private System system;
	private int techLevel;
	private String government;

	public Planet(Position pos, System system, int techLevel, String government) {
		this.pos = pos;
		this.system = system;
		this.techLevel = techLevel;
		this.government = government;
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