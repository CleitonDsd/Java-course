package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe03SexoFemininoOuMasculino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Insira seu sexo (M - F):");
		char sexo;
		sexo = scan.next().charAt(0);
		
		if (sexo == 'M' || sexo == 'm') {
			System.out.println("Sexo Masculino");
		}
		else if (sexo == 'F' || sexo == 'f') {
			System.out.println("Sexo Feminino");
		}
		else {
			System.out.println("Sexo Inválido");
		}

	}

}
