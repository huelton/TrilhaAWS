package com.citibank.aula3.repeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero Correto!");
		int numero = sc.nextInt();
		int numeroParaSair = 5;
		
		
		// while - controle de repetição e validação no começo		
		while(numero != numeroParaSair) {
			System.out.println("Que pena não é o numero esperado!!");
			System.out.println();
			System.out.println("Digite o numero Correto!");
			numero = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Parabéns você adivinhou o número!");		

	}

}
