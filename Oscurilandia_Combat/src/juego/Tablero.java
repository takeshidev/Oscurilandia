package juego;

import java.util.*;

public class Tablero {
	
	static String[][] tablero = new String[15][15];
	ArrayList <Huevo> tiros = new ArrayList<Huevo>();
	
	public Tablero() {
		for(int i = 0; i < tablero.length; i++ ) {
			for(int j = 0; j < tablero[0].length; j++ ) {
				tablero[i][j] = "[-]";
			}
		}
	}
	/**
	 * Muestra el tablero en pantalla
	 */
	public void mostrarTablero() {
		for (int i = 0; i < tablero.length; i++) {
			System.out.printf("%-3s", i);
		}
		System.out.println("");
		for(int i = 0; i < tablero.length; i++ ) {
			for(int j = 0; j < tablero[0].length; j++) {
					System.out.print(tablero[i][j]);
			}
			
				System.out.println(i);
		}
	}//mostrarTablero
	
	/**
	 * Lanza un huevo solicitando coordenadas
	 */
	public void tirarHuevo(){
		Huevo h1 = new Huevo();
		h1.setColumna(Utiles.leerNumeros("Escriba una coordenada para columna"));
		h1.setFila(Utiles.leerNumeros("Escriba una coordenada para fila"));
		tablero[h1.getColumna()][h1.getFila()] = h1.getCodigo();
	}
}	//class Tablero
