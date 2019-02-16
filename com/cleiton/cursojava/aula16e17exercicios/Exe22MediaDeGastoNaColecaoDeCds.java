package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe22MediaDeGastoNaColecaoDeCds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int cd = 0;		
			
		float soma = 0,
			  preco = 0f,
		      media = 0f;
		
		System.out.print("Insira a quantidade de Cd's: ");
		cd = scan.nextInt();
		
		for (int i = 1; i <= cd; i ++) {
			System.out.println(i + "° CD, preço : ");
			preco = scan.nextFloat();
			
			soma+= preco;
			media += ((soma/cd)/i);			
		}
		System.out.println("");
		System.out.println("Gasto Total (R$): " + soma);
		System.out.printf("Média de preço para cada CD (R$): %.2f" , media);
		
	}

}
