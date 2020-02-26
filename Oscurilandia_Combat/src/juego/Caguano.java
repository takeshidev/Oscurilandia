package juego;
/**
 * Esta clase define los objetos Carro de tipo Caguano. Clase Hija
 * @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorsa
 * @version 2.0.0
 */
public class Caguano extends Carro {

	// Atributos de la Clase
	private int alcanceTiro;
	private String colorConfetti;

	/**
	 * Constructor para objetos de tipo Caguano
	 */
	public Caguano() {
		super(3, "2010");
		this.alcanceTiro = Utiles.generaRandom(10, 1);
		this.colorConfetti = Data.generaColor();
	}//Fin Constructor

	/**
	 * Cosntructor ToString de la Clase
	 */
	@Override
	public String toString() {
		return "Caguano [patente=" + patente + ",alcanceTiro=" + alcanceTiro + ", colorConfetti=" + colorConfetti
				+ ", cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", posiciones="
				+ posiciones + "]";
	}//Fin Constructor

	/**
	 * Getter y Setter de la Clase
	 */
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfetti() {
		return colorConfetti;
	}

	public void setColorConfetti(String colorConfetti) {
		this.colorConfetti = colorConfetti;
	}//Fin Getter y Setter
}//Fin Clase
