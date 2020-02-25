package juego;

import java.awt.Toolkit;
import java.util.*;

public class Menu {

	public static void crearMenu() {
		boolean salir = false;
		Utiles.escribir("BIENVENIDO AL COMBATE");
		Tablero tablero = new Tablero();
		tablero.mostrarTablero();
//Inicio del menu----------------------------------------
		while (!salir) {

			Utiles.escribir("  1. Tirar huevo");
			Utiles.escribir("  2. Mostrar tablero");
			Utiles.escribir("  3. Mostrar puntaje");
			Utiles.escribir("  4. Salir");
 
		try {	
			int op = (int) Utiles.leerNumeros("Ingrese una opcion:");

			switch (op) {
			case 1:
				Utiles.escribir("Preparandose para lanzar huevo...");
				tablero.tirarHuevo();
				Toolkit.getDefaultToolkit().beep();
				break;
			case 2:
				Utiles.escribir("Mostrando tablero");
				tablero.mostrarTablero();
				break;
			case 3:
				Utiles.escribir("Mostrando puntaje");
				tablero.listarTiros();
				break;
			case 4:
				Utiles.escribir("Hasta la vista beibi...");
				salir = true;
				break;
			}//switch
		} catch (InputMismatchException e) {
			Utiles.escribir("Ocurrió un error :(. Debes ingresar una opción.");
		}
			
		}//while
	}// crearMenu



}// Class menu

