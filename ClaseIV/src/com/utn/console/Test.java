package com.utn.console;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test {

	public static void main(String[] args) {
		
		
		
		//inicializar un vector con longitud fija

//		//Ciclo for , cicla de manera finita algo...
//		int i =60;
//		System.out.println(i);
//		//  variable =0 ; condicion de ciclado ; incrementacion decrementacion
//		for(i=0; i <10; i++)
//		{
//			System.out.println("Hola, itercaion: " + i);
//		}
//		System.out.println(i);
		
		
		//vectores
//		System.out.println("========TRABAJO Vectores Simples=============");
//		
//		String[] nombres ={"Pablo","Nicolas","Guille","Guada-Anahi-Clauida-Natalia","Lucas","Carlos"};
//
//		int indice =0;
//		int longitud= nombres.length; //devuelve la longitud del vector
//
//		System.out.println("longitud total: " + longitud);
//		
//		if(indice < longitud){
//			System.out.println(nombres[indice]);
//		}else{
//			System.out.println("El indice no existe");
//		}
//		
//		System.out.println("========TRABAJO CON EL FOR=============");
//                            //450
//		for (int i = 0; i < nombres.length; i++) {
//		
//			if(nombres[i]=="Guada-Anahi-Clauida-Natalia"){
//				System.out.println("Es mujer y se llama : " + nombres[i]);
//			}else{
//				System.out.println("Es hombre y se llama : " + nombres[i]);
//			}
//		
//		}
//
//		System.out.println("============VECTOR NUMERICO==============");
//		int[] numerosPares={2,4,6,8,10};
//		
//		for (int i = 0; i < numerosPares.length; i++) {
//			System.out.println(numerosPares[i]);
//		}
//		System.out.println("==========VECTOR DE OBJETOS================");
//		
//		Object[] arregloMistico={"Juanito",22,100.0,"fuma",true};
//		
//		for (int i = 0; i < arregloMistico.length; i++) {
//			System.out.println(arregloMistico[i]);
//		}
//		
//		System.out.println("==========TRABAJAMOS CON EL WHILE o MIENTRAS================");
//		
//		//while o mientras
//		//mientras la condicion se cumpla va a iterar...
//		int j = 0;
//		int t = 10;
//	
//		while(j < 10){ //mientras se verdadero se ejecuta
//			
//			System.out.println("El valor de j es: " + j);
//			
//			j = j +8;
//		}
//		
//		int  comando =0;
//		Scanner input = new Scanner(System.in);
//		while(comando !=-1){ //true
//			System.out.println("escriba -1 para finalizar, 1 para ver reporte , 2 para imprimr en rojo");
//			comando = Integer.parseInt( input.nextLine());
//			
//			System.out.println("usted selecciono : "+ comando);
//			
//			switch(comando){
//			case 1:
//				System.out.println("Imprimo en la impresora de recursos humanos");
//				break;
//			case 2:
//				System.err.println("Estoy escribiendo en rojo");
//				break;
//				
//			}
//			
//		}
//		
//		System.out.println("Fin del WHILE");
//		
//		System.out.println("===========TRABAJO CON EL DO WHILE================");
//		/*do while .... 
//			hacer mientras...  
//			premisa: al menos 1 vez se ejecuta y luego compara
//			si o si una iteracion y luevo a hacer la comparativa o validacion
//			del while
//		
//		*/
//		int u=10;
//		int m = 10;
//		do{
//			System.out.println("muestro la variable u con el valor: " + u);
//			u++;
//			
//			
//		}while(u < m); // false
//		
//		System.out.println("FIN DEL DO WHILE");
//		
		
		System.out.println("================TRABAJO CON EL METODO STRING[]==================");
		

		System.out.println("================OPCION 1============");
		String[] op1=  opcionVectorNombres1("Christopher", "Anahi", "Pablo", "Alex", "Ariel");
		
		System.out.println("imprimo la opcion 1");
		for (int i = 0; i < op1.length; i++) {
			System.out.println(op1[i]);
		}
	
		System.out.println("================OPCION 2============");
		String[] nombres = {"Matias","Claudia","Natalia","Lucas","Carlos"};
		String[] op2 = opcionVectorNombres2(nombres);
		
		for (int i = 0; i < op2.length; i++) {
			System.out.println(op2[i]);
		}
		
		System.out.println("================OPCION 3============");
		String[] op3 = opcionVectorNombres3();
		
		for (int i = 0; i < op3.length; i++) {
			System.out.println(op3[i]);
		}
	}
	
	
	/*
	 * hacer un metodo en el cual le pase un nombre y me devuelva 
	 * un vector o array de String
	 * se puede utilizar hasta 5 parametros
       1 solo pram hacer magia para que cargue lo solicitado
       o ningun parametro
	 * 
	 * public static String[] ble(String pram1,String param2... ){
	 * return "hola";
	 */
	
	
	
		public static String[] opcionVectorNombres1(String param1, String param2, String param3, String param4, String param5){
			String[] vec = new String[5];
			vec[0]=param1;
			vec[1]=param2;
			vec[2]=param3;
			vec[3]=param4;
			vec[4]=param5;
			return vec;
		}
	
		public static String[] opcionVectorNombres2(String[] params){
			String[] vec = new String[5]; //inicializacion del vector
			
			if(params.length <= vec.length){
				for (int i = 0; i < vec.length; i++) {
					vec[i] = params[i];
				}
			}else{
				System.err.println("La longitud no puede ser mayor a 5");
			}
			
			return vec;
		}
		
		public static String[] opcionVectorNombres3(){
			String[] vec = new String[5];
			Scanner input = new Scanner(System.in);
			for (int i = 0; i < vec.length; i++) {
				System.out.println("por favor ingrese el nombre");
				String nombre = input.nextLine();
				vec[i] = nombre;
			}
			return vec;
		}
}
