package com.citibank.aula3.condicao;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome:");
		String nome = sc.next();

		switch (nome) {

		case "Huelton":
			System.out.println("Ok o seu nome � Huelton");
			break;
		case "Joao":
			System.out.println("Ok o seu nome � Jo�o");
			break;			
		default :
		    System.out.println("O seu nome n�o � Huelton ou Jo�o");
		    break;
		}

	}

}
