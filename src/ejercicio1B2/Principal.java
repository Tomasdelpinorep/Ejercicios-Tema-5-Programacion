package ejercicio1B2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
//		Tenemos una clase Alumno caracterizada por su nombre, apellidos, nombre del curso, nota media y edad. 
//		Por otro lado, en la clase Secretaría contamos con una List de alumnos, en la que se pide que haya los métodos adecuados 
//		para, usando expresiones lambda y stream:
//			* Obtener todos los alumnos de la lista usando filter.
//			* Mostrar todos los alumnos imprimiéndolos con forEach ().
//			* Imprimir todos los alumnos cuyo nombre empiece con una letra determinada (puede ser leída por teclado).
//			* Dar el tamaño de la lista usando count ().
//			* Obtener los alumnos con nota media mayor de 9 en el curso 1DAM.
//			* Imprimir los 3 primeros alumnos de la lista usando limit ().
//			* Obtener el alumno de menor edad. (min)
//			* Obtener el primer alumno de la lista con findFirst().
//			* Obtener una nueva lista con los alumnos cuya longitud de la cadena de su nombre sea mayor a 10 letras.
//			* Obtener los alumnos que empiecen por la letra A y la longitud de su nombre sea menor o igual a 6.
		
		int opcion=0;
		
		List<Alumno> lista = new ArrayList<>();
		lista.add(new Alumno("Tomas","del Pino","DAM",7.5,19));
		lista.add(new Alumno("Eduardo","Granadas","DAM",5.2,42));
		lista.add(new Alumno("Jamal","Musiala","DAM",9.3,18));
		lista.add(new Alumno("Francisco","Rodriguez","DAM",9.7,24));
		lista.add(new Alumno("Anastasia","Benitez","DAM",8.3,21));
		lista.add(new Alumno("Tomas","Ruiz","DAM",7.2,18));
		lista.add(new Alumno("Jose Francisco","Perez","DAM",6.8,19));
		
		Secretaria s = new Secretaria(lista);
		
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 1:
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			case 6:
				break;
				
			case 7:
				break;
				
			case 8:
				break;
				
			case 9:
				break;
				
			case 10:
				break;
			}
		}while(opcion!=0);
	}

	public static void imprimirMenu() {
		System.out.println("1. Obtener datos de alumnos, filtrando los mayores de 20.");
		System.out.println("2. Imprimir todos los alumnos con ForEach.");
		System.out.println("3. Imprimir todos los alumnos cuyos nombres empiecen con T.");
		System.out.println("4. Imprimir tamaño de lista.");
		System.out.println("5. Devolver alumnos con nota media mayor que 9.");
		System.out.println("6. Imprimir los 3 primeros alumnos de la lista.");
		System.out.println("7. Obtener el alumno de menor edad.");
		System.out.println("8. Obtener primer alumno de la lista.");
		System.out.println("9. Obtener nueva lista de alumnos cuyos nombres tengan más de 10 letras.");
		System.out.println("10. Obtener alumnos cuyos nombres empiecen por A, con nombres más largos que 6 caracteres.");
	}
}
