package loteria.com.br.apiorangeloteria.controller.dto;

import javax.validation.constraints.NotNull;

import loteria.com.br.apiorangeloteria.model.Loteria;

public class LoteriaForm {
	
	@NotNull
	private Long numero ;
	
	public LoteriaForm() {}
	
	public LoteriaForm(Loteria loteria) {
		this.numero = loteria.getNumero();
	}

	public Long getNumero() {
		return numero;
	}
	
	public Loteria toLoteria() {
 		return new Loteria(this.getNumero());
	}
	
	

}
