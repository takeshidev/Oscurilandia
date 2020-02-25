package juego;

public class Marcador {

	int puntaje;
	int intentos;
	
	public Marcador() {
		this.puntaje=0;
		this.intentos=0;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public int getIntentos() {
		return intentos;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

}
