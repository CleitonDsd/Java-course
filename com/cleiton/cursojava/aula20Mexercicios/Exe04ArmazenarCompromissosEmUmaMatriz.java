package com.cleiton.cursojava.aula20Mexercicios;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Scanner;

public class Exe04ArmazenarCompromissosEmUmaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa para armazenar em uma matriz os compromissos de uma agenda
		 * pessoal. Cada dia do mes deve ter 24hrs, onde para cada uma dessas 24hrs
		 * podemos adicionar uma tarefa especifica (compromisso agendado). O programa
		 * deve conter um menu onde o usuario indica o dia do mes que deseja alterar e a
		 * hora , entrando em seguida com o compromisso, ou então, o usuario pode tambem
		 * consultar a agenda, fornecendo o dia e a hora para obter o compromisso
		 * armazenado.
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false;

		byte opcao;
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");

			opcao = scan.nextByte();

			if (opcao == 1) {// Adicionar compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Digite o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
						dia = scan.nextInt();
					}
				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Digite a hora do compromisso: ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						diaValido = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
						hora = scan.nextInt();
					}
				}
				dia--;
				System.out.println("Digite um compromisso: ");
				compromissos[dia][hora] = scan.next();

			} else if (opcao == 2) {

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Digite o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
						dia = scan.nextInt();
					}
				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Digite a hora do compromisso: ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						diaValido = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
						hora = scan.nextInt();
					}
				}
				dia--;
				System.out.println("Compromisso agendado: ");
				System.out.println(compromissos [dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("opção inválida digite novamente: ");
				opcao = scan.nextByte();
			}
		}

	}

}
