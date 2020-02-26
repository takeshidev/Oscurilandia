package juego;

import java.util.ArrayList;
import juego.Utiles;
/**
 * Esta clase define los objetos Carro. SuperClase
 * @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorsa
 * @version 2.0.0
 */
public class Carro {
	
	//Constructores de la Clase
	protected String patente;
	protected int cantidadOcupantes;
	protected String fechaIngreso;
	private Posicion posicion;
	protected int vida=1;
	
	//Campos de la Clase
	ArrayList<Posicion> posiciones = new ArrayList<Posicion>();

	/**
	 * Constructor Carro que crear objetos tipo Carro con parametros por entrada
	 * @param cantidadOcupantes Parametro que muestra la cantidad de ocupantes que tiene el carro
	 * @param fechaIngreso Parametro que indentifica la fecha de ingreso del objeto
	 */
	public Carro(int cantidadOcupantes, String fechaIngreso) {
		this.patente="HDP0"+Utiles.generaRandom(9, 1)+Utiles.generaRandom(9, 1);
		this.cantidadOcupantes = Utiles.generaRandom(5, 1);
		this.fechaIngreso = "200" +Integer.toString(Utiles.generaRandom(9, 1));
	}//Fin Constructor

	/**
	 * Metodo que permite agregar posiciones al objeto
	 * @param posicion Se ingresa un aposicion para el objeto
	 */
	public void agregarPosicion(Posicion posicion) {
		this.posiciones.add(posicion);
	}//Fin Metodo

	/**
	 * Getter y Setter de la Clase
	 */
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}//Fin Getter y Setter

	/**
	 * Cosntructor ToString de la Clase
	 */
	@Override
	public String toString() {
		return "Carro [patente="+patente+", Vida="+vida+" Ocupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", x=" + ", y="
				+ "]";
	}//Fin Constructor
}//Fin Clase
