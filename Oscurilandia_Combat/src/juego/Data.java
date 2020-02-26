package juego;
import java.util.Random;
public class Data {
	private String nombre;
	private int armadura;
	public Data() {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String[] getConductotres() {
		return conductores;
	}
	 //LISTAS
	//ss
	 private final String conductores[] = {
		        "Andres", "Javiera", "Manuel", "Super Dick", "Ernesto",
		            "Pedro", "Emiliano", "Juan Pablo", "Alicia", "Julio", "Sebastian", "Roberto", "Pablo",
		            "Tadeo", "Sebastian", "Marcela", "Carlos", "Nicanor", "Rita", "Paula", "Martin",
		            "Augusto", "Joaquin", "Marcelo", "Beno", "Luis", "Gonzalo", "Alberto", "Hector",
		            "Marco", "Mirta", "Matias", "Luz", "Paulo", "Henrique", "Marilu", "Julian",
		            "Gabriel", "Marta", "Juan Carlos", "Juan", "Valentina", "Daniel", "Camilo"
		    };
	 //Metodos
	 public String generaNombre() {
		 Random r = new Random();
		 int i = r.nextInt(conductores.length);
		 nombre = conductores[i];
		 return nombre;
	 }
	 public int generaArmadura(){
		 Random r = new Random();
		 armadura = r.nextInt(5)+1;
		 return armadura;
	 }
	 
}
