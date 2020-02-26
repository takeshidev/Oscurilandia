package juego;
//caguano
public class Caguano extends Carro {

	private int alcanceTiro;
	private String colorConfetti;

	// Constructor
	public Caguano() {
		super(3, "2010");
		this.alcanceTiro = Utiles.generaRandom(10, 1);
		this.colorConfetti = Data.generaColor();
	}

	// ToString
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	@Override
	public String toString() {
		return "Caguano [patente="+patente+",alcanceTiro=" + alcanceTiro + ", colorConfetti=" + colorConfetti + ", cantidadOcupantes="
				+ cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", posiciones=" + posiciones + "]";
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfetti() {
		return colorConfetti;
	}

	public void setColorConfetti(String colorConfetti) {
		this.colorConfetti = colorConfetti;
	}
//d
}

