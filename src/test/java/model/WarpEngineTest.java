package model;

import static org.junit.Assert.*;
import java.awt.Point;
import org.junit.*;
import game.*;

public class WarpEngineTest {

	public int warpFactor = 1;
	public Location location = new Location(2, new Point(3,4));
	
	public Game getTestGame(){
		return new Game(1, 1, 10, new Location(2, new Point(5,6)));
	}
	

	
	@Test
	public void testEnergyConsumed(){	
		ShipReserve shipReserve = new ShipReserve();
		Game game = getTestGame();
		int originalEnergy = shipReserve.getEnergyPoints();
		
		WarpEngine we = new WarpEngine(shipReserve, game);
		we.warp(warpFactor, location);	
		int newEnergy = shipReserve.getEnergyPoints();
		assertTrue(newEnergy < originalEnergy);
	}
	
	@Test
	public void testStarDatesConsumed(){		
		ShipReserve shipReserve = new ShipReserve();
		Game game = getTestGame();
		int originalDates = game.getNumStarDates();
		
		WarpEngine we = new WarpEngine(shipReserve, game);
		we.warp(warpFactor, location);	
		int newDates = game.getNumStarDates();
		assertTrue(newDates < originalDates);
	}
	
	@Test
	public void testDamagedWarpEnginedNotConsumedEnergy(){	
		ShipReserve shipReserve = new ShipReserve();
		Game game = getTestGame();
		
		int originalEnergy = shipReserve.getEnergyPoints();
		WarpEngine we = new WarpEngine(shipReserve, game);
		we.setDamaged();
		we.warp(warpFactor, location);
		int newEnergy = shipReserve.getEnergyPoints();
		assertEquals(originalEnergy, newEnergy);
		
	}

	@Test
	public void testDamagedWarpEngineNotConsumedDates(){		
		ShipReserve shipReserve = new ShipReserve();
		Game game = getTestGame();
		
		int originalDates = game.getNumStarDates();
		WarpEngine we = new WarpEngine(shipReserve, game);
		we.setDamaged();
		we.warp(warpFactor, location);
		int newDates = game.getNumStarDates();
		assertEquals(originalDates, newDates);
	}
	
	
}
