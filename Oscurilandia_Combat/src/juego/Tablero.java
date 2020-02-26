package juego;

import java.awt.Toolkit;
import java.util.*;

public class Tablero {

	String[][] tablero = new String[15][15];
	ArrayList<Carro> carros = new ArrayList<Carro>();
	ArrayList<Huevo> tiros = new ArrayList<Huevo>();
	Marcador marcador = new Marcador();

	public Tablero() {
		// rellena el tablero con espacios vacios
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
			System.out.println(x);// imprime el numero del eje vertical
		}
	}// mostrarTablero

	/**
	 * Genera objetos Kromis y los agrega al array de carros y su referencia al
	 * tablero
	 */
	public void ponerKromis() {
		int x = 0;
		int y = 0;

		for (int i = 0; i < 30; i++) {
			x = Utiles.generaRandom(14 - 3, 0);
			y = Utiles.generaRandom(14, 0);
			if (verificaVacio(x, y)) {
				i = 29;
			}
		}
		Kromi kromi = new Kromi();
		for (int i = 0; i < 3; i++) {
			kromi.agregarPosicion(new Posicion(x + i, y));
			this.tablero[x + i][y] = "[K]";
		}

		this.carros.add(kromi);
		System.out.println(kromi.toString());
	}

	/**
	 * Genera objetos Caguano y los agrega al array de carros y su referencia al
	 * tablero
	 */
	public void ponerCaguano() {
		int x = 0;
		int y = 0;

		for (int i = 0; i < 30; i++) {
			x = Utiles.generaRandom(14, 0);
			y = Utiles.generaRandom(14 - 1, 0);
			if (verificaVacio(x, y)) {
				i = 29;
			}
		}
		Caguano caguano = new Caguano();
		for (int i = 0; i < 2; i++) {
			caguano.agregarPosicion(new Posicion(x, y + i));
			this.tablero[x][y + i] = "[C]";
		}

		this.carros.add(caguano);
		System.out.println(caguano.toString());
	}

	/**
	 * Genera objetos Trupalla y los agrega al array de carros y su referencia al
	 * tablero
	 */
	public void ponerTrupallas() {
		int x = 0;
		int y = 0;

		for (int i = 0; i < 30; i++) {
			x = Utiles.generaRandom(14, 0);
			y = Utiles.generaRandom(14 - 1, 0);
			if (verificaVacio(x, y)) {
				i = 29;
			}
		}
		Trupalla trupalla = new Trupalla();
		trupalla.agregarPosicion(new Posicion(x, y));
		this.tablero[x][y] = "[T]";

		this.carros.add(trupalla);
		System.out.println(trupalla.toString());
	}

	/**
	 * Lanza un huevo solicitando coordenadas
	 */
	public void tirarHuevo() {
		Posicion posicionselec;
		int cuentacarro=0;
		int cuentapos=0;
		int posC, posP;
		Huevo huevo = new Huevo();
		huevo.setX(Utiles.leerNumeros("Ingrese coordenada X (vertical):","sinlinea"));
		huevo.setY(Utiles.leerNumeros("Ingrese coordenada Y (horizontal):","sinlinea"));
		String objImpactado = verificaImpacto(huevo.getX(), huevo.getY());
		tablero[huevo.getX()][huevo.getY()] = huevo.getCodigo(); //pone letra en tablero
		tiros.add(huevo); //agrega huevo a arrayList de tiros
//		
//		for (Carro carro : carros) {
//			for (Posicion posicion : carro.posiciones) {
//				if (huevo.getX() == posicion.getX() && huevo.getY() == posicion.getY()) {
//					posC=cuentapos;
//					posP=cuentacarro;
//				}
//				cuentapos++;
//			}
//			cuentacarro++;
//		}
//		for (Iterator iterator = carros.iterator(); iterator.hasNext();) {
//			Carro carro = (Carro) iterator.next();
//			for (Iterator iterator2 = carro.posiciones.iterator(); iterator2.hasNext();) {
//				Posicion posicion = (Posicion) iterator2.next();
//				if (huevo.getX() == posicion.getX() && huevo.getY() == posicion.getY()) {
//					carro.posiciones.remove(posicion);
//				}
//			}
//		}

//		for (Iterator iterator = carros.iterator(); iterator.hasNext();) {
//			Carro carro = (Carro) iterator.next();
//			for (Iterator iterator2 = carro.posiciones.iterator(); iterator2.hasNext();) {
//				Posicion posicion = (Posicion) iterator2.next();
//				if (huevo.getX() == posicion.getX() && huevo.getY() == posicion.getY()) {
//					posicionselec= posicion;
//					System.out.println(posicionselec);
//					System.out.println(posicion);
//				}
//			}
//		}

		
//		for (Carro carro : carros) {
//			for (Posicion posicion : carro.posiciones) {
//				if (huevo.getX() == posicion.getX() && huevo.getY() == posicion.getY()) {
//					carro.posiciones.remove(posicion);
//				}
//
//			}
//
//		}
		marcador.setIntentos(marcador.getIntentos()+1); //incrementa numero intentos
	}

	public String impacto() {

		
		return "";
	}

	/**
	 * Verifica un espacio en el tablero y retorna true si esta vacio
	 * 
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
	public String verificaImpacto(int x, int y) {
		if (tablero[x][y].equals("[-]")) {
			Utiles.escribir("Huevo desperdiciado :(");
			return "Fallo";
		}
		if (tablero[x][y].equals("[T]")) {
			Utiles.escribir("Le diste a una Trupalla!");
//			int puntaje = marcador.getPuntaje();
//			marcador.setPuntaje(puntaje + 1);
			Toolkit.getDefaultToolkit().beep();
			return "Trupalla";
		}
		if (tablero[x][y].equals("[C]")) {
			Utiles.escribir("Le diste a un Caguano!");
			Toolkit.getDefaultToolkit().beep();
			return "Caguano";
		}
		if (tablero[x][y].equals("[K]")) {
			Utiles.escribir("Le diste a una Kromi!");
			Toolkit.getDefaultToolkit().beep();
			return "Kromi";
		}
		if (tablero[x][y].equals("[H]")) {
			Utiles.escribir("Ya habias disparado aqui anteriormente");
			return "Repetido";
		}
		return null;
	}

	/**
	 * Imprime el ArrayList con los tiros efectuados, coordenadas, y puntajes
	 */
	public void listarTiros() {
		for (Huevo huevo : tiros) {
			System.out.println(huevo);
		}
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
} // class Tablero
