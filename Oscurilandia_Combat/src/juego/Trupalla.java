package juego;
//hola

public class Trupalla extends Carro {
	private int armadura;
	private String nombreConductor;

	// Constructor
	public Trupalla() {
		super(2, "2015");
		this.armadura = 1;
		this.nombreConductor = "Trupallero";
	}



	@Override
	public String toString() {
		return "Trupalla [armadura=" + armadura + ", nombreConductor=" + nombreConductor + ", cantidadOcupantes="
				+ cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + "]" + getColumna() + ""+ getFila();
	}



	// Getters and Setters
	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}
//dsds
}
