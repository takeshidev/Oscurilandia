package juego;

import java.awt.Toolkit;
import java.util.*;
/**
 * Clase Tablero que contiene los metodo imprimir tablero, lanzar huevos y rellenar los tableros
 * @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorza
 * @version 2.0.0
 */
public class Tablero {

	//Campos de la Clase
	String[][] tablero = new String[15][15];
	ArrayList<Carro> carros = new ArrayList<Carro>();
	ArrayList<Huevo> tiros = new ArrayList<Huevo>();
	Marcador marcador = new Marcador();
	final int PUNTAJE_MAXIMO = 122;
	//Fin Campos de Clase
	
	/**
	 * Este metodo rellana el tablero con espacios vacios
	 */
	public Tablero() {
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[0].length; y++) {
				tablero[x][y] = "[-]";
			}
		}
	}//Fin Metodo

	/**
	 * Muestra el tablero en pantalla
	 */
	public void mostrarTableroFull() {
		for (int i = 0; i < tablero.length; i++) {
			System.out.printf("%3s", i);
		}
		Utiles.escribir("");
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[0].length; y++) {
				System.out.print(tablero[x][y]);
			}
			System.out.println(x);// imprime el numero del eje vertical
		}
	}//Fin Metodo

	/**
	 * Metodo que muestra los huevos dentro del tablero
	 */
	public void mostrarTableroHuevos() {
		for (int i = 0; i < tablero.length; i++) {
			System.out.printf("%3s", i);
		}
		Utiles.escribir("");
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[0].length; y++) {
				if (tablero[x][y].contentEquals("[H]")) {
					System.out.print(tablero[x][y]);
				}else {
					Utiles.escribir("[-]","");
				}
			}
			System.out.println(x);// imprime el numero del eje vertical
		}
	}//Fin Metodo
	
	/**
	 * Metodo genera objetos Kromis y los agrega al array de carros y su referencia al
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
		kromi.setVida(3);
		this.carros.add(kromi);
	}//Fin Metodo

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
		caguano.setVida(2);
		this.carros.add(caguano);
		
	}//Fin Metodo

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
		trupalla.setVida(1);

		this.carros.add(trupalla);
	}//Fin Metodo

	/**
	 * Metodo que lanza un huevo solicitando coordenadas
	 */
	public void tirarHuevo() {
		boolean ingresado = false;
		Huevo huevo = new Huevo();
		while (!ingresado) {
			int k = Utiles.leerNumeros("Ingrese coordenada x(vertical):" , "sinlinea");
			int j = Utiles.leerNumeros("Ingrese coordenada y(horizontal):" , "sinlinea");
			if (k >=0 && k <14 && j >= 0 && j < 14) {
			huevo.setX(k);
			huevo.setY(j);
			ingresado = true;
			}else {
				Utiles.escribir("coordenadas invalidas. Trate con numeros entre 0 y 14");
			}
		}
		String objImpactado = verificaImpacto(huevo.getX(), huevo.getY());
		tablero[huevo.getX()][huevo.getY()] = huevo.getCodigo(); // pone letra en tablero
		tiros.add(huevo); // agrega huevo a arrayList de tiros
		marcador.setIntentos(marcador.getIntentos() + 1); // incrementa numero intentos
		if (objImpactado.equals("Trupalla")) {
			for (Carro carro : carros) {
				for (Posicion posicion : carro.posiciones) {
					if (huevo.getX() == posicion.getX() && huevo.getY() == posicion.getY()) {
						carro.setVida(carro.getVida() - 1);
						if (carro.getVida() == 0) {
							int puntaje = marcador.getPuntaje();
							marcador.setPuntaje(puntaje + 1);
							huevo.setPuntaje(1);
						}
					}
				}
			}
		}

		if (objImpactado.equals("Caguano")) {
			for (Carro carro : carros) {
				for (Posicion posicion : carro.posiciones) {
					if (huevo.getX() == posicion.getX() && huevo.getY() == posicion.getY()) {
						carro.setVida(carro.getVida() - 1);
						int puntaje = marcador.getPuntaje();
						marcador.setPuntaje(puntaje + 2);
						huevo.setPuntaje(2);
						if (carro.getVida() == 0) {
							Utiles.escribir("Caguano destruido!!! +7pts");
							puntaje = marcador.getPuntaje();
							marcador.setPuntaje(puntaje + 7);
							huevo.setPuntaje(2 + 7);
						}
					}
				}
			}
		}
		if (objImpactado.equals("Kromi")) {
			for (Carro carro : carros) {
				for (Posicion posicion : carro.posiciones) {
					if (huevo.getX() == posicion.getX() && huevo.getY() == posicion.getY()) {
						carro.setVida(carro.getVida() - 1);
						int puntaje = marcador.getPuntaje();
						marcador.setPuntaje(puntaje + 3);
						huevo.setPuntaje(3);
						if (carro.getVida() == 0) {
							puntaje = marcador.getPuntaje();
							Utiles.escribir("Kromi destruida!!! +10pts");
							marcador.setPuntaje(puntaje + 10);
							huevo.setPuntaje(3 + 10);
						}
					}
				}
			}
		}
		if (marcador.getPuntaje() >= PUNTAJE_MAXIMO) {
			Utiles.escribir("FELICITACIONES GANASTE");
		}
	}

	public String impacto() {

		return "";
	}//Fin Metodo

	/**
	 * Verifica un espacio en el tablero y retorna true si esta vacio
	 * @param x Es la coordenada para las verticales
	 * @param y Es la coordenada para las horizontales
	 * @return Retorna True cuando encuentra un espacio "blanco" o "[-]"
	 */
	public boolean verificaVacio(int x, int y) {
		if (tablero[x][y].contentEquals("[-]")) {
			return true;
		} else {
			return false;
		}
	}//Fin Metodo

	/**
	 * Verifica las coordenadas del tiro en el tablero e indica si es un tiro
	 * repetido
	 * @param x Es la coordenada para las verticales
	 * @param y Es la coordenada para las horizontales
	 */
	public String verificaImpacto(int x, int y) {
		if (tablero[x][y].equals("[-]")) {
			Utiles.escribir("Huevo desperdiciado :(");
			return "Fallo";
		}
		if (tablero[x][y].equals("[T]")) {
			Utiles.escribir("Le diste a una Trupalla! +1pts");

			Toolkit.getDefaultToolkit().beep();
			return "Trupalla";
		}
		if (tablero[x][y].equals("[C]")) {
			Utiles.escribir("Le diste a un Caguano! +2pts");
			Toolkit.getDefaultToolkit().beep();
			return "Caguano";
		}
		if (tablero[x][y].equals("[K]")) {
			Utiles.escribir("Le diste a una Kromi! +3pts");
			Toolkit.getDefaultToolkit().beep();
			return "Kromi";
		}
		if (tablero[x][y].equals("[H]")) {
			Utiles.escribir("Ya habias disparado aqui anteriormente");
			return "Repetido";
		}
		return null;
	}//Fin Metodo

	/**
	 * Metodo que imprime el ArrayList con los tiros efectuados, sus coordenadas y el puntaje
	 */
	public void listarTiros() {
		for (Huevo huevo : tiros) {
			Utiles.escribir(huevo.toString());
		}
	}//Fin metodo

	/**
	 * Metodo que imprime los intentos cada vez que se lanza un huevo
	 */
	public void mostrarIntentos() {
		Utiles.escribir("Intentos " + marcador.getIntentos());
	}//Fin Metodo

	/**
	 * Metodo que imprime (en otra linea) el puntaje acomulado por el jugador
	 */
	public void mostrarPuntaje() {
		Utiles.escribir("Puntaje: " + marcador.getPuntaje());
	}//Fin Metodo
} ///Fin Clase
