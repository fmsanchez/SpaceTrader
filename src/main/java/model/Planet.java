package model;

public class Planet {

	private Position pos;
        private String name;
	public Planet(Position pos) {
		this.pos = pos;
	}

        public Planet(String name, Position pos) {
            this.name=name;
            this.pos=pos;
        }

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

}