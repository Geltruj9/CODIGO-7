package codigo7;

 import java.util.HashMap;
 import java.util.Scanner;

public class Codigo7 { 

// se le renombra Main en vez de codigo7

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner scanner = new Scanner(System.in); //Se le agrega system.in
		    // se importa scanner

		    HashMap<String, String> capitales = new HashMap<String,String>(); 
		    //importa HashMap para almacenar paises y capitales y scanner, se cambia bite y double por string 

		    capitales.put("Canadá", "Otawwa");
		    capitales.put("Estados Unidos", "Washington DC");
		    capitales.put("México", "México DF");
		    capitales.put("Belice", "Belmopán");
		    capitales.put("Costa rica", "San José");
		    capitales.put("El Salvador","El Salvador");
		    capitales.put("Guatemala", "Ciudad de Guatemala");
		    capitales.put("Honduras", "Tegucigalpa");
		    capitales.put("Nicaragua", "Managua");
		    capitales.put("Panamá", "Panamá");
		   
		    String pais = ""; //la variable alamacenara el pais ingresado al ususario
		    do {
		      System.out.println("Escribe el nombre de un país y te diré su capital: (escribe 'salir' para terminar):");
		      pais = scanner.nextLine().toLowerCase(); //  agregar la palabra pais Convertir a minúsculas para una comparación insensible a mayúsculas     
		      if (!pais.equals("salir")) { //agrega s ala palabra equals
		        if (capitales.containsKey(pais)) { //verificar si el pais existe en el hashmap , se cambia el Value por Key ,buscara por clave y get obtendra el valor asociado
		          System.out.println("La capital de " + pais + " es " + capitales.get(pais));
		        } else {
		          System.out.print("No conozco la respuesta. ¿cuál es la capital de " + pais + "?: ");
		          String nuevaCapital = s.nextLine(); // lee la nueva capital
		          capitales.put(pais, nuevaCapital); //agregar la nueva capital al Hashmap
		          System.out.println("Gracias por enseñarme nuevas capitales: D");
		        }
		      }
		    } while (!c.equals("salir")); //corregir letra el bucle termina si el usuario decide salir.
		}
	}

