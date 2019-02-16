package com.cleiton.cursojava.aula25OOMetodosSimples;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		
		System.out.println("");
		fusca.exibirAutonomia();

		System.out.println("");
		System.out.println("=====================================");
		System.out.println("");
	}

}
