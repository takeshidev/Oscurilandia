package juego;

import java.util.*;

public class Menu {

	
	public static void crearMenu() {
		boolean salir = false;
		escribir("BIENVENIDO AL COMBATE");
		Tablero tablero2 = new Tablero();
		tablero2.mostrarTablero();
		while (!salir) {

			escribir("1. Tirar huevo");
			escribir("2. Mostrar tablero");
			escribir("3. Mostrar puntaje");
			escribir("4. Salir");

			int op = (int) leerNumeros("Ingrese una opcion:");

			switch (op) {
			case 1:
				escribir("Tirando huevo...");
				tablero2.tirarHuevo();
				break;
			case 2:
				escribir("Mostrando tablero");
				tablero2.mostrarTablero();
				break;
			case 3:
				break;
			case 4:
				escribir("Hasta la vista beibi...");
				salir = true;
				break;
			}
		}
	}

	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}

	public static int leerNumeros(String mensaje) {
		escribir(mensaje);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}// menu
//
