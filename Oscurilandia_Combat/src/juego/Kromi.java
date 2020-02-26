package juego;

public class Kromi extends Carro {

	private String anioFab;
	private String marca;

	// Constructor
	public Kromi() {
		super(10, "2001");
		this.anioFab = "200" +Integer.toString(Utiles.generaRandom(9, 1));
		this.marca = Data.generaMarca();
	}



	@Override
	public String toString() {
		return "Kromi [patente="+patente+", anioFab=" + anioFab + ", marca=" + marca + ", cantidadOcupantes=" + cantidadOcupantes
				+ ", fechaIngreso=" + fechaIngreso + ", posiciones=" + posiciones + "]";
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

