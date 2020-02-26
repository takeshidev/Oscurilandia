package juego;
//kromii

public class Kromi extends Carro {

	private String anioFab;
	private String marca;

	// Constructor
	public Kromi() {
		super(10, "2001");
		this.anioFab = "2000";
		this.marca = "Chancho";
	}

	@Override
	public String toString() {
		return "Kromi [anioFab=" + anioFab + ", marca=" + marca + ", cantidadOcupantes=" + cantidadOcupantes
				+ ", fechaIngreso=" + fechaIngreso + "]"+ getX() + "-"+ getY();
	}

	// Getters and Setters
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
	}

}

