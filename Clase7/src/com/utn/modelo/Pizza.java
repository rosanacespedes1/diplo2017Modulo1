package com.utn.modelo;

public class Pizza {

	public Ingrediente[] ingredientes;
	public String nombre;
	public int tiempoCoccion;
	public double precio;
	
	public Pizza creoGrandeMuzza(){

		ingredientes = new Ingrediente[3];
		//formar 1 de inicializar una posicion de memoria 
		//dentro de un vector
		ingredientes[0]= new Ingrediente();
		ingredientes[0].nombre="tomate";
		ingredientes[0].cantidad=3;
		
		/*
		 * Vector 
		 * String[] nombres = new String[10];
		 * nombres[0] = "pepe";
		 * 
		 * Clase[] claseVector = new Clase[10];
		 * 
		 * claseVector[0] = new Clase(); 
		 * ingredientes[0]=null  //inicializamos la posicion
		 * ingredientes[0]= new Ingrediente(); //inicializado
		 * ingrediente.nombre="tomate";
		 * ]
		 * 
		 */
		
		
		//Segunda forma de inicializar 
		Ingrediente ingre1 = new Ingrediente();
		ingre1.nombre="muzzarella";
		ingre1.cantidad=5;
		ingredientes[1]=ingre1;

		Pizza pizza = new Pizza();
		pizza.ingredientes=ingredientes; //redundancia de datos
		pizza.nombre="Grande de muzza";
		pizza.tiempoCoccion=5;
		pizza.precio=120;
		return pizza;
		
	}
	
	public Pizza creoDobleQueso(){

		//Clases = new Clase ----> creamos una instancia de la clase
		
		ingredientes = new Ingrediente[4];
		ingredientes[0]=new Ingrediente();  //inicializo la posicion de memoria
		ingredientes[0].nombre="tomate";
		ingredientes[1]=new Ingrediente(); //inicializo la posicion de memoria
		ingredientes[1].nombre="muzzarella";
		ingredientes[2]=new Ingrediente(); //inicializo la posicion de memoria
		ingredientes[2].nombre="provolone";
		ingredientes[3]=new Ingrediente(); //inicializo la posicion de memoria
		ingredientes[3].nombre="jamon";
		Pizza pizza = new Pizza();
		pizza.ingredientes=ingredientes; //redundancia de datos
		pizza.nombre="Doble Queso";
		pizza.tiempoCoccion=10;
		pizza.precio=180;
		return pizza;
		
	}

	//va a romper arreglar
	public Pizza creoVegetariana(){

		ingredientes = new Ingrediente[4];
		ingredientes[0].nombre="tomate";
		ingredientes[1].nombre="aselga";
		ingredientes[2].nombre="salsa Blanca";
		ingredientes[3].nombre="queso Rayado";
		Pizza pizza = new Pizza();
		pizza.ingredientes=ingredientes; //redundancia de datos
		pizza.nombre="Pizza Vegetariana";
		pizza.tiempoCoccion=15;
		pizza.precio=150;
		return pizza;
	}
		
	
	
	
// String[] nombres = {"dante","pepe","rosita"};
	/*
	 * Ingredientes[] ingredientes= new Ingredientes[10];
	 * ingredientes[0].nombre
	 */
	
}
