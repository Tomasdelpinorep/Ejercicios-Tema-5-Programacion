package ejercicio4B2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {

	private String id,compania;
	private LocalDate fechaSalida;
	private LocalTime tiempoSalida;
	private double duracion;
	private int maxPasajeros;
	
	public Vuelo(String compania, LocalDate fechaSalida, LocalTime tiempoSalida, double duracion,
			int numPasajeros) {
		super();
		this.compania = compania;
		this.fechaSalida = fechaSalida;
		this.tiempoSalida = tiempoSalida;
		this.duracion = duracion;
		this.maxPasajeros = numPasajeros;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public LocalTime getTiempoSalida() {
		return tiempoSalida;
	}
	public void setTiempoSalida(LocalTime tiempoSalida) {
		this.tiempoSalida = tiempoSalida;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public int getMaxPasasjeros() {
		return maxPasajeros;
	}
	public void setMaxPasasjeros(int maxPasasjeros) {
		this.maxPasajeros = maxPasasjeros;
	}
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", compania=" + compania + ", fechaSalida=" + fechaSalida + ", tiempoSalida="
				+ tiempoSalida + ", duracion=" + duracion + ", maxPasasjeros=" + maxPasajeros + "]";
	}
	
	
	
}
