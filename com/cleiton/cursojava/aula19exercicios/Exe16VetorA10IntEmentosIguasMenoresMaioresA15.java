package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe16VetorA10IntEmentosIguasMenoresMaioresA15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		
		for (int i = 0 ; i < vetorA.length; i++) {
			
			System.out.print(i + "° posição do vetor, valor: ");
			vetorA[i] = scan.nextInt();	
		}
		int somaMenor15 =0, igual15 = 0, maior15 = 0, qtdMaior15 = 0;
		
		for (int i = 0 ; i < vetorA.length; i++) {
			if (vetorA[i] == 15 ) {
				igual15 ++;
			}else if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
				
			}else {
				qtdMaior15++;
				maior15+= vetorA[i];
			}
				
		}
		System.out.println("Quantidade de números igual a 15: " + igual15 );
		System.out.println("Soma dos números menores que 15: " + somaMenor15 );
		System.out.println("Média dos Maiores dos números maiores que  15: " + (maior15/qtdMaior15) );//Média dos maiores que 15
	}

}
