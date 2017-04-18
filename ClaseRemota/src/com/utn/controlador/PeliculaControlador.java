package com.utn.controlador;

import java.util.ArrayList;

import com.utn.modelo.Pelicula;
import com.utn.modelo.enumerable.Generos;

public class PeliculaControlador {

	//lista de peliculas
	
	private ArrayList<Pelicula> listaPeliculas;
	//
	
	public PeliculaControlador() {
		this.listaPeliculas = new ArrayList<Pelicula>();
	}
	
	//damos de alta una pelicula
		
	public Pelicula creoPelicula(Generos genero, String titulo, double duracion){
		Pelicula p = new Pelicula(genero, titulo, duracion);
		this.listaPeliculas.add(p); // agregamos un objeto a la lista
		
		return p;
	}
	
	//sobrecarga del metodo anterior sin utilizar la lista 
	public Pelicula creoPelicula(Generos genero, String titulo){
		
		return new Pelicula(genero, titulo, 100);
	}
		
	//borramos pelicula
	public void borroPelicula(int indice){
		this.listaPeliculas.remove(indice);
	}
	
	//modifico el objeto   //ArraList 
	public void modificoPelicula(int indice, Pelicula peliculaModificada){
		this.listaPeliculas.remove(indice);
		this.listaPeliculas.add(indice, peliculaModificada);
	}
	
	public void muestroListadoPeliculasAlquiladas(){
		for(Pelicula p : listaPeliculas){
			System.out.println(p);
		}
	}
	
	
}
