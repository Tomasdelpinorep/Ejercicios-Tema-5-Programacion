package ejercicio1B2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Secretaria {

	private List<Alumno> lista;

	public Secretaria(List<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public Optional<Alumno> obtenerPrimero(){
		Optional<Alumno> primero = lista.stream().findFirst();
		
		return primero;
	}
	
	public List<Alumno> obtener3Primeros(){
		List<Alumno> primeros3 = lista.stream().limit(3).collect(Collectors.toList());
		
		return primeros3;
	}
	
	public List<Alumno> filtrarEncima9(){
		List<Alumno> encimaDe9 = lista.stream()
				.filter(a -> a.getNotaMedia() > 9)
				.collect(Collectors.toList());
		
		return encimaDe9;
	}
	
	public List<Alumno> filtrarMas10Letras(){
		List<Alumno> lista10letras = lista.stream()
				.filter(a -> a.getNombre().length() > 10)
				.collect(Collectors.toList());
		
		return lista10letras;
	}
	
	public List<Alumno> filtrar6LetrasConA(){
		List<Alumno> lista10letras = lista.stream()
				.filter(a -> a.getNombre().length() <= 6 && a.getNombre().substring(0,1).equalsIgnoreCase("A"))
				.collect(Collectors.toList());
		
		return lista10letras;
	}
	
	public Alumno encontrarMenorEdad(){
		Alumno menorEdad = lista.stream()
				.min((a1,a2) -> a1.getEdad() > a2.getEdad() ? 1 : a1.getEdad() < a2.getEdad() ? -1 : 0).orElse(null);
		
		return menorEdad;
	}
	
	public List<Alumno> mayores20() {
		List<Alumno> listaMayores = lista.stream()
				.filter(a -> a.getEdad() > 20)
				.collect(Collectors.toList());
 
		return listaMayores;
	}
	
	public List<Alumno> empiezanPor(String letra){
		List<Alumno> listaLetra = lista.stream()
				.filter(a -> a.getNombre().substring(0,1).equalsIgnoreCase(letra))
				.collect(Collectors.toList());
		
		return listaLetra;
	}
	
	public void imprimirLista(List<Alumno> lista) {
		lista.forEach(System.out::println);
	}
	
	public void imprimirLista() {
		lista.forEach(System.out::println);
	}
	
	public long getTamano() {
		return lista.stream().count();
	}
}
