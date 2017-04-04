package com.utn.controlador;

import com.utn.modelo.Ingrediente;
import com.utn.modelo.Pizza;

public class Microondas {

	public Pizza[] vecPizzas;

	public void coccion() {
		// Solo puedo cocinar 5 pizzas
		vecPizzas = new Pizza[3];

		Pizza fPizza = new Pizza();

		vecPizzas[0] = fPizza.creoGrandeMuzza();
		vecPizzas[1] = fPizza.creoGrandeMuzza();
		vecPizzas[2] = fPizza.creoDobleQueso();

		int contPM = 0;
		int contPD = 0;
		int contTomate = 0;
		int contMuzzarella = 0;
		int contProvolone = 0;
		int contOregano = 0;
		for (int i = 0; i < vecPizzas.length; i++) {

			System.out.println("======= PIZZA N " + i + "=========");
			if (vecPizzas[i].nombre == "Grande de muzza") {
				contPM++;
				System.out.println("Nombre de la pizza= " + vecPizzas[i].nombre);
				for (int j = 0; j < vecPizzas[i].ingredientes.length; j++) {
					if (vecPizzas[i].ingredientes[j] != null) {
						System.out.println(vecPizzas[i].ingredientes[j].nombre);

						switch (vecPizzas[i].ingredientes[j].nombre) {

						case "muzzarella":
							contMuzzarella++;
							break;
						case "tomate":
							contTomate++;
							break;
						case "oregano":
							contOregano++;
							break;

						}
					}

				}

			} else if (vecPizzas[i].nombre == "Doble Queso") {
				contPD++;
				System.out.println("Nombre de la pizza= " + vecPizzas[i].nombre);
				for (int j = 0; j < vecPizzas[i].ingredientes.length; j++) {
					if (vecPizzas[i].ingredientes[j] != null) {
						System.out.println(vecPizzas[i].ingredientes[j].nombre);
						switch (vecPizzas[i].ingredientes[j].nombre) {

						case "muzzarella":
							contMuzzarella++;
							break;
						case "tomate":
							contTomate++;
							break;
						case "provolone":
							contProvolone++;
							break;

						}

					}
				}
			}


		}
		System.out.println("===============================");
		System.out.println("Cantidad de tomates en total: " + contTomate);
		System.out.println("Cantidad de Muzzarelas en total: " + contMuzzarella);
		System.out.println("Cantidad de Provolones en total: " + contProvolone);

	}
}
