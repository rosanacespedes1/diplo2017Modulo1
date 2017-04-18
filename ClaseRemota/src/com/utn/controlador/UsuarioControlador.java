package com.utn.controlador;

import com.utn.modelo.Usuario;

public class UsuarioControlador {

	public Usuario creoUsuario(String nombre, int telefono){
		return new Usuario(nombre, telefono);
	}
	
}
