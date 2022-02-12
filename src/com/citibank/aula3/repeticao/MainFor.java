package com.citibank.aula3.repeticao;

import java.util.Scanner;

public class MainFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade:");
		int numero = sc.nextInt();
		
		// 0 1 2 3 4 5 

		// FOR
		                           // incrementado
		for(int i = 0; i < numero; i = i + 1) {
			System.out.println("Loop "+ i +" do processo");
			numero = numero + 2;
		}

	}

}
