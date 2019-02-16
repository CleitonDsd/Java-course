package com.cleiton.cursojava.aula26OOMetodosReturn;

//Classes metodos com Parametros

public class Carro {

	String marca, modelo;
	byte numPassageiros; // Quantidade de Passsageiros
	double capCombustivel, consumoCombustivel;
	// Capacidade de Litros no tanque de combustivel / consumo em Km

	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " Km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Metodo obter autonomia: ");
		return capCombustivel * consumoCombustivel;
				
		
	}
}
