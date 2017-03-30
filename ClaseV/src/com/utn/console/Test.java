package com.utn.console;

public class Test {
	
	public static void main(String[] args) {
		
		//Creo una instancia de la clase Persona
		Persona p1 = new Persona(); // despues explicaremos xq los ()
		
		//p1 es un nuevo objeto de la clase persona 
		//p1 es una nueva instancia de persona
		
		p1.nombre="Pablo";
		p1.apellido="Sanchezmann";
		p1.edad=44;
		String[] alimentos ={"Hamburgesa","papas"};
		
		System.out.println("===========PERSONA 1=================");
		System.out.println("El objeto p1.nombre="+ p1.nombre);
		System.out.println("El objeto p1.apellido="+ p1.apellido);
		System.out.println("El objeto p1.edad="+ p1.edad);
		p1.comer(alimentos);
		

		System.out.println("valor del objeto p1 = "+  p1);
		
		System.out.println("===========PERSONA 2=================");
		Persona p3 = new Persona();
		p3.nombre="Nicolas";
		p3.apellido="Gagliardi";
		p3.edad=30;
		
		String[] alimentosVeganos ={"fideo Veganos", "pan Vegano"};
		
		System.out.println("El objeto p3.nombre="+ p3.nombre);
		System.out.println("El objeto p3.apellido="+ p3.apellido);
		System.out.println("El objeto p3.edad="+ p3.edad);
		p3.comer(alimentosVeganos);
		System.out.println("valor del objeto p3 = "+  p3);
		

		System.out.println("================= AUTOS ===============");
		
		Auto auto1= new Auto();
		auto1.marca="bmw";
		auto1.modelo="X6";
		auto1.color="negro";
		auto1.ano=2017;
		
		
		//Clase variable = new Clase();
		
		Auto a2 = new Auto();
		a2.marca="Renault";
		a2.modelo="Fluence";
		a2.ano=2030;
		
		
		
		auto1.encender();
		
		auto1.velMaxima();
		
		if(auto1.apagar(0)){
			System.out.println("Auto apagado");
		}else{
			System.out.println("No se puede apagar porque esta en movimiento");
		}
		
		System.out.println("========MUESTRO LA DESCRIPCION=====");
		descripcionAuto(a2);
		descripcionAuto(auto1);
		
	}
	
	
	public static void descripcionAuto(Auto auto){
		System.out.println("marca: " + auto.marca + " modelo: "+ auto.modelo + " color: " + auto.color + " año: " + auto.ano);
		
	}
	
	
}





/*
 * Crear una clase Auto
 * Atributos : marca, modelo, color, año
 * Metodos: encnder boolean, 
 * VelMaxima: * velocidad > 2010 vel max 230 km (BMW o  Ferrari)  ferrari 
 * , sino la maxima es de 180
 *  
 *  Apagar: que verifique que el auto no esta en movimiento
 *  
 *  
 */









