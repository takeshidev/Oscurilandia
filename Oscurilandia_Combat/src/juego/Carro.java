package juego;
import juego.Utiles;

//carroo
public class Carro {
	protected int cantidadOcupantes;
	protected String fechaIngreso;
	private int fila;
	private int columna;

	// Constructor
	public Carro(int cantidadOcupantes, String fechaIngreso) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
				
		this.fila = Utiles.generaRandom(14, 0);
		this.columna = Utiles.generaRandom(14, 0);
		
		
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

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	//To String
	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", fila=" + fila
				+ ", columna=" + columna + "]";
	}

	//ds

}
