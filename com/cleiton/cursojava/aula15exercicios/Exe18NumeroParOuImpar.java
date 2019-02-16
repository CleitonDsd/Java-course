package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe18NumeroParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira um número: ");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println(numero + " é um numero Par.");
		}
		else {
			System.out.println(numero + " é um numero Impar.");
		}
				

	}

}
