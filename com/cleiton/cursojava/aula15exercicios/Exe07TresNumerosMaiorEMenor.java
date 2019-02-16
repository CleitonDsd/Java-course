package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe07TresNumerosMaiorEMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o Primeiro Valor: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		int valor2 = scan.nextInt();
		System.out.println("Digite o Terceiro Valor: ");
		int valor3 = scan.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
			System.out.println("O primeiro valor " + valor1 + " é o maior");
			System.out.println("O terceiro valor" + valor3 + " é o menor");
		}
		else if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1) {
			System.out.println("O segundo valor " + valor2 + " é o maior");
			System.out.println("O primeiro " + valor1 + " é o menor");
		}
		else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2 ) {
			System.out.println("O terceiro valor " + valor3 + " é o maior");
			System.out.println("O segundo valor " + valor2 + " é o menor");
		}
		
	}

}
