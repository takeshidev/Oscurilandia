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
		tablero.mostrarTablero();
		
//Inicio del menu----------------------------------------
		boolean salir = false;
		while (!salir) {

			Utiles.escribir("  1. Tirar huevo");
			Utiles.escribir("  2. Mostrar tablero");
			Utiles.escribir("  3. Mostrar puntaje");
			Utiles.escribir("  4. Mostrar enemigos");
			Utiles.escribir("  5. Salir");
 
		try {	
			int op = (int) Utiles.leerNumeros("Ingrese una opcion:");

			switch (op) {
			case 1:
				Utiles.escribir("Preparandose para lanzar huevo...");
				tablero.tirarHuevo();
				break;
			case 2:
				Utiles.escribir("Mostrando tablero");
				tablero.mostrarTablero();
				break;
			case 3:
				Utiles.escribir("Mostrando puntaje");
				tablero.listarTiros();
				tablero.mostrarIntentos();
				tablero.mostrarPuntaje();
				break;
			case 4:
				Utiles.escribir("Mostrando enemigos");
				for (Carro carro : tablero.carros) {
					for (Posicion posicion : carro.posiciones) {
						System.out.println(posicion.toString()+""+ carro.toString());
					}
					
				}
				
				
				break;
			case 5:
				Utiles.escribir("Hasta la vista beibi...");
				salir = true;
				break;
			}//switch
		} catch (InputMismatchException e) {
			Utiles.escribir("Ocurri� un error :(. Debes ingresar una opci�n.");
		}
			
		}//while
	}// crearMenu



}// Class menu

