package juego;
/**
 * Clase que crea objetos tipo Huevo
 * @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorza
 * @version 2.0.0
 */
public class Huevo {

	//Atributos de la Clase
	private int x;
	private int y;
	private int puntaje = 0;
	private String codigo = "[H]";
	
	/**
	 * Constructor por defecto de la Clase
	 */
	public Huevo() {
	}//Fin Constructor
	
	/**
	 * Constructor que recibe las coordenadas para el objeto Huevo
	 * @param x Corresponde a la coordenada horizontal
	 * @param y Corresponde a la coordenada vertical
	 */
	public Huevo(int x, int y) {
		this.x = x;
		this.y = y;
	}//Fin Constructor

	/**
	 * Getter y Setter de la Clase
	 */
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

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
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}//Fin Getter y Setter
	
	/**
	 * Cosntructor ToString de la Clase
	 */
	@Override
	public String toString() {
		return "Huevo [X=" + x + ", Y=" + y + ", puntaje=" + puntaje + "]";
	}//Fin ToString
}//Fin Clase
