package model;

import java.awt.Point;
import game.Location;
import game.Game;

public class WarpEngine extends SubSystem{

	ShipReserve shipReserve;
	Game game;
	
	public WarpEngine(ShipReserve shipReserve, Game game){
		this.shipReserve = shipReserve;
		this.game = game;
		
	}
	

	
	public void warp(int warpFactor, Location location) {
		int currentEnergy = shipReserve.getEnergyPoints();
		currentEnergy = currentEnergy - 100;
		shipReserve.setEnergyPoints(currentEnergy);
		
		int currentDates = game.getNumStarDates();
		currentDates = currentDates - 2;
		game.setNumStarDates(currentDates);
		
	}


	
}


