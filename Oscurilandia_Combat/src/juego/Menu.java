package juego;

import java.util.Scanner;

public class Menu {

	boolean salir = false;

	while(!salir) {

		escribir("1. Tirar huevo");
		escribir("2. Mostrar tablero");
		escribir("3. Mostrar puntaje");
		escribir("4. Salir");

		int op = (int) leerNumeros("Ingrese una opcion:");

		switch (op) {
		case 1:
			escribir("Tirando huevo...");

			break;
		case 2:
			escribir("Mostrando tablero");
			break;
		case 3:
			break;
		case 4:
			salir = true;
			break;
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
