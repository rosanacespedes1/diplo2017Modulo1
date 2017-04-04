package com.utn.vista;

import com.utn.controlador.Microondas;

public class Test {

	//estoy parado en la vista puedo 
	//invocar al controlador
	public static void main(String[] args) {

		//controlador tengo microondas
		Microondas m = new Microondas();
		m.coccion();
		
	}

}
