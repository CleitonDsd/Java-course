package com.cleiton.cursojava.aula19ArraysVetores;

public class ArraysTempMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] temperaturas = new double [365];
		
		temperaturas [0] = 31.5;
		temperaturas [1] = 32; 
		temperaturas [2] = 33.7; 
		temperaturas [3] = 34; 
		temperaturas [4] = 33.1; 
		
		//System.out.println("Valor da temperatura do primeiro dia é de " + temperaturas[0] + "°");
		
		for (int i = 0; i < temperaturas.length; i ++) {
			System.out.println("Valor da temperatura do " + (i+1) + "° dia é " + temperaturas[i] + "°");
		}
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
	}

}
