package com.utn.console;

public class Persona {

	//visibilidad 
	public String nombre;
	public String apellido;
	public int edad;

	
	public void caminar(double distancia){
		System.out.println("hoy camine " + distancia + " km");
	}
	
	public boolean dormir(boolean estaDurmiendo){
		return estaDurmiendo;
	}
	
	public void comer(String[] alimentos){
		System.out.println("Hoy comi ....");
		for (int i = 0; i < alimentos.length; i++) {
			System.out.println(alimentos[i]);
		}
	}
	
}
