package com.utn.modelo;

public class Reserva {

	private Pelicula pelicula;
	private Usuario usuario;
	
	private String ticketReserva; 
	public Reserva(Pelicula pelicula, Usuario usuario) {
		super();
		this.pelicula = pelicula;
		this.usuario = usuario;
		this.ticketReserva="numero auto generado";
		
	} 
	public Reserva(Pelicula pelicula, Usuario usuario, String ticketReserva) {
		super();
		this.pelicula = pelicula;
		this.usuario = usuario;
		this.ticketReserva = ticketReserva;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public String getTicketReserva() {
		return ticketReserva;
	}
	
	
	
	
	
}
