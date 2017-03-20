package com.utn.console;

import javax.management.openmbean.OpenMBeanConstructorInfo;

public class Test {
	
	public static void main(String[] args) {
		//invocamos a los metodos que hemos declarado por fuera del metodo main
	
		
		bienvenida(); //llamando al metodo o invocando al metodo
		
		//invoco al metodo saludo usuario y le paso un valor 
		
		String user="dante";
		
		saludoUsuario(user); //en String user guardarmos el valor "dante"
		
		opcionAElegir("imprimir");
		
		
		calculoIMC("Dante", "panella", 90.0, 1.94, 34);
		
		despedida();  //llamando al metodo o invocando al metodo
	}
		
	//crearemos un metodo de tipo procedimiento
	/*
	 * dara la bienvenida al sistema
	 * bienvenida
	 * no contiene firma
	 */
	
	public static void bienvenida(){ //inicio del ambito / scope
		System.out.println("Bienvenidos a la aplicacion!! :) ");
		
	}//fin del ambito / scope
	
	
	/*
	 * creo un metodo de tipo procedimiento  que despida al usuario
	 */
	public static void despedida(){ //inicio del ambito / scope
		
		System.out.println("Gracias por utilizar la aplicacion!! :) ");
		
	}//fin del ambito / scope
	

	//creamos un metodo en el cual le damos la bienvenida al usuario
	public static void saludoUsuario(final String user){

		System.out.println("El valor antes de cambiar es " + user);
		//user = "Cristian";
		System.out.println("Bienvenido " + user);
	
	}
	
	//creen un metodo de tipo procedimiento 
	//en el cual se ingresen 2 paramentros y se muestre 
	//el valor por la consola
	
	public static void opcionAElegir(String opciones){

		switch(opciones){
		case "imprimir":
			break;
			
			default:
				
				break;
		}
	}
	
	//calculo de indice de masa corporal de una persona
	public static void calculoIMC(String nombre, String apellido,
			double peso, double altura,int edad){
		
		//vamos a obtener el resultado del IMC
		
		double resultado = peso / (altura * altura);
		String resultadoIMC;
		
		if(resultado < 18){
			resultadoIMC= "Signos de desnutricion";
		}else if(resultado >= 18 && resultado < 24.9){
			resultadoIMC= "estas en peso ideal";
		}else if (resultado >= 25 && resultado < 26.9){
			resultadoIMC= "Afloja los postres";
		}else if(resultado >= 27&& resultado < 27.9){
			resultadoIMC= "Larga las harinas gordo!!!";
		}else{
			resultadoIMC= "estas para el cajon!";
		}
		
		System.out.println("Sr/a " + nombre + " " + apellido + " su diagnostico es: " + resultadoIMC);
		
		
	}
	
}
