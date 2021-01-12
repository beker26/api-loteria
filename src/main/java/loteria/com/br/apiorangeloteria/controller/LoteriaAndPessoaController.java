package loteria.com.br.apiorangeloteria.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import loteria.com.br.apiorangeloteria.controller.dto.LoteriaDto;
import loteria.com.br.apiorangeloteria.controller.dto.LoteriaForm;
import loteria.com.br.apiorangeloteria.model.Loteria;
import loteria.com.br.apiorangeloteria.service.implement.LoteriasService;

@RestController
public class LoteriaAndPessoaController implements LoteriaAndPessoaControllerApi {

	private LoteriasService loteriaService;

	public LoteriaAndPessoaController(LoteriasService loteriaService) {
		this.loteriaService = loteriaService;

	}

	@Override
	public ResponseEntity<LoteriaDto> insertAposta(String email, LoteriaForm loteriaForm, UriComponentsBuilder uriBuilder) {
		Loteria loteria = loteriaService.insert(email, loteriaForm.toLoteria());
		URI uri = uriBuilder.path("/pessoa/{email}").buildAndExpand(loteria.getPessoaEmail(),loteria.getNumero()).toUri();
		return ResponseEntity.created(uri).body(new LoteriaDto(loteria));
	}
	
	
	
	
	

}
