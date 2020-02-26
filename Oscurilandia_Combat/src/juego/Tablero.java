package juego;

import java.util.*;

public class Tablero {

	static String[][] tablero = new String[15][15];
	ArrayList<Carro> carros = new ArrayList<Carro>();
	ArrayList<Huevo> tiros = new ArrayList<Huevo>();
	Marcador marcador = new Marcador();

	public Tablero() {
		//rellena el tablero con espacios vacios
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[0].length; y++) {
				tablero[x][y] = "[-]";
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
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[0].length; y++) {
				System.out.print(tablero[x][y]);
			}
			System.out.println(x);//imprime el numero del eje vertical
		}
	}// mostrarTablero

	/**
	 * Lanza un huevo solicitando coordenadas
	 */
	public void tirarHuevo() {
		Huevo huevo = new Huevo();
		huevo.setX(Utiles.leerNumeros("Ingrese coordenada X (vertical):"));
		huevo.setY(Utiles.leerNumeros("Ingrese coordenada Y (horizontal):"));
		verificaCoordinadas(huevo.getX(), huevo.getY());
		tablero[huevo.getX()][huevo.getY()] = huevo.getCodigo();
		tiros.add(huevo);
		int i = marcador.getIntentos();
		i++;
		marcador.setIntentos(i);
	}
/**
 * Imprime (con ln) el numero de lanzamientos realizados
 */
	public void mostrarIntentos() {
		System.out.println("Intentos " + marcador.getIntentos());
	}
/**
 * Imprime (con ln) el puntaje acomulado
 */
	public void mostrarPuntaje() {
		System.out.println("Puntaje: " + marcador.getPuntaje());
	}
/**
 * Genera objetos Kromis y los agrega al array de carros y su referencia al tablero
 */
	public void ponerKromis() {
		for (int i = 0; i < 3; i++) {
			Kromi kromi = new Kromi();
			carros.add(kromi);
			kromi.setX(Utiles.generaRandom(11, 0));
			
			if (verificaVacio(kromi.getX(), kromi.getY())) {
				tablero[kromi.getX()][kromi.getY()] = "[K]";
				tablero[kromi.getX()+1][kromi.getY()] = "[K]";
				tablero[kromi.getX()+2][kromi.getY()] = "[K]";
			} else {
				while (!verificaVacio(kromi.getX(), kromi.getY())) {
					kromi.setX(Utiles.generaRandom(11, 0));
					kromi.setY(Utiles.generaRandom(14, 0));
					tablero[kromi.getX()][kromi.getY()] = "[K]";
					tablero[kromi.getX()+1][kromi.getY()] = "[K]";
					tablero[kromi.getX()+2][kromi.getY()] = "[K]";
				}
			}
			System.out.println(kromi.toString());
		}
	}
	/**
	 * Genera objetos Trupalla y los agrega al array de carros y su referencia al tablero
	 */
	public void ponerTrupallas() {
		for (int i = 0; i < 10; i++) {
			Trupalla trupalla = new Trupalla();
			carros.add(trupalla);
			// boolean ocupado=verificaOcupado();

			if (verificaVacio(trupalla.getX(), trupalla.getY())) {
				tablero[trupalla.getX()][trupalla.getY()] = "[T]";
			} else {
				while (!verificaVacio(trupalla.getX(), trupalla.getY())) {
					trupalla.setX(Utiles.generaRandom(14, 0));
					trupalla.setY(Utiles.generaRandom(14, 0));
					tablero[trupalla.getX()][trupalla.getY()] = "[T]";
				}
			}
			System.out.println(trupalla.toString());
		}
	}

	/**
	 * Genera objetos Caguano y los agrega al array de carros y su referencia al tablero
	 */
	public void ponerCaguano() {
		for (int i = 0; i < 5; i++) {
			Caguano caguano = new Caguano();
			carros.add(caguano);
			caguano.setY(Utiles.generaRandom(13, 0));
			
			if (verificaVacio(caguano.getX(), caguano.getY())) {
				tablero[caguano.getX()][caguano.getY()] = "[C]";
				tablero[caguano.getX()][caguano.getY()+1] = "[C]";
			} else {
				while (!verificaVacio(caguano.getX(), caguano.getY())) {
					caguano.setX(Utiles.generaRandom(14, 0));
					caguano.setY(Utiles.generaRandom(13, 0));
					tablero[caguano.getX()][caguano.getY()] = "[C]";
					tablero[caguano.getX()][caguano.getY()+1] = "[C]";
				}
			}
			System.out.println(caguano.toString());
		}
	}
	/**
	 * Verifica un espacio en el tablero y retorna true si esta vacio
	 * @param x
	 * @param y
	 * @return True si esta vacio
	 */
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
	 * Imprime el ArrayList con los tiros efectuados, coordenadas, y puntajes
	 */
	public void listarTiros() {
		for (Huevo huevo : tiros) {
			System.out.println(huevo);
		}
	}

} // class Tablero
