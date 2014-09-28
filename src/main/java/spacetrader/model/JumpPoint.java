package spacetrader.model;

import spacetrader.model.StarSystem;
import java.awt.geom.Point2D;

public class JumpPoint {
	private StarSystem targetSys;
	private Position targetPos;
	private Position pos;
        private int level;

	public JumpPoint(Position pos, StarSystem targetSys,
					 Position targetPos) {
		this.pos=pos;
		this.targetSys=targetSys;
		this.targetPos=targetPos;
                level=1;
	}

	public Position getPos() {
		return pos;
	}

	public StarSystem getTargetSystem() {
		return targetSys;
	}

	public Position getTargetPos() {
		return targetPos;
	}
        public int getLevel(){
            return level;
        }

}