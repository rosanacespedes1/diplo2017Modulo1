package com.utn.console;

public class Auto {

	public String marca;
	public String modelo;
	public String color;
	public int ano;
	
	public void encender(){
		System.out.println("Estoy encendido");
	}
	
	public void velMaxima(){ // mejorar
		if(marca=="ferrari" || marca=="bmw"){
			if(ano>=2010){
				System.out.println("Va a 230Km");
			}else{
				System.out.println("va a 180km");
			}
		}else{
			System.out.println("va de max a 180km");
		}
	}
	
	public boolean apagar(double vel){ //
		if(vel <=0){
			return true;
		}else{
			return false;
		}
	}
	
	

}
