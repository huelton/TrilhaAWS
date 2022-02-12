package outros.com.citibank.aula4sabado.oo2;

import java.time.LocalDateTime;

public class Pessoa extends SerHumano {

	public LocalDateTime dataNascimento;

	@Override
	public String anda() {
		return "Pessoa Andando";
	}

}
