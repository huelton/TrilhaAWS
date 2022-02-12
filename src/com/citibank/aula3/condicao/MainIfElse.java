package com.citibank.aula3.condicao;

import java.util.Scanner;

public class MainIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você não é maior de idade");
		}

	}

}
