package com.citibank.aula2;

import java.util.Scanner;

public class EntradaESaida {

	public static void main(String[] args) {		
		Scanner leitura = new Scanner(System.in);
		
		//String nome = leitura.next();
		//System.out.println("Digite o primeiro numero: ");
		//int num1 = leitura.nextInt();
		//System.out.println("Digite o segundo numero: ");
		//int num2 = leitura.nextInt();
		
		//System.out.println("Digite o valor do primeiro produto: ");
		//double preco1 = leitura.nextDouble();
		//System.out.println("Digite o valor do segundo produto: ");
		//double preco2 = leitura.nextDouble();
		
		//double valorTotal = preco1 + preco2;		
		
		//System.out.println("Seja bem vindo: "+ nome);
		//System.out.println("Soma dos dois numeros: "+ (num1 + num2));
		//System.out.printf("Soma Total da compra: %.2f \n",valorTotal);		
		
		final int MAIOR_DE_IDADE = 18;
		System.out.println("Entre com a sua idade:");
		int idade = leitura.nextInt();	
		System.out.println("Possui habitação:");
		String habilitado = leitura.next();
		
		//System.out.printf("Pode Dirigir carro? : ");
		//System.out.println((idade >= MAIOR_DE_IDADE) && (habilitado.equalsIgnoreCase("sim")));
		
		if(!(idade >= MAIOR_DE_IDADE) && (habilitado.equalsIgnoreCase("sim"))) {
			System.out.printf("Sim, vc pode Dirigir carro");
		}else {
			System.out.printf("Não, vc não pode Dirigir carro");
		}		
		
		
		
	}

}
