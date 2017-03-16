package com.utn.console;

public class Test {

	// variables
	static String bienvenida = "Bienvenidos a nuestra aplicacion!!!";

	// escribir el nombre, apellido y edad
	// luego crear un metodo y mostrarlo por la consola
	static String nombre = "raymundo";
	static String apellido = "panella";
	static int edad = 14;
	static String despedida = "gracias por elegirnos!!!";

	// metodo que muestra los datos personales
	public static void muestroDatosPersonales() {

		// la concatenacion es la union de variables
		// uno objetos , se hace por medio de el simplo + entre variables
		System.out.println("Nombre: " + // string
				nombre + // variable
				", apellido: " + // string
				apellido + // variable
				", edad: " + // string
				edad // variable
		);

	}

	public static void main(String[] args) {

		/*
		 * para comparar string se hace con doble igual
		 * 
		 * if(nombre=="dante") {
		 * 
		 * verdadero }
		 */

		// Si es verdadero y es verdadero entonces es verdadero
		// si es verdadero o es verdadero
		if (!((edad >= 18 && nombre != "dante") || apellido == "gonzalez")) {
			// false O false

			// true and true = false or false = false ....

			// libreria que permite mostrar por la consola valores
			System.out.println(bienvenida);

			// muestro datos personales
			muestroDatosPersonales();

			// no estoy concatendando sino que estoy sumando
			System.out.println(2 + 2);

			// llamda a un metodo estaticos de la misma clase
			despedida();

		} else {
			System.out.println("Usted es menor a 18 y no puede ingresar al sistema");
		}

		// switch evelua casos

		switch (edad) { // caso a evaluar tener en cuenta el tipo

		case 13: // tipo a evaluar
			System.out.println("puede ver peliculas desde 13 años");
			break;

		case 18:
			System.out.println("puede ver peliculas desde 18 años");
			break;

		case 25:
			System.out.println("puede ver peliculas desde 25 años");
			break;

		case 14:

			System.out.println("puede ver power rangers!!!");
			break;

		default:
			System.out.println("Lo sentiemos no puede ver peliculas porque desconocemos la edad");
			break;
		}

		switch (nombre) {

		case "dante":
			System.out.println("soy " + nombre);
			break;

		case "nicolas":
			System.out.println("soy " + nombre);
			break;

		case "ariel":
			System.out.println("soy " + nombre);
			break;

		}
	}

	// metodo estatico que imprime unas plabras por la consola
	public static void despedida() {
		System.out.println(despedida);
	}

}
