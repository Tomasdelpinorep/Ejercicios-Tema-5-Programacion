package ejercicio1B2;

import java.util.Arrays;
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
		String letra;
		
		List<Alumno> lista = Arrays.asList(
				new Alumno("Tomas","del Pino","DAM",7.5,19),
				new Alumno("Eduardo","Granadas","DAM",5.2,42),
				new Alumno("Jamal","Musiala","DAM",9.3,18),
				new Alumno("Francisco","Rodriguez","DAM",9.7,24),
				new Alumno("Anastasia","Benitez","DAM",8.3,21),
				new Alumno("Tomas","Ruiz","DAM",7.2,18),
				new Alumno("Jose Francisco","Perez","DAM",6.8,19),
				new Alumno("Ana","Acuña","DAM",6.8,20)
				);
		
		Secretaria s = new Secretaria(lista);
		
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 1:
				s.imprimirLista(s.mayores20());
				break;
				
			case 2:
				s.imprimirLista();
				break;
				
			case 3:
				System.out.println("Con que letra empiezan?");
				letra=Leer.dato();
				s.imprimirLista(s.empiezanPor(letra));
				break;
				
			case 4:
				System.out.println("El tamaño de la lista es de " + s.getTamano());
				break;
				
			case 5:
				s.imprimirLista(s.filtrarEncima9());
				break;
				
			case 6:
				s.imprimirLista(s.obtener3Primeros());
				break;
				
			case 7:
				System.out.println("El alumno de menor edad es " + s.encontrarMenorEdad());
				break;
				
			case 8:
				s.obtenerPrimero();
				break;
				
			case 9:
				s.imprimirLista(s.filtrarMas10Letras());
				break;
				
			case 10:
				s.imprimirLista(s.filtrar6LetrasConA());
				break;
			}
		}while(opcion!=0);
	}

	public static void imprimirMenu() {
		System.out.println("\n*******************************************************\n");
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
		System.out.println("\n*******************************************************\n");
	}
}
