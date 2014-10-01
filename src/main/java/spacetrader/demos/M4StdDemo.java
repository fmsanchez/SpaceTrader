package spacetrader.demos;

// import spacetrader.ui.StdDraw;
import spacetrader.model.Galaxy;
import spacetrader.model.StarSystem;
import spacetrader.model.Position;
import spacetrader.Util;
import spacetrader.generators.EllipticalGalaxyGenerator;
import spacetrader.generators.GalaxyGenerator;
import spacetrader.graph.FactionSelector;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.awt.Graphics;
import spacetrader.model.Faction;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;

public class M4StdDemo extends JPanel{

	private static int FRAME_SIZE_FACTOR = 40;
	private static double BOUND_FACTOR = 2; 
	private static double SYSTEM_NUM_MEAN = 100;
	private static double SYSTEM_NUM_SD = 10;
	private static double X_SD = 5;
	private static double Y_SD = 2;
	private static double SCALE = 1;
	private static int FRAME_SIZE = (int) (SCALE * FRAME_SIZE_FACTOR * BOUND_FACTOR * Math.max(X_SD, Y_SD));
	private static int DOT_SIZE = 26;

	private static Galaxy gax;

	public static void main(String[] args) {

		// EllipticalGalaxy test
		GalaxyGenerator gaxGen = new EllipticalGalaxyGenerator(
			"Fartdust",
			SYSTEM_NUM_MEAN, 
			SYSTEM_NUM_SD, 
			X_SD, Y_SD, 
			BOUND_FACTOR*X_SD, BOUND_FACTOR*Y_SD, 
			Util.sampleFromUniformReal(0, Math.PI)
			);
		gax = gaxGen.generate();
		List<StarSystem> systems = gax.getSystems();

		StarSystem t1=systems.get(0);
		StarSystem t2=systems.get(1);
		FactionSelector f1=new FactionSelector(new Faction.Test1Heurstic(),Faction.Test1);
		f1.addNeighbor(t1);
		FactionSelector f2=new FactionSelector(new Faction.Test1Heurstic(),Faction.Test2);
		f2.addNeighbor(t2);
		do{
			f1.update();
			f2.update();
		}while(!f1.isDone()&&!f2.isDone());


		// draw the Galaxy
		StdDraw.setCanvasSize(800, 800);
		double sMax = -Double.MAX_VALUE;
		double sMin = Double.MAX_VALUE;
		for (StarSystem s : gax.getSystems()) {
			sMax = sMax > s.getX() ? sMax : s.getX();
			sMin = sMin < s.getX() ? sMin : s.getX();
			sMax = sMax > s.getY() ? sMax : s.getY();
			sMin = sMin < s.getY() ? sMin : s.getY();
		}
		StdDraw.setXscale(sMin, sMax);
		StdDraw.setYscale(sMin, sMax);

		double systemRadius = 0.1;
		boolean running = true;
		while (running) {
			StdDraw.show(30);
			StdDraw.clear();
			// draw systems
			StdDraw.setPenColor(StdDraw.BLACK);
			for (StarSystem s : gax.getSystems()) {
				StdDraw.filledCircle(s.getX(), s.getY(), systemRadius);
			}
			// mouse-dependent renders
			for (StarSystem s : gax.getSystems()) {
				Position sp = new Position(s.getX(), s.getY());
				Position mp = new Position(StdDraw.mouseX(), StdDraw.mouseY());
				if (sp.distTo(mp) < systemRadius) {
					StdDraw.setPenColor(StdDraw.RED);
					StdDraw.filledCircle(s.getX(), s.getY(), systemRadius);
					for (StarSystem n : s.getNeighbors()) {
						StdDraw.setPenColor(StdDraw.BLUE);
						StdDraw.line(sp.x, sp.y, n.getX(), n.getY());
					}
					StdDraw.setPenColor(StdDraw.RED);
					StdDraw.text(0, sMax, s.toString());
					break;
				}
			}


		}


	}
}