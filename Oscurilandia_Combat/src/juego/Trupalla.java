package juego;

public class Trupalla extends Carro {
	
	private int armadura;
	private String nombreConductor;

	// Constructor
	//ss
	public Trupalla() {
		super(2, "2015");
		this.armadura = Data.generaArmadura();
		this.nombreConductor = Data.generaNombre();
	}

	@Override
	public String toString() {
		return "Trupalla [patente="+patente+", armadura=" + armadura + ", nombreConductor=" + nombreConductor + ", cantidadOcupantes="
				+ cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", posiciones=" + posiciones + "]";
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

}
