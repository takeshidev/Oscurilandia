package juego;

import java.util.ArrayList;
import juego.Utiles;


public class Carro {
	protected String patente;
	protected int cantidadOcupantes;
	protected String fechaIngreso;
	private Posicion posicion;
	protected int vida=1;
	ArrayList<Posicion> posiciones = new ArrayList<Posicion>();

	// Constructor
	public Carro(int cantidadOcupantes, String fechaIngreso) {
		this.patente="HDP0"+Utiles.generaRandom(9, 1)+Utiles.generaRandom(9, 1);
		this.cantidadOcupantes = Utiles.generaRandom(5, 1);
		this.fechaIngreso = "200" +Integer.toString(Utiles.generaRandom(9, 1));
	}

	// Metodos del Carro
	public void agregarPosicion(Posicion posicion) {
		this.posiciones.add(posicion);
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	// Getters and Setters
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
	}

	// To String
	@Override
	public String toString() {
		return "Carro [patente="+patente+", Vida="+vida+" Ocupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", x=" + ", y="
				+ "]";
	}

}
