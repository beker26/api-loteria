package loteria.com.br.apiorangeloteria.controller.dto;

import javax.validation.constraints.NotBlank;

import loteria.com.br.apiorangeloteria.model.Loteria;

public class LoteriaForm {
	
	@NotBlank(message="Preenchimento obrigatório")
	private String email;
	
	public LoteriaForm() {}
	
	public LoteriaForm(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Loteria toLoteria() {
 		return new Loteria(this.email);
	}
	
	

}
