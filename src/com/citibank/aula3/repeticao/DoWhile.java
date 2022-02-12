package com.citibank.aula3.repeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero Correto!");
		int numero = sc.nextInt();
		int numeroParaSair = 5;

		// do-while - controle de repetição, valiação é feito no final
		do {

			if (numero == numeroParaSair) {
				break;
			}

			System.out.println("Que pena não é o numero esperado!!");
			System.out.println("Continue adivinhando o numero:");
			numero = sc.nextInt();

		} while (numero != numeroParaSair);

		System.out.println();
		System.out.println("Parabéns você adivinhou o número!");

	}

}
