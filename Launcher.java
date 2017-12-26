package com.gameoflife.www;

import java.util.Scanner;

public class Launcher {
	static World gameOfLife;

	public static void main(String[] args) {
		Scanner entreeClavier = new Scanner(System.in);
		System.out.println("Longueur du tableau");
		int longueur = Integer.parseInt(entreeClavier.nextLine());
		System.out.println("Largeur du tableau");
		int largeur = Integer.parseInt(entreeClavier.nextLine());
		System.out.println("Nombre le generation");
		int nbGeneration = Integer.parseInt(entreeClavier.nextLine());
		gameOfLife = new World(longueur, largeur);
		gameOfLife.initialisation();
		gameOfLife.afficherGrille();
		gameOfLife.newGeneration(nbGeneration);
	}
}
