package com.cleiton.cursojava.aula24OOClasses;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("=====================================");
		System.out.println("");
		
		Carro van = new Carro();

		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println("Marca: " + van.marca + "\nModelo: " + van.modelo + "\nNúmero de Passageiros: "
				+ van.numPassageiros + "\nTanque de combustivel (L): " + van.capCombustivel + "\nConsumo em Km: "
				+ van.consumoCombustivel);
 
		System.out.println("");
		System.out.println("=====================================");
		System.out.println("");
		
		Carro fusca = new Carro();

		fusca.marca = "Volkswagem";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;

		System.out.println("Marca: " + fusca.marca + "\nModelo: " + fusca.modelo + "\nNúmero de Passageiros: "
				+ fusca.numPassageiros + "\nTanque de combustivel (L): " + fusca.capCombustivel + "\nConsumo em Km: "
				+ fusca.consumoCombustivel);
	}

}
