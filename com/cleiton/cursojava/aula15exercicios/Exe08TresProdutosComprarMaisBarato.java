package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe08TresProdutosComprarMaisBarato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o valor do Primeiro produto: ");
		double primeiroProduto = scan.nextDouble();
		System.out.print("Digite o valor do Segundo produto: ");
		double segundoProduto = scan.nextDouble();
		System.out.print("Digite o valor do Terceiro produto: ");
		double terceiroProduto = scan.nextDouble();
		
		if (primeiroProduto > segundoProduto && segundoProduto > terceiroProduto) {
			System.out.println("Você deve comprar o Terceiro produto pois é o mais barato");
		}
		else if (terceiroProduto > primeiroProduto && primeiroProduto > segundoProduto) {
			System.out.println("Você deve comprar o Segundo produto pois é o mais barato");
		}
		else if (terceiroProduto > segundoProduto && segundoProduto > primeiroProduto) {
			System.out.println("Você deve comprar o Primeiro produto pois é o mais barato");
		}
	}

}
