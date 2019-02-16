package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio11NumeroInteiroRealExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.print("Insira um numero inteiro: ");
		short numeroInt = scan.nextShort(); //variavel que vai receber um numero inteiro
		System.out.print("Insira um numero real: ");
		float numeroReal = scan.nextFloat(); //variavel que vai receber um numero real
		
		System.out.println(" Produto do dobro do primeiro com metade do segundo ");
		numeroInt = (short) (numeroInt*2);
		numeroReal = numeroReal/2;
		
		float produto1; //Produto do dobro do primeiro com metade do segundo 
		produto1 = numeroInt * numeroReal;
		System.out.println("***** Equivale á " + produto1);
		
		System.out.println(" A soma do triplo do primeiro com o terceiro ");
		numeroInt = (short) (numeroInt*3);
		System.out.println("*****  Equivale á " + numeroInt+produto1);
		
		System.out.println("O terceiro elevado ao cubo ");
		float produto2;
		produto2 = (float) Math.pow(produto1, 3);
		System.out.printf ("***** Equivale á %.2f " ,produto2);
	}

}
