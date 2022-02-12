package com.citibank.aula4sabado.oo;

import java.time.LocalDateTime;
import java.time.Month;

import outros.com.citibank.aula4sabado.oo2.Calculadora;
import outros.com.citibank.aula4sabado.oo2.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime dataHoraEspecifica = LocalDateTime.of(1990, Month.JULY, 14, 8, 40, 30);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Huelton");
		pessoa1.setGenero('M');
		pessoa1.setDocumento("123.456.789-0");
		pessoa1.dataNascimento = dataHoraEspecifica;	
		
		System.out.println("Dados da Pessoa1: ");
		System.out.println("==================================");
		System.out.println("Nome: "+pessoa1.getNome());
		System.out.println("Genero: "+pessoa1.getGenero());
		System.out.println("Doc: "+pessoa1.getDocumento());
		System.out.println("Data nasc.: "+pessoa1.dataNascimento);		
		
		pessoa1.registro(pessoa1.getNome(), pessoa1.getGenero(), pessoa1.getDocumento());
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Maria");
		pessoa2.setGenero('F');
		pessoa2.setDocumento("890.456.986-0");
		pessoa2.dataNascimento = dataHoraEspecifica;
		pessoa2.anda();
		System.out.println("Dados da Pessoa2: ");
		System.out.println("==================================");
		System.out.println("Nome: "+pessoa2.getNome());
		System.out.println("Genero: "+pessoa2.getGenero());
		System.out.println("Doc: "+pessoa2.getDocumento());
		System.out.println("Data nasc.: "+pessoa2.dataNascimento);
		
		pessoa2.registro(pessoa2.getNome(), pessoa2.getGenero(), pessoa2.getDocumento());
		
		boolean periodo = false;
		
		pessoa2.periodoDeGestacaoParaProduzirLeite(pessoa2.getGenero(), periodo);		
		

		
	}
}
