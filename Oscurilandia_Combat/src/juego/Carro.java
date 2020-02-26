package juego;

import java.util.ArrayList;
import juego.Utiles;

//carro
public class Carro {
	protected int cantidadOcupantes;
	protected String fechaIngreso;
	private Posicion posicion;
	ArrayList<Posicion> posiciones = new ArrayList<Posicion>();

	// Constructor
	public Carro(int cantidadOcupantes, String fechaIngreso) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
	}

	// Metodos del Carro
	public void agregarPosicion(Posicion posicion) {
		this.posiciones.add(posicion);
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
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", x=" + ", y="
				+ "]";
	}

}
