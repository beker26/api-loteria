package loteria.com.br.apiorangeloteria.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.extern.log4j.Log4j2;
import loteria.com.br.apiorangeloteria.controller.dto.LoteriaDto;
import loteria.com.br.apiorangeloteria.controller.dto.LoteriaForm;
import loteria.com.br.apiorangeloteria.model.Loteria;
import loteria.com.br.apiorangeloteria.service.LoteriasService;


@RestController
@Log4j2
public class LoteriaController implements LoteriaControllerApi {

	private LoteriasService loteriaService;

	public LoteriaController(LoteriasService loteriaService) {
		this.loteriaService = loteriaService;

	}

	@Override
	public ResponseEntity<LoteriaDto> insertAposta(LoteriaForm loteriaForm, UriComponentsBuilder uriBuilder) {
		log.info("Starting Method insertAposta in Loteria Controller!");
		log.info("Form: {}", loteriaForm);
		Loteria loteria = loteriaService.insert(loteriaForm);
		log.info("Finishing Method insertAposta in Loteria Controller!");
		URI uri = uriBuilder.path("/pessoa/{email}").buildAndExpand(loteria.getPessoaEmail(),loteria.getNumero()).toUri();
		return ResponseEntity.created(uri).body(new LoteriaDto(loteria));
	}

	
	
	
	
	

}
