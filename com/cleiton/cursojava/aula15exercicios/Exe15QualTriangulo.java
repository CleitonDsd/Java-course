package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe15QualTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("TRI�NGULOS");
		System.out.println("Insira o Primeiro lado: ");
		double lado1 = scan.nextDouble();
		System.out.println("Insira o Segundo lado: ");
		double lado2 = scan.nextDouble();
		System.out.println("Insira o Terceiro lado: ");
		double lado3 = scan.nextDouble();
	
		//Tr�s Lados iguais Triangulo Equilatero
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("�rea: Tr�s lados iguais");
			System.out.println("Tipo: Tri�ngulo Equilatero");
		}
		//Tr�s lados diferentes Triangulo Escaleno
		
		else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
			System.out.println("�rea: Tr�s lados diferentes");
			System.out.println("Tipo: Tri�ngulo Escaleno");
		}
		//Tr�s lados diferentes Triangulo Escaleno
		
		else if (lado1 == lado2 && lado2 != lado3) {
			System.out.println("�rea: Dois lados iguais");
			System.out.println("Tipo: Tri�ngulo Is�sceles");
		}
		else if (lado2 == lado3 && lado3 != lado1) {
			System.out.println("�rea: Dois lados iguais");
			System.out.println("Tipo: Tri�ngulo Is�sceles");
		}
		else if (lado3 == lado1 && lado1 != lado2) {
			System.out.println("�rea: Dois lados iguais");
			System.out.println("Tipo: Tri�ngulo Is�sceles");
		}
	}

}
