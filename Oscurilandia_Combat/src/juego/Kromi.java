package juego;
/**
 * Esta clase define los objetos Kromi. Clase Hija
 * @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorsa
 * @version 2.0.0
 */
public class Kromi extends Carro {

	//Atributos de la Clase
	private String anioFab;
	private String marca;

	/**
	 * Constructor por defecto del objeto
	 */
	public Kromi() {
		super(10, "2001");
		this.anioFab = "200" +Integer.toString(Utiles.generaRandom(9, 1));
		this.marca = Data.generaMarca();
	}//Fin Constructor

	/**
	 * Cosntructor ToString de la Clase
	 */
	@Override
	public String toString() {
		return "Kromi [patente="+patente+", anioFab=" + anioFab + ", marca=" + marca + ", cantidadOcupantes=" + cantidadOcupantes
				+ ", fechaIngreso=" + fechaIngreso + ", posiciones=" + posiciones + "]";
	}//Fin Constructor

	/**
	 * Getter y Setter de la Clase
	 */
	public String getAnioFab() {
		return anioFab;
	}

	public void setAnioFab(String anioFab) {
		this.anioFab = anioFab;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}//Fin Getter y Setter
}//Fin Clase