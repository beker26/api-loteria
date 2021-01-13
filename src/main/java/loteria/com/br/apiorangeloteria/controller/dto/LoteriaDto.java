package loteria.com.br.apiorangeloteria.controller.dto;

import loteria.com.br.apiorangeloteria.model.Loteria;


public class LoteriaDto {
	
	private Long numero;
	private String email;
	
	public LoteriaDto(Loteria loteria) {
		this.numero = loteria.getNumero();
		this.email = loteria.getPessoaEmail();
	}

	public Long getNumero() {
		return numero;
	}

	public String getEmail() {
		return email;
	}
	



	
}
