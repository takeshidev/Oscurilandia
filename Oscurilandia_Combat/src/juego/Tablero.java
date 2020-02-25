package juego;

import java.util.*;

public class Tablero {
	
	static String[][] tablero = new String[15][15];
	static Carro[] carros = new Carro[18];
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
			System.out.printf("%3s", i);
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
		verificaCoordinadas(h1.getColumna(), h1.getFila());
		tablero[h1.getColumna()][h1.getFila()] = h1.getCodigo();
		tiros.add(h1);
	}

	public void ponerCarro() {
		Trupalla c1 = new Trupalla();
		tablero[c1.getFila()][c1.getColumna()]="[T]";
		carros[0]= c1;
		System.out.println(c1.toString());
	}
	
	/**
	 * Verifica las coordenadas del tiro en el tablero e indica si es un tiro repetido
	 * @param x
	 * @param y
	 */
	public void verificaCoordinadas(int x, int y) {
		if (tablero[x][y].equals("[-]")) {
			Utiles.escribir("Huevo desperdiciado :(");
		}
		if (tablero[x][y].equals("[K]")) {
			Utiles.escribir("Le diste a una Kromi!");
		}
		if (tablero[x][y].equals("[H]")) {
			Utiles.escribir("Ya habias disparado aqui anteriormente");
		}
	}
	
	/**
	 * Muestra el ArrayList con los tiros efectuados, coordenadas, y puntajes
	 */
	public  void listarTiros() {
		for (Huevo huevo : tiros) {
			System.out.println(huevo);
		}
	}
	
}	//class Tablero
