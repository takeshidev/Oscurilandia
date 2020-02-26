package juego;

import java.util.Random;
import java.util.Scanner;
/**
* Esta clase almacena los metodos para escribir por pantalla y para leer numeros ingresado por el usuario
* @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorza
* @version 2.0.0
*/
public class Utiles {

	/**
	 * Imprime en pantalla (con salto de linea) un mensaje ingresado como parametro (solo un dato tipo String)
	 * @param mensaje Parametro que recibe un mensaje a mostrar
	 */
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}//Fin Metodo

	/**
	 * Imprime en pantalla (sin salto de linea) un mensaje ingresado como parametro (dos datos tipo String)
	 * @param mensaje Parametro que recibe un mensaje a mostrar
	 * @param sinlinea Segundo dato tipo String a ingresar para que no tenga salto de linea
	 */
	public static void escribir(String mensaje, String sinlinea) {
		System.out.print(mensaje);
	}//Fin Metodo

	/**
	 * Muestra un mensaje (Con salto de linea) y solicita un numero que sera almacenado 
	 * @param mensaje Mensaje a mostrar
	 * @return Retorna el numero ingresado
	 */
	public static int leerNumeros(String mensaje) {
		escribir(mensaje);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}//Fin Metodo

	/**
	 * Metodo que muestra un mensaje en pantalla (Sin salto de linea), ademas de leer el dato ingresado por teclado
	 * @param mensaje Mensaje a mostrar en pantalla
	 * @param sinlinea Segundo dato tipo String a ingresar para que no tenga salto de linea
	 * @return
	 */
	public static int leerNumeros(String mensaje, String sinlinea) {
		escribir(mensaje, sinlinea);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}//Fin Metodo

	/**
	 * Genera un numero pseudoaleatorio
	 * @param alto Valor mayor a generar pseudoaleatoreo
	 * @param bajo Valor menor a generar pseudoaleatoreo
	 * @return
	 */
	public static int generaRandom(int alto, int bajo) {
		Random rand = new Random();
		return rand.nextInt(alto) + bajo;
	}//Fin Metodo
}//Fin Clase