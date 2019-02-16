package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe27MediaDeTemperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double temp = 0, soma = 0, media = 0;
		int dia = 0;		
		
		System.out.println("Digite quantos dias deseja inserir as temperaturas:");
		dia = scan.nextInt();
			
		for (int i = 1;  i <= dia ; i++) {
			System.out.print(i + "° Temperatura: ");
			temp = scan.nextDouble();
			if(temp >= 55) {
				System.out.println("Temperatura inválida no Brasil, digite novamente: ");
				temp = scan.nextInt();
			}
			
			soma+=temp;
			media = ((soma)/dia);
			
		}
		System.out.printf("Média das Temperaturas é de: G° %.2f" , media);
	}

}
