package com.utn.vista;

import com.utn.controlador.PeliculaControlador;
import com.utn.controlador.ReservaControlador;
import com.utn.controlador.UsuarioControlador;
import com.utn.modelo.enumerable.Generos;

public class Test {

	public static void main(String[] args) {

		//inicializaciones de los controladores
		//reseva , pelicula, Usuario
		UsuarioControlador uc = new UsuarioControlador();
		PeliculaControlador pc = new PeliculaControlador();
		ReservaControlador rc = new ReservaControlador();
		
		
		rc.reservaPelicula(pc.creoPelicula(Generos.TERROR, "The Ring 2", 60), uc.creoUsuario("Lucas", 1234567));
		rc.reservaPelicula(pc.creoPelicula(Generos.ACCION, "Terminator 1", 90), uc.creoUsuario("Chino Maidana", 12345));
		rc.reservaPelicula(pc.creoPelicula(Generos.ROMANTICO, "Tienes un email", 45), uc.creoUsuario("Lupe y Anahit", 1234123));
		
		System.out.println("===========MUESTRO EL LISTADO DE LAS RESERVAS ===============");
		rc.reporteReserva();
		
		System.out.println("==================================");
		System.out.println("===========MUESTRO EL LISTADO DE LAS PELIS ALQUILADAS ===============");
		pc.muestroListadoPeliculasAlquiladas();
		
		System.out.println("==================================");
		System.out.println("======BORRO PELICULA POS 0 ===========================");
		
		pc.borroPelicula(0);
		pc.muestroListadoPeliculasAlquiladas();
		System.out.println("==================================");
		
		System.out.println("===========MODIFICO PELICULA POS 1 =======================");
		
		pc.modificoPelicula(1, pc.creoPelicula(Generos.FICCION, "The lord of the ring"));
		pc.muestroListadoPeliculasAlquiladas();
		
		
		
	}

}
