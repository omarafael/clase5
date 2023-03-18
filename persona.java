package compras;

import java.time.Duration;
import java.time.LocalDateTime;

public class persona {

	private String nombre;
	private String apellido;
	private LocalDateTime fechanac;
	private carrito carro;
	
	
	public persona(String nombre, String apellido, LocalDateTime fechanac, carrito carro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
		this.carro = carro;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDateTime getFechanac() {
		return fechanac;
	}


	public void setFechanac(LocalDateTime fechanac) {
		this.fechanac = fechanac;
	}


	public carrito getcarro() {
		return carro;
	}


	public void setCarro(carrito carro) {
		this.carro = carro;
	}

	public int edad() {
		LocalDateTime fechaactual=LocalDateTime.now();
		long dias=Duration.between(this.fechanac, fechaactual).toDays();
		int edad=(int) (dias/365.2425);
		return edad;
		
	}
	
}
