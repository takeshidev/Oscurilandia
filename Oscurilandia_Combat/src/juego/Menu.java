package juego;

import java.awt.Toolkit;
import java.util.*;

public class Menu {

	public static void crearMenu() {
		Utiles.escribir("****BIENVENIDO AL COMBATE****");
		Tablero tablero = new Tablero();
		for (int i = 0; i < 3; i++) {
			tablero.ponerKromis();	
		}
		for (int i = 0; i < 5; i++) {
			tablero.ponerCaguano();	
		}
		for (int i = 0; i < 10; i++) {
			tablero.ponerTrupallas();
		}
		tablero.mostrarTableroHuevos();
		
//Inicio del menu----------------------------------------
		boolean salir = false;
		while (!salir) {

			Utiles.escribir("  1. Tirar huevo");
			Utiles.escribir("  2. Mostrar tablero");
			Utiles.escribir("  3. Mostrar puntaje");
			Utiles.escribir("  4. Salir");
			
 //hola
		try {	
			int op = (int) Utiles.leerNumeros("Ingrese una opcion:", "sinlinea");

			switch (op) {
			case 1:
				Utiles.escribir("Preparandose para lanzar huevo...");
				tablero.tirarHuevo();
				tablero.mostrarTableroHuevos();	
				break;
			case 2:
				Utiles.escribir("Mostrando tablero");
				tablero.mostrarTableroFull();
				
				break;
			case 3:
				Utiles.escribir("Mostrando puntaje");
				tablero.listarTiros();
				tablero.mostrarIntentos();
				tablero.mostrarPuntaje();
				break;
			case 4:
				Utiles.escribir("Hasta la vista beibi...");
				salir = true;
				break;
			default:
				System.out.println("Debes ingresar una opcion entre 1 y 4");
			}//switch
		} catch (InputMismatchException e) {
			Utiles.escribir("Ocurrio un error :(. Debes ingresar una opcion.");
		}
		
		}//while
	}// crearMenu



}// Class menu

