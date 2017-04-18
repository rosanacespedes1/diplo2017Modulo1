package com.utn.modelo;

import com.utn.modelo.enumerable.Generos;

public class Pelicula {

	private Generos genero;
	private String titulo;
	private double duracion;
	
	
	//Sobre-Carga de constructor mismo contrato pero distinta firma...
	public Pelicula(){
	}
	
	//constructor... 
	public Pelicula(Generos genero, String titulo, double duracion) {
		super();
		this.genero = genero;
		this.titulo = titulo;
		this.duracion = duracion;
	}
	
	//Getter y Setter...
	public Generos getGenero() {
		return genero;
	}
	public void setGenero(Generos genero) {
		this.genero = genero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Pelicula [genero=" + genero + ", titulo=" + titulo + ", duracion=" + duracion + "]";
	}
	
	
}
