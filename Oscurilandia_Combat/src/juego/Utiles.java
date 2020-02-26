package juego;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase con metodos utilitarios para la aplicacion
 */
public class Utiles {

	/**
	 * Imprime en pantalla (con salto de linea) un mensje ingresado como parametro
	 * 
	 * @param mensaje
	 */
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}

	public static void escribir(String mensaje, String sinlinea) {
		System.out.print(mensaje);
	}

	/**
	 * Muestra un mensaje y solicita un numero
	 * 
	 * @param mensaje Mensaje a mostrar
	 * @return Retorna el numero ingresado
	 */
	public static int leerNumeros(String mensaje) {
		escribir(mensaje);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static int leerNumeros(String mensaje, String sinlinea) {
		escribir(mensaje, sinlinea);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	/**
	 * Genera un numero pseudoaleatorio
	 * 
	 * @param alto
	 * @param bajo
	 * @return
	 */
	public static int generaRandom(int alto, int bajo) {
		Random rand = new Random();
		return rand.nextInt(alto) + bajo;
	}

}// class Utiles
