package ejercicio4B2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
//		Crea un pequeño ejemplo con una clase POJO, que tenga algún atributo tipo LocalDate y otro tipo LocalTime. 
//		Haz algunos métodos en una clase GestionEventos para trabajar con dichos atributos. 
//		Puedes complicarlo usando una lista de objetos de esa clase y que, a su vez, haya métodos que hagan operaciones con la lista 
//		pero utilizando los atributos LocalDate y LocalTime. Si no es con eventos, puedes usar, por ejemplo, alquiler de Patinetes...

		List<Vuelo> lista = Arrays.asList(
				new Vuelo("Iberia",LocalDate.of(2023, 03, 03),LocalTime.of(12, 43,58),128,255),
				new Vuelo("Iberia",LocalDate.of(2023, 03, 23),LocalTime.of(18, 43,58),128,255),
				new Vuelo("Iberia",LocalDate.of(2023, 03, 28),LocalTime.of(22, 43,58),128,255),
				new Vuelo("Iberia",LocalDate.of(2023, 03, 25),LocalTime.of(23, 43,58),128,255),
				new Vuelo("Iberia",LocalDate.of(2023, 03, 22),LocalTime.of(5, 43,58),128,255),
				new Vuelo("Iberia",LocalDate.of(2023, 03, 15),LocalTime.of(7, 43,58),128,255),
				new Vuelo("Iberia",LocalDate.of(2023, 03, 17),LocalTime.of(8, 43,58),128,255), //08 es octal!
				new Vuelo("Iberia",LocalDate.of(2023, 03, 19),LocalTime.of(2, 43,58),128,255),
				new Vuelo("Iberia",LocalDate.of(2023, 03, 14),LocalTime.of(14, 43,58),128,255),
				new Vuelo("Iberia",LocalDate.of(2023, 03, 16),LocalTime.of(13, 43,58),128,255),
				new Vuelo("Iberia",LocalDate.of(2023, 03, 17),LocalTime.of(21, 43,58),128,255)
				);
		
	}
	public static void imprimirMenu(){
		System.out.println("0. Salir del programa.");
		System.out.println("1. Buscar vuelos por día de salida.");
		System.out.println("2. Buscar vuelos más largos que X minutos.");
		System.out.println("3. Buscar vuelo por ID.");
		System.out.println("4. Buscar vuelo por hora de salida");
	}
}
