package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe02ValorPositivoOuNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Insira um valor: ");
		int valor = scan.nextInt();
		
		if (valor <0) {
			System.out.println(" O valor inserido é negativo.");
		}
		if (valor >=0) {
			System.out.println(" O valor inserido é positivo.");
		}
	}

}
