package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio03SomaDoisNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);

		System.out.print("Digite o primeiro valor: ");
		byte PrimeiroValor = scan.nextByte();
		System.out.print("Digite o segundo valor: ");
		byte SegundoValor = scan.nextByte();
		
		byte soma;
	    soma = (byte) (PrimeiroValor + SegundoValor);
	    		
	    System.out.println("A soma entre os dois valores é: " + soma);
		
		

	}

}
