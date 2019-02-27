package com.cleiton.cursojava.aula29Construtores;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro van = new Carro();

		System.out.println("=====================================");
		System.out.println("");

		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.numPassageiros);

		Carro van2 = new Carro("Fiat", "Ducato", 8, 100, 0.2 );

		System.out.println("");
		System.out.println("=====================================");
		System.out.println("");

		System.out.println(
				"marca: " + van2.marca + "\nmodelo: " + van2.modelo + "\nQtd Passageiros: " + van2.numPassageiros
						+ "\nCapacidade Total: " + van2.capCombustivel + "\nConsumo KM/L: " + van2.consumoCombustivel);

	}

}
