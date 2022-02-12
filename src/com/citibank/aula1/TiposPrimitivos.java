package com.citibank.aula1;

/**
 * Esta classe demostra os tipos primitivos da linguagem
 * 
 * @author Huelton
 */
public class TiposPrimitivos {

// este é um comentario

	/*
	 * texto de comentario texto de comentario
	 */

	public static void main(String[] args) {

		byte valorByte = 0;
		short valorShort = 1234;
		int idade1 = 2_147_483_647;
		long idadeLong = 1000L;	
		float valor = 8.37F;
		double preco = 18_000.00;		
		char Letra = 'A';
		boolean flag = false;
		
		String nome = "Huelton Santos";
		
		valor = (float) preco;
		
		int idade2 = (int) idadeLong;
		
		System.out.println("minha variavel byte: "+valorByte+" minha variavel int: "+idade1);

	}

}
