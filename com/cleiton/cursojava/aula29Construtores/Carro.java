package com.cleiton.cursojava.aula29Construtores;

public class Carro {

	public String marca, modelo;
	public int numPassageiros; // Quantidade de Passsageiros
	public double capCombustivel, consumoCombustivel;
	// Capacidade de Litros no tanque de combustivel / consumo em Km

	Carro() {
		System.out.println("Classe carro Instanciada");		
	}

	Carro(String marca_, String modelo_, int numPassageiros_, int capCombustivel_,
			double consumoCombustivel_) {
		
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
		
	}

	// void = vazio, não retorna nada;
	public void exibirAutonomia() {

		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + "L por Km");

	}

	// double pois iremos multiplicar Capacidade de Litros, por consumo em Km
	public double obterAutonomia() {

		System.out.println("Método de obterAutonomia");

		return capCombustivel * consumoCombustivel;
	}// Return = vai retornar a multiplicação acima;

	public double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;
		// Quantidade de Combustivel

		return qtdCombustivel;
	}
}
