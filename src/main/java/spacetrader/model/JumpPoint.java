package spacetrader.model;

import spacetrader.model.StarSystem;
import java.awt.geom.Point2D;

public class JumpPoint {
	private StarSystem targetSys;
	private Position targetPos;
	private Position pos;
<<<<<<< HEAD:src/main/java/spacetrader/model/JumpPoint.java
=======
	public static final String term = "Hargin Point";
>>>>>>> ab9749fac87c270cc8b945bb90495c54a7698e35:src/main/java/spacetrader/model/JumpPoint.java
        private int level;

	public JumpPoint(Position pos, StarSystem targetSys,
					 Position targetPos) {
		pos = this.pos;
		targetSys = this.targetSys;
		targetPos = this.targetPos;
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