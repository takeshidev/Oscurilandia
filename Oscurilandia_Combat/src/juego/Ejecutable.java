package juego;

import java.util.Scanner;

public class Ejecutable extends Menu{

	public static void main(String[] args) {
		
		escribir("BIENVENIDO AL COMBATE");
		crearMenu();
		
	}

	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static int leerNumeros(String mensaje) {
		escribir(mensaje);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
