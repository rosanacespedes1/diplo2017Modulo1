package com.utn.controlador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.utn.modelo.Pelicula;
import com.utn.modelo.Reserva;
import com.utn.modelo.Usuario;

//Control + shift + O  = imports 

public class ReservaControlador {

	//Forma de declarar una lista
	ArrayList<Reserva> listaReservas; //posicion estatica no inicializada
	private Date fecha;
	private String fechaInicio;
	private String fechaDevolucion;
	//Toda inicializacion va dentro del constructor
	public ReservaControlador() {
		//arrayList<E> por la clase que quiero manejar en la lista
		this.listaReservas= new ArrayList<Reserva>();
		this.fecha= new Date();
	}
	public Reserva reservaPelicula(Pelicula pelicula, Usuario usuario){
		Reserva r = new Reserva(pelicula,usuario);
		this.fechaInicio = fecha.getDate() + "/" +fecha.getMonth() + "/" + fecha.getYear();
		
		listaReservas.add(r);
		return r;
	}
	
	
	
	public void reporteReserva(){
		//for each ... for de objetos 
		/*
		 * Iterar todos los elementos de un vector... generando una copia para trabajar..
		 * 
		 */
				
		for (Reserva reserva : listaReservas) {
			
			System.out.println("Usuario " + reserva.getUsuario().getNombre() + " Alquilo la pelicula " +   reserva.getPelicula().getTitulo() + " El genero es " +  reserva.getPelicula().getGenero());
		}
		
	}
	
	
}
