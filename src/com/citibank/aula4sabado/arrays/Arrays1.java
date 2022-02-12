package com.citibank.aula4sabado.arrays;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] idade = new int[8];  //23  0 0 0 0 0 0		

		for(int i = 0; i < idade.length; i++) {
			System.out.println("Insira o valor no indice - "+ i +" do array: ");
			idade[i] = sc.nextInt();
		}
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println("valor do array posicao - "+ (i+1) +" = "+ idade[i]);
		}

	}

}
