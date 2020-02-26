package juego;
import juego.Utiles;

//carroo
public class Carro {
	protected int cantidadOcupantes;
	protected String fechaIngreso;
	private int x;
	private int y;

	// Constructor
	public Carro(int cantidadOcupantes, String fechaIngreso) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
				
		this.x = Utiles.generaRandom(14, 0);
		this.y = Utiles.generaRandom(14, 0);
		
		
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//To String
	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", x=" + x
				+ ", y=" + y + "]";
	}


}
