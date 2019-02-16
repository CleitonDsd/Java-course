package com.cleiton.cursojava.aula20Mexercicios;

import java.util.Scanner;

public class Exe06JogoDaVelhaComMatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Faça um programa para jogar jogo da velha.
		 * 
		 * O programa deve permitir que dois jogadores façam uma partida de jogo da
		 * velha, usando o pc para ver o tabuleiro. Cada jogador vai informando
		 * alternadamente a posição onde deseja colocar a sua peça ("X" e "O"). O
		 * programa deve impedir jogadas inválidas e determinar automaticamente que o
		 * jogo terminou e quem foi o vencedor (jogador1 ou jogador2). A cada nova
		 * jogada, o programa deve atualizar a situação do tabuleiro na tela.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		char[][] jogoVelha = new char[3][3];

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhou = false;
		int jogadas = 1; // Vai contar em qual jogada o jogo está;
		char sinal;
		int linha = 0, coluna = 0;
		while (!ganhou) {
			if (jogadas % 2 == 1) { // jogador1
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3). ");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3). ");
				sinal = 'O';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Digite uma linha válida (1, 2 ou 3)");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inválida, digite novamente: ");
				}
			}
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Digite uma coluna válida (1, 2 ou 3)");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida, digite novamente: ");
				}
			}
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posição já utilizada, tente novamente");
			} else { // Jogada válida
				jogoVelha[linha][coluna] = sinal;
				jogadas++;
			}
			// Imprimir o tabuleiro
			
			//Usando FOR para imprimir resultados
			
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.println(jogoVelha[i][j] + " || ");
				}
				System.out.println("");
			}
			
			//Usando for Each para imprimir resultados
			
			
			for(char [] vetorJogoVelha : jogoVelha) {
				for( char jogo : vetorJogoVelha) {
					System.out.println(jogo + " || ");
				}
			}
			
			
			// verificar se tem ganhador
			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')// linha1
					|| (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') // linha2
					|| (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')// linha3
					|| (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')// colunas1
					|| (jogoVelha[0][1] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][1] == 'X') // colunas2
					|| (jogoVelha[0][2] == 'X' && jogoVelha[0][2] == 'X' && jogoVelha[0][2] == 'X')// colunas3
					|| (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') // Diagonais
					|| (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) { // DiagonaisInversas

				ganhou = true;
				System.out.println("Parabéns pela vitória jogador 1! ");
			} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')// linha1
					|| (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') // linha2
					|| (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')// linha3
					|| (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')// colunas1
					|| (jogoVelha[0][1] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][1] == 'O') // colunas2
					|| (jogoVelha[0][2] == 'O' && jogoVelha[0][2] == 'O' && jogoVelha[0][2] == 'O')// colunas3
					|| (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') // Diagonais
					|| (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')) { // DiagonaisInversas

				ganhou = true;
				System.out.println("Parabéns pela vitória jogador 2! ");

			} else if (jogadas > 9) {
				ganhou = true;

				System.out.println("DEU VELHA!!! Partida Empatada!!!");
			}
		}

	}
}
