package ejercicio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
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
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra en español:");
        String palabraEspañol = scanner.nextLine();

        String palabraIngles = diccionario.get(palabraEspañol);

        if (palabraIngles != null) {
            System.out.println("La traducción de " + palabraEspañol + " es: " + palabraIngles);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario, inténtalo de nuevo");
        }
        scanner.close();
    }
}
