package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio06RaioAreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o RAIO do circulo:");
		float raio = scan.nextFloat();
		raio = raio*raio;
		float Pi = 3.141592f;
		float area = Pi*raio;
		System.out.printf("Á area do circulo equivale á %.2f ", area , " Cm²");
		

	}

}
