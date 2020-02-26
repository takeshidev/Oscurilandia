package juego;

import java.util.Random;
/**
 * Esta clase almacena la informcion para los atributos de los objetos Carro
 * @author Carlos Donoso, Takeshi Kita, Juan Carlos Tolorsa
 * @version 2.0.0
 */
public class Data {
	
	//Campos de la Clase
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
	 };//Fin Campos de Clase
	
	 /**
	  * Metodo que inserta una marca aleatorea desde el campo marcas
	  * @return Retorna la marca aleatoria para el objeto
	  */
	 public static String generaMarca() {
		 Random r = new Random();
		 int i = r.nextInt(marcas.length);
		 String marca = marcas[i];
		 return marca;
	 }//Fin Metodo
	 
	 /**
	  * Metodo que inserta un nombre aleatorea desde el campo conductores
	  * @return Retorna el nombre aleatorio para el objeto
	  */
	 public static String generaNombre() {
		 Random r = new Random();
		 int i = r.nextInt(conductores.length);
		 String nombre = conductores[i];
		 return nombre;
	 }//Fin Metodo
	 
	 /**
	  * Metodo que inserta un color aleatoreo desde el campo colores
	  * @return Retorna el nombre aleatorio para el objeto
	  */
	 public static String generaColor() {
		 Random r = new Random();
		 int i = r.nextInt(colores.length);
		 String color = colores[i];
		 return color;
	 }//Fin Metodo
	 
	 /**
	  * Metodo que agrega un valor de armadura aleatorio entre 1 y 5
	  * @return Retorna un nivel de armadura aleatorio para el objeto
	  */
	 public static int generaArmadura(){
		 Random r = new Random();
		 int armadura = r.nextInt(5)+1;
		 return armadura;
	 }//Fin Metodo
}//Fin Clase
