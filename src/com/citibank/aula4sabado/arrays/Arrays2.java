package com.citibank.aula4sabado.arrays;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String[] SobreNome = new String[8];  //23  0 0 0 0 0 0	

        System.out.println("Digite o seu nome:");
        String nome = sc.next();
        System.out.println("Digite a quantidade de sobreNomes:");
        int quantidade = sc.nextInt();
        String sobrenome1 = "Huelton batista silva souza";
       
        String[] sobreNome = new String[quantidade];
        
		for(int i = 0; i < sobreNome.length; i++) {
			System.out.println("Insira o valor no indice - "+ i +" do Sobre nome: ");
			sobreNome[i] = sc.next();
		}

        System.out.printf(nome);
    	for(int i = 0; i < sobreNome.length; i++) {
			System.out.printf(" "+ sobreNome[i]);
		}


	}

}
