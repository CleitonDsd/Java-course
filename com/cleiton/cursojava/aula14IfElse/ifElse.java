package com.cleiton.cursojava.aula14IfElse;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		byte idade = scan.nextByte();
		
		if (idade>=18) {
			System.out.println("maior de idade");
		}
		else {
			System.out.println("menor de idade");
		}

		//<=10 Barato
		//10 < valor < 15 Pedir Desconto
		//15 <= valor 17 Pesquisar Mais
		//>= 17 Muito Caro
		
		System.out.print("Digite o preço do Produto: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println(" Produto barato, vale a compra.");
		}
		if (valor > 10 && valor <= 15){
			System.out.println(" Pedir desconto!");
		}
		if (valor >= 15 && valor <= 17) {
			System.out.println("Pesquisar mais. ");
		}
		if (valor > 17) {
			System.out.println("Preço muito caro.");
		}
			
		
	}

}
