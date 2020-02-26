package juego;
//hola

public class Trupalla extends Carro {
	Data d1 = new Data();
	private int armadura;
	private String nombreConductor;

	// Constructor
	public Trupalla() {
		super(2, "2015");
		this.armadura = d1.generaArmadura();//Cambio Juanca
		this.nombreConductor = d1.generaNombre();//Cambio Juanca
	}

	@Override
	public String toString() {
		return "Trupalla [armadura=" + armadura + ", nombreConductor=" + nombreConductor + ", cantidadOcupantes="
				+ cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + "]" + getX() + "-"+ getY();
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
