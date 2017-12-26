package com.gameoflife.www;

public class AliveCell extends Cell {
	@Override
	public Cell newGeneration(int nbNeighbours) {

		if (nbNeighbours == 2 || nbNeighbours == 3) {
			return this;
		} else {
			return new DeadCell();
		}
	}

	@Override
	public String getAsString() {
		return "+ ";
	}

	@Override
	public boolean isAlive() {
		return true;
	}

}
