package juego;

public class Huevo {

	private int x;
	private int y;
	private int puntaje = 0;
	private String codigo = "[H]";
	
	public Huevo() {
		}
	public Huevo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Huevo [X=" + x + ", Y=" + y + ", puntaje=" + puntaje + "]";
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

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	
}
