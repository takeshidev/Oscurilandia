package juego;
import java.util.Random;
public class Data {
	
	 //Listas
	 private static final String conductores[] = {
		        "Andres", "Javiera", "Manuel", "Super Dick", "Ernesto",
		            "Pedro", "Emiliano", "Juan Pablo", "Alicia", "Julio", "Sebastian", "Roberto", "Pablo",
		            "Tadeo", "Sebastian", "Marcela", "Carlos", "Nicanor", "Rita", "Paula", "Martin",
		            "Augusto", "Joaquin", "Marcelo", "Beno", "Luis", "Gonzalo", "Alberto", "Hector",
		            "Marco", "Mirta", "Matias", "Luz", "Paulo", "Henrique", "Marilu", "Julian",
		            "Gabriel", "Marta", "Juan Carlos", "Juan", "Valentina", "Daniel", "Camilo", "Marisel","Alan","Diego"
		    };
	 private static final String colores[] = {
			 "Azul","Rojo","Amarillo","Cafe","Verde","Morado","Naranjo","Blanco",
			 "Negro","Dorado","Plateado","Celeste","Caoba","Burdeo","Caqui","Cereza","Coral",
			 "Gris","Hueso","Lavanda","Ocre","Pardo","Rosa","Salmon","Turquesa","Esmeralda",
			 "Verde olivo","Bermellon","Carmin","Escrlata","Fucsia","Magenta","Terracota",
			 "Begonia","Malva","Palo rosa","Rosa pastel","Nogal"
	 };
	 private static final String marcas[] = {
			 "Abarth","Alfa Romeo","Alpine","Aston Martin","Audi","Bentley","BMW","Bugatti",
			 "Baic","Brilliance","Changan","Chery","Chevrolet","Chrysler","Citroen","DFM","DFSK",
			 "Dodge","Faw","Ferrari","Fiat","Ford","Foton","Great Wall","Honda","Hyundai",
			 "JAC","Jeep","KIA","Jaguar","Lifan","Lexus","Mercedes Benz","MG","Mini","Nissan",
			 "Peugeot","Porsche","Renault","Subaru","Suzuki","Toyota","Volkswagen","Volvo","Rolls Royce",
			 "Lamborghini","Hummer"
	 };
	 //Metodos
	 public static String generaMarca() {
		 Random r = new Random();
		 int i = r.nextInt(marcas.length);
		 String marca = marcas[i];
		 return marca;
	 }
	 public static String generaNombre() {
		 Random r = new Random();
		 int i = r.nextInt(conductores.length);
		 String nombre = conductores[i];
		 return nombre;
	 }
	 
	 public static String generaColor() {
		 Random r = new Random();
		 int i = r.nextInt(colores.length);
		 String color = colores[i];
		 return color;
	 }
	 
	 public static int generaArmadura(){
		 Random r = new Random();
		 int armadura = r.nextInt(5)+1;
		 return armadura;
	 }
	 
}
