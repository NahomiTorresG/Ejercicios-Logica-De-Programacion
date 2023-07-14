package ejercicio10;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;


public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un HashMap con strings como clave y valor
        Map<String, String> diccionario = new HashMap<>();
        
        //Elementos del diccionario:
        diccionario.put("raton", "mouse");   			//1
        diccionario.put("puerta", "door");  			//2
        diccionario.put("toalla", "towel");  			//3
        diccionario.put("tio", "uncle");     			//4
        diccionario.put("lapiz", "pencil");  			//5
        diccionario.put("huevo", "egg");     			//6
        diccionario.put("lagrima", "tear");  			//7
        diccionario.put("carro", "car");     			//8
        diccionario.put("espejo", "mirror"); 			//9
        diccionario.put("perro", "dog");     			//10
        diccionario.put("arbol", "tree");    			//11
        diccionario.put("foco", "bulb");     			//12
        diccionario.put("ayuda", "help");    			//13
        diccionario.put("caballo", "horse"); 			//14
        diccionario.put("libro", "book");    			//15
        diccionario.put("flor", "flower");   			//16
        diccionario.put("zapato", "shoe");   			//17
        diccionario.put("pastel", "cake");   			//18
        diccionario.put("pluma", "feather"); 			//19
        diccionario.put("ornitorrinco", "platypus");    //20
        
        
      		
      		// Escoger al azar 5 palabras en español del mini diccionario
            	List<String> palabrasEspanol = new ArrayList<>(diccionario.keySet());
            	
            	//es un método estático que reordena aleatoriamente los elementos de una lista.
            	Collections.shuffle(palabrasEspanol);
              //es la lista resultante que contiene las primeras 5 palabras de palabrasEspaniol en el orden aleatorio generado por shuffle.
              List<String> palabrasSeleccionadas = palabrasEspanol.subList(0, 5);
      		
              
              
           // Pedir al usuario que ingrese las traducciones
              Scanner scanner = new Scanner(System.in);
              int respuestasCorrectas = 0;
              int respuestasIncorrectas = 0;
              
              System.out.println("Traduce las siguientes palabras al inglés:");
              for (String palabraEspanol : palabrasSeleccionadas) {
                  System.out.print(palabraEspanol + ": ");
                  String respuestaUsuario = scanner.nextLine();
                  
                  String traduccionCorrecta = diccionario.get(palabraEspanol);
                  if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                      respuestasCorrectas++;
                  } else {
                      respuestasIncorrectas++;
                  }
              }
              
              // Mostrar resultados
              System.out.println("\nRespuestas correctas: " + respuestasCorrectas);
              System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);


        
        scanner.close();
	}

}
