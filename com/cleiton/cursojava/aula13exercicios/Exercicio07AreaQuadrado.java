package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio07AreaQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o ladro do Quadrado:");
		float ladoQuad = scan.nextFloat(); //Lado do quadrado 
		float area;
		area = ladoQuad * ladoQuad; //Area do Quadrado vezes 2 para imprimir o dobro da area;
		float totalArea;
		totalArea = area*2;
		System.out.println("A Area do quadrado é " + ladoQuad + " Cm" + " e o dobro é " + totalArea + " Cm");
		

	}

}
