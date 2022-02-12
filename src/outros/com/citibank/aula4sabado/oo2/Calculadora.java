package outros.com.citibank.aula4sabado.oo2;

public class Calculadora {	
	
	public double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	//overloading
	public double somar(double num1, double num2, double num3) {		
		double soma = num1 + num2 + num3;		
		if (soma > 10)
			return soma - 2;
		else 
			return soma;
	}
}
