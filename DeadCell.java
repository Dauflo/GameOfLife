package com.gameoflife.www;

public class DeadCell extends Cell {

	public Cell newGeneration(int nbNeighbours) {
		if (nbNeighbours == 3) {
			return new AliveCell();
		} else {
			return this;
		}
	}

	public String getAsString() {
		return "- ";
	}

	public boolean isAlive() {
		return false;
	}

}
