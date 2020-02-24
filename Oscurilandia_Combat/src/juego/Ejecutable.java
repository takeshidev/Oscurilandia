package juego;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		
		escribir("BIENVENIDO AL COMBATE");
		CrearMenu();
		
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
