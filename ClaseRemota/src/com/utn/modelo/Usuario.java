package com.utn.modelo;

public class Usuario {

	private String nombre;
	private String numSocio;
	private int telefono;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(String numSocio) {
		this.numSocio = numSocio;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Usuario(String nombre, int telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Usuario(String nombre, String numSocio, int telefono) {
		super();
		this.nombre = nombre;
		this.numSocio = numSocio;
		this.telefono = telefono;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
}
