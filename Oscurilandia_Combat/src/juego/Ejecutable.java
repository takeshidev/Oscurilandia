package juego;

import java.util.Scanner;

public class Ejecutable extends Tablero {

	public static void main(String[] args) {
		Tablero tablero = new Tablero();
		tablero.mostrarTablero();
		
		Menu.crearMenu();
	}
}
