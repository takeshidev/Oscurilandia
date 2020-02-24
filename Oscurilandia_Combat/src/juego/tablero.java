package juego;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class tablero{
	public static void main(String[] args) {
	String[][] tablero = new String[15][15];
	ArrayList <Huevo> tiros = new ArrayList<Huevo>();
	
		for(int i = 0; i < tablero.length; i++ ) {
		for(int j = 0; j < tablero.length; j++ ) {
			tablero[i][j] = "-";
		}
	}
//	public static void tirarHuevo(){
	Huevo h1 = new Huevo();
	h1.setColumna(leerNumeros("Escriba una coordenada para columna"));
	h1.setFila(leerNumeros("Escriba una coordenada para fila"));
	tablero[h1.getColumna()][h1.getFila()] = h1.getCodigo();
	
	for(int i = 0; i < tablero.length; i++ ) {
		for(int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j]);
		}
			System.out.println(" ");
	}//for
}//main
	
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static int leerNumeros(String mensaje) {
		escribir(mensaje);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static void tirarHuevo(){
		Huevo h2 = new Huevo();
		h2.setColumna(leerNumeros("Escriba una coordenada para columna"));
		h2.setFila(leerNumeros("Escriba una coordenada para fila"));
		tablero[h2.getColumna()][h2.getFila()] = h2.getCodigo();
	}
}	
