package juego;

import java.util.*;

public class Tablero {
	
	
	String[][] tablero = new String[15][15];
	ArrayList <Huevo> tiros = new ArrayList<Huevo>();
	
	public Tablero() {
		for(int i = 0; i < tablero.length; i++ ) {
			for(int j = 0; j < tablero.length; j++ ) {
				tablero[i][j] = "[ - ]";
			}
		}
	}
	
	public void mostrarTablero() {
		for(int i = 0; i < tablero.length; i++ ) {
			for(int j = 0; j < tablero[0].length; j++) {
					System.out.print(tablero[i][j]);
			}
				System.out.println(" ");
		}
	}
	
	public void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	public int leerNumeros(String mensaje) {
		escribir(mensaje);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public void tirarHuevo(){
		Huevo h1 = new Huevo();
		h1.setColumna(leerNumeros("Escriba una coordenada para columna"));
		h1.setFila(leerNumeros("Escriba una coordenada para fila"));
		tablero[h1.getColumna()][h1.getFila()] = h1.getCodigo();
	}
}	
