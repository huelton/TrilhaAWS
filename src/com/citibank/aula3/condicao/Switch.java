package com.citibank.aula3.condicao;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome:");
		String nome = sc.next();

		switch (nome) {

		case "Huelton":
			System.out.println("Ok o seu nome é Huelton");
			break;
		case "Joao":
			System.out.println("Ok o seu nome é João");
			break;			
		default :
		    System.out.println("O seu nome não é Huelton ou João");
		    break;
		}

	}

}
