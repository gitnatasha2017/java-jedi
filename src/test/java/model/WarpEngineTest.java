package model;

import static org.junit.Assert.*;
import java.awt.Point;
import org.junit.*;
import game.*;

public class WarpEngineTest {
	
	@Test
	public void testEnergyConsumed(){
		int warpFactor = 1;
		Location location = new Location(2, new Point(3,4));
		
		ShipReserve shipReserve = new ShipReserve();
		Game game = new Game(1, 1, 10, new Location(2, new Point(5,6)));
		int originalEnergy = shipReserve.getEnergyPoints();
		
		WarpEngine we = new WarpEngine(shipReserve, game);
		we.warp(warpFactor, location);
		
		int newEnergy = shipReserve.getEnergyPoints();
		assertTrue(newEnergy < originalEnergy);
	}
	
	@Test
	public void testStarDatesConsumed(){
		int warpFactor = 1;
		Location location = new Location(2, new Point(3,4));
		
		ShipReserve shipReserve = new ShipReserve();
		Game game = new Game(1, 1, 10, new Location(2, new Point(5,6)));
		int originalDates = game.getNumStarDates();
		
		WarpEngine we = new WarpEngine(shipReserve, game);
		we.warp(warpFactor, location);
		
		int newDates = game.getNumStarDates();
		System.out.println("newDates = " + newDates);
		System.out.println("originalDates = " + originalDates);
		assertTrue(newDates < originalDates);
	}
	
	@Test
	public void testWarpEngine(){
		
	}
	
}
