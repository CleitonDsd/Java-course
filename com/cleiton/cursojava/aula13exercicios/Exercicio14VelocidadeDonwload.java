package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio14VelocidadeDonwload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o tamanho do arquivo para Donwload em MB :");
		float arquivoMb = scan.nextFloat(); //Variavel que recebe Arquivo em Mb;
		System.out.println("Digite a velocidade de sua internet em Mbps: ");
		float internetMbps = scan.nextFloat(); //Variavel que recebe velocidade da internet em Mbps;
		
		internetMbps = internetMbps/8;
		float tempoDonwload;
		tempoDonwload = (arquivoMb/internetMbps)/60;
		
		System.out.printf("Tempo estimado para donwload em Minutos: %.1f ", tempoDonwload);
		

	}

}
