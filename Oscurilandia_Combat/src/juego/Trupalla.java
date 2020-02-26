package juego;
/**
* Esta clase crea objetos Trupalla. Clase Hija 
* @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorsa
* @version 2.0.0
*/
public class Trupalla extends Carro {
	
	//Atributos de la Clase
	private int armadura;
	private String nombreConductor;

	/**
	 * Constructor por defecto de la Clase
	 */
	public Trupalla() {
		super(2, "2015");
		this.armadura = Data.generaArmadura();
		this.nombreConductor = Data.generaNombre();
	}//Fin Constructor

	/**
	 * Constructor ToString de la Clase
	 */
	@Override
	public String toString() {
		return "Trupalla [patente="+patente+", armadura=" + armadura + ", nombreConductor=" + nombreConductor + ", cantidadOcupantes="
				+ cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", posiciones=" + posiciones + "]";
	}//Fin Constructor

	/**
	 * Getter y Setter de la Clase
	 */
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
	}//Fin Getter y Setter
}//Fin Clase
