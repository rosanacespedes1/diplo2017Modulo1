package com.utn.console;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

//		System.out.println(saludo());
//		
//		//para escribir por la consola
//		//paso 1
//		Scanner input = new Scanner(System.in); // SOLO MANEJAR STRING
//		
//		System.out.println("Escriba el nombre de la persona");
//		String nombre = input.nextLine(); 
//		
//		//paso 2 poner input.nextLine(); para poder escribir por la consola
//		
//		System.out.println(saludarUsuario(nombre));
//		System.out.println("El resultado es " + sumaDosNumeros(2, 6));
//
//		int res = sumaDosNumeros(2, sumaDosNumeros(sumaDosNumeros(4, 5), 1));
//		System.out.println(res);
//
//		if (fumador(false)) {
//			System.out.println("La persona fuma segudo");
//		} else {
//			System.out.println("la persona no fuma");
//		}
//		
//		System.out.println(datosPersonas(11, "Cacho", true, 1.39));
//		
		
		muestroConsola(datosPersonas(40, "Jaimito", true, 4.0), sumaDosNumeros(2, 2), fumador(false));
		System.out.println(calculoIMC(1.70, 89));
		
		double res = calculoIMC(1, 100.0);
		
		
		
		
		if(res < 18){
			System.out.println("flaquito");
		}else if(res >=18 && res <= 25){
			System.out.println("peso ideal");
		}else{
			System.out.println("estas para el cajon");
		}
	}

	// metodo en el cual retorna(devuelve) un String
	public static String saludo() {
		return "hola mundo";
	}

	public static String saludarUsuario(String usuario) {
		return "hola " + usuario;
	}

	public static int sumaDosNumeros(int num1, int num2) {
		return num1 + num2;
	}

	public static boolean fumador(boolean fumadorActivo) {
		return fumadorActivo;
	}

	public static String datosPersonas(int edad, String nombre, boolean fumador, double altura) {
		String fuma;
		if (fumador) {
			fuma = "es fumador";
		} else {
			fuma = "no es fumador";
		}

//		return "nombre" + nombre + " edad " + edad + "fumador " + fuma + " altura " + altura;

//		return "";
		return null;
	}
	
	
	public static void muestroConsola(String datosPersonales, 
										int sumoNumeros, 
										boolean fumador){
		
		System.out.println(datosPersonales + ", " + sumoNumeros +", " + fumador);
	}
	
	//formula peso / (altura*altura)
                                          //dante     //panella
	public static double calculoIMC(double altura, double peso){
		return peso / (altura*altura);
	}
	
}
