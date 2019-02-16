package com.cleiton.cursojava.aula27OOMetodosParametros;

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
		double autonomia = fusca.obterAutonomia();
		System.out.println("A autonomia do carro é " + autonomia + " por Km");
		
		System.out.println("");
		double qtdCombustivel10 = fusca.calcularCombustivel(10);
		double qtdCombustivel15 = fusca.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
		
		System.out.println("=====================================");
		System.out.println("");

	}

}
