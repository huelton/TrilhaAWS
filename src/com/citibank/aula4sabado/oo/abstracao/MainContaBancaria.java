package com.citibank.aula4sabado.oo.abstracao;

public class MainContaBancaria {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		System.out.println("----- conta corrente -------");
		contaCorrente.depositar(100);
		System.out.println(contaCorrente.saldo);
		contaCorrente.saque(50);
		System.out.println(contaCorrente.saldo);
		System.out.println("----- conta poupança -------");
		contaPoupanca.depositar(100);
		System.out.println(contaPoupanca.saldo);
		contaPoupanca.saque(50);
		System.out.println(contaPoupanca.saldo);
	}

}
