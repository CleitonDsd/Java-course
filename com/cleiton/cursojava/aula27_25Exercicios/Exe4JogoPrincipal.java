package com.cleiton.cursojava.aula27_25Exercicios;

import java.util.Scanner;

public class Exe4JogoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		Exe4JogoDaVelha jogo = new Exe4JogoDaVelha();

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;

		while (!ganhou) {

			if (jogo.jogadaPlayer1()) { // jogador 1

				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			} else {

				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'O';
			}

			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);

			if (!jogo.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posi��o j� usada, tente novamente");
			}

			jogo.imprimirTabuleiro();

			if (jogo.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 1 ganhou!");
			} else if (jogo.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 2 ganhou!");
			} else if (jogo.jogada > 9) {
				ganhou = true;
				System.out.println("Ningu�m ganhou essa partida.");
			}
		}
	}

	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inv�lida, tente novamente");
			}
		}
		valor--;
		return valor;
	}

}
