package com.cleiton.cursojava.aula30This;

public class Carro {

	public String marca, modelo;
	public int numPassageiros; // Quantidade de Passsageiros
	public double capCombustivel, consumoCombustivel;
	// Capacidade de Litros no tanque de combustivel / consumo em Km
	
	
	//This = Usada para fazer refer�ncias de met�dos e atributos da pr�pia classe

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {}
	
	//Chama o construtor de 3 parametros
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 par�metros");
	}
	
	//Chama o construtor de 2 parametros
	public Carro(String marca, String modelo) {	
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 par�metros");
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " km");
	}

	double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado.");

		return this.capCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / this.consumoCombustivel;

		return qtdCombustivel;
	}

}
