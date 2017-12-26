package com.gameoflife.www;

public abstract class Cell {
	
	public abstract Cell newGeneration(int nbNeighbours);

	public abstract String getAsString();

	public abstract boolean isAlive();
}
