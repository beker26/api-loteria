package loteria.com.br.apiorangeloteria.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import loteria.com.br.apiorangeloteria.model.Pessoa;

public class PessoaDetailDto {
	private Long id;
	private String email;
	private List<LoteriaDto> loteria;
	
	public PessoaDetailDto(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.email = pessoa.getEmail();
		this.loteria = new ArrayList<>();
		this.loteria.addAll(pessoa.getLoteria().stream().map(LoteriaDto::new).collect(Collectors.toList()));
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public List<LoteriaDto> getLoteria() {
		return loteria;
	}
	

}
