package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe26ImprimirCalculoFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int fatorial =1, valor;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero para calcular seu fatorial: ");
		valor = scan.nextInt();
		
		for (int i = 2; i <= valor; i++) {
			fatorial *= i;	
		
			System.out.print(valor + "!= " + ( - i) + " * ");
		}
		
		
		System.out.println("Fatorial de " + valor + " equivale � " + fatorial);				

	}

}
