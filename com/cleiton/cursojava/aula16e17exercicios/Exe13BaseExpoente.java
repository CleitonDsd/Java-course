package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe13BaseExpoente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		int base, expoente;
		
		System.out.print("Digite a base: ");
		base = scan.nextInt();
		System.out.print("Digite o expoente : ");
		expoente = scan.nextInt();
		
		double resultado = (base ^ expoente);
		
		for (int i = 0; i < 1; i++) {
			System.out.println(base + " elevado á " + expoente + " equivale á: " + resultado);
		}
	}

}
