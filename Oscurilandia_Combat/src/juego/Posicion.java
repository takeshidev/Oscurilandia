package juego;
/**
* Esta clase almacena las coordenada vertical y horizontal 
* @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorsa
* @version 2.0.0
*/
public class Posicion {
	
	//Atributos de la Clase
	private int x;
	private int y;

	/**
	 * Constructor por defecto de la Clase
	 * @param x Parametro para la coordenada de las verticales
	 * @param y Parametro para la coordenada de las horizontales
	 */
	public Posicion(int x, int y) {
		this.x = x;
		this.y = y;
	}//Fin Constructor

	/**
	 * Constructor ToString de la Clase
	 */
	@Override
	public String toString() {
		return "Pos [x=" + x + ", y=" + y + "]";
	}//Fin Constructor

	/**
	 * Getter y Setter de la Clase
	 */
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}//Fin Getter y Setter
}//Fin Clase