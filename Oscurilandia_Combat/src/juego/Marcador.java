package juego;
/**
 * Esta clase almacena el puntaje de los tiros
 * @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorza
 * @version 2.0.0
 */
public class Marcador {

	//Atributos
	int puntaje;
	int intentos;
	
	/**
	 * Constructor por defecto de la Clase
	 */
	public Marcador() {
		this.puntaje=0;
		this.intentos=0;
	}

	/**
	 * Getter y Setter de la Clase
	 */
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public int getIntentos() {
		return intentos;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}//Fin Getter y Setter
}//Fin Clase
