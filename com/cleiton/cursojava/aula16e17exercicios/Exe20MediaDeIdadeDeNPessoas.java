package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe20MediaDeIdadeDeNPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int participantes,
		idade = 0,
		soma  = 0,
		media = 0;
		
		System.out.println("Digite quantas pessoas vão participar:");
		participantes = scan.nextInt();
		
		for (int i = 1; i <= participantes ; i ++) {
			
			System.out.println(i + "° pessoa, Digite sua idade: ");
			idade = scan.nextInt();						
			
			if (idade <= 0 || idade >= 110) {
				System.out.println("Idade inválida, digite novamente: ");
				idade = scan.nextInt();			
			}
			soma += idade;
			media += ((soma/participantes)/i);
		}		
		if (media >= 0 ||  media <= 26) {
			System.out.println("Turma Jovem");
		}
		else if (media > 26 ||  media <= 60) {
			System.out.println("Turma Adulta");
		}
		else if (media > 60){
			System.out.println("Turma Idosa");
		}
		System.out.println("Média de idade da turma: " + media + " anos");
	}

}
