package outros.com.citibank.aula4sabado.oo2;

import com.citibank.aula4sabado.oo.Mamifero;

public class SerHumano extends Mamifero{

	private String nome;
	private char genero;
	private String documento;	
	
	public void registro(String nome, char genero, String documento) {
		System.out.println("Nome: "+ nome+ ", Genero: "+genero+", Doc: "+ documento);		
		processo(nome);
	}
	
	private void processo(String nome ) {
		System.out.println("Encaminhado dados para o Banco - nome = "+ nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
}
