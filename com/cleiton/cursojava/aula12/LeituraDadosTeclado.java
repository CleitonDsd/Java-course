package com.cleiton.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade filhos, altura, e se tem um Pet: ");
		String primeiroNome2 = scan.next();
		int idade2 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura2 = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome2);
		System.out.println("Idade: " + idade2);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura2);
		System.out.println("Tem algum animal de estimação? " + temPet);
		
		
	}

}

