package juego;

import java.util.*;

public class Tablero {

	static String[][] tablero = new String[15][15];
	ArrayList<Carro> carros = new ArrayList<Carro>();
	ArrayList<Huevo> tiros = new ArrayList<Huevo>();
	Marcador marcador = new Marcador();

	public Tablero() {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
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
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j]);
			}

			System.out.println(i);
		}
	}// mostrarTablero

	/**
	 * Lanza un huevo solicitando coordenadas
	 */
	public void tirarHuevo() {
		Huevo h1 = new Huevo();
		h1.setColumna(Utiles.leerNumeros("Escriba una coordenada para columna"));
		h1.setFila(Utiles.leerNumeros("Escriba una coordenada para fila"));
		verificaCoordinadas(h1.getColumna(), h1.getFila());
		tablero[h1.getColumna()][h1.getFila()] = h1.getCodigo();
		tiros.add(h1);
		int x = marcador.getIntentos();
		x++;
		marcador.setIntentos(x);

	}

	public void mostrarIntentos() {
		System.out.println("Intentos " + marcador.getIntentos());
	}

	public void mostrarPuntaje() {
		System.out.println("Puntaje: " + marcador.getPuntaje());
	}

	public void ponerKromis() {
		for (int i = 0; i < 3; i++) {
			Kromi kromi = new Kromi();
			carros.add(kromi);
			kromi.setFila(Utiles.generaRandom(11, 0));
			
			if (verificaVacio(kromi.getFila(), kromi.getColumna())) {
				tablero[kromi.getFila()][kromi.getColumna()] = "[K]";
				tablero[kromi.getFila()+1][kromi.getColumna()] = "[K]";
				tablero[kromi.getFila()+2][kromi.getColumna()] = "[K]";
			} else {
				while (!verificaVacio(kromi.getFila(), kromi.getColumna())) {
					kromi.setFila(Utiles.generaRandom(11, 0));
					kromi.setColumna(Utiles.generaRandom(14, 0));
					tablero[kromi.getFila()][kromi.getColumna()] = "[K]";
					tablero[kromi.getFila()+1][kromi.getColumna()] = "[K]";
					tablero[kromi.getFila()+2][kromi.getColumna()] = "[K]";
				}
			}
			System.out.println(kromi.toString());
		}
	}
	public void ponerTrupallas() {
		for (int i = 0; i < 10; i++) {
			Trupalla trupalla = new Trupalla();
			carros.add(trupalla);
			// boolean ocupado=verificaOcupado();

			if (verificaVacio(trupalla.getFila(), trupalla.getColumna())) {
				tablero[trupalla.getFila()][trupalla.getColumna()] = "[T]";
			} else {
				while (!verificaVacio(trupalla.getFila(), trupalla.getColumna())) {
					trupalla.setFila(Utiles.generaRandom(14, 0));
					trupalla.setColumna(Utiles.generaRandom(14, 0));
					tablero[trupalla.getFila()][trupalla.getColumna()] = "[T]";
				}
			}
			System.out.println(trupalla.toString());
		}
	}


	public void ponerCaguano() {
		for (int i = 0; i < 5; i++) {
			Caguano caguano = new Caguano();
			carros.add(caguano);
			caguano.setColumna(Utiles.generaRandom(13, 0));
			
			if (verificaVacio(caguano.getFila(), caguano.getColumna())) {
				tablero[caguano.getFila()][caguano.getColumna()] = "[C]";
				tablero[caguano.getFila()][caguano.getColumna()+1] = "[C]";
			} else {
				while (!verificaVacio(caguano.getFila(), caguano.getColumna())) {
					caguano.setFila(Utiles.generaRandom(14, 0));
					caguano.setColumna(Utiles.generaRandom(13, 0));
					tablero[caguano.getFila()][caguano.getColumna()] = "[C]";
					tablero[caguano.getFila()][caguano.getColumna()+1] = "[C]";
				}
			}
			System.out.println(caguano.toString());
		}
	}
	
	public boolean verificaVacio(int x, int y) {
		if (tablero[x][y].contentEquals("[-]")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Verifica las coordenadas del tiro en el tablero e indica si es un tiro
	 * repetido
	 * 
	 * @param x
	 * @param y
	 */
	public void verificaCoordinadas(int x, int y) {
		if (tablero[x][y].equals("[-]")) {
			Utiles.escribir("Huevo desperdiciado :(");
		}
		if (tablero[x][y].equals("[T]")) {
			Utiles.escribir("Le diste a una Trupalla!");
			int puntaje = marcador.getPuntaje();
			marcador.setPuntaje(puntaje + 1);

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
	public void listarTiros() {
		for (Huevo huevo : tiros) {
			System.out.println(huevo);
		}
	}

} // class Tablero
