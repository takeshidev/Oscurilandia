package juego;
//caguano
public class Caguano extends Carro {

	private int alcanceTiro;
	private String colorConfetti;

	// Constructor
	public Caguano() {
		super(3, "2010");
		this.alcanceTiro = alcanceTiro;
		this.colorConfetti = colorConfetti;
	}

	// ToString
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfetti=" + colorConfetti + ", cantidadOcupantes="
				+ cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + "]"+ getX() + "-"+ getY();
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

