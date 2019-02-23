package com.cleiton.cursojava.aula27_25Exercicios;

import java.util.Scanner;

public class Exe4JogoDaVelha {

	Scanner scan = new Scanner(System.in);

	char[][] jogoVelha = new char[3][3];
	int jogada = 1;

// Valida �s jogadas
	boolean validarJogada(int linha, int coluna, char sinal) {

		if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
			return false;

		} else { // jogada v�lida
			jogoVelha[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}

//Imprimi o Tabuleiro
	void imprimirTabuleiro() {
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				System.out.print(jogoVelha[i][j] + " | ");
			}
			System.out.println();
		}
	}

// Verifica Ganhador
	boolean verificarGanhador(char sinal) {
		if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || // linha 1
				(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || // linha 2
				(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || // linha 3
				(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || // coluna 1
				(jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || // coluna 2
				(jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || // coluna 3
				(jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || // diagonal
				(jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) { // diagonal
																										// inversa
			return true;
		}
		return false;
	}
//Vez do jogador 1
	boolean jogadaPlayer1() {
		if (jogada % 2 == 1) {
			return true;
		}
		return false;
	}
}
