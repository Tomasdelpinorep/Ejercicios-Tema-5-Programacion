package ejercicio2B2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
//		Crear un programa que trabaje con una lista de cadenas con la que se puedan hacer las siguientes operaciones:
//			* Ordenar las cadenas por orden alfabético.
//			* Buscar una cadena dada por teclado.
//			* Crear un nuevo String formado por la primera letra de cada palabra que contiene la lista.
//			* Borrar las palabras que tengan longitud impar de letras.
//			* Pasar todas las palabras a mayúsculas.

		int opcion=0;
		String cadena;
		
		List<String> lista = Arrays.asList(
				"Diptongo",
				"Esternocliedomastoideo",
				"Billar",
				"Paracetamol",
				"Murcia",
				"Españita",
				"Mensaje",
				"Anacardo"
				);
		
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				System.out.println("Gracias por utilizar el programa.");
				break;
				
			case 1:
				lista.stream()
				.sorted()
				.collect(Collectors.toList())
				.forEach(System.out::println);
				break;
				
			case 2:
				System.out.println("Introduzca una cadena:");
				cadena=Leer.dato();
				lista.stream()
				.filter(s -> s.equalsIgnoreCase(cadena))
				.collect(Collectors.toList());
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
			}
		}while(opcion!= 0);
	}
	
	public static void imprimirMenu() {
		System.out.println("\n************************************************\n");
		System.out.println("0. Salir del programa.");
		System.out.println("1. Ordenar albabéticamente.");
		System.out.println("2. Buscar una cadena dada por teclado");
		System.out.println("3. Nuevo string con la primera letra de cada palabra.");
		System.out.println("4. Borrar palabras con longitud impar.");
		System.out.println("5. Pasar todas las palabras a mayúsculas.");
		System.out.println("\n************************************************\n");
	}
}
