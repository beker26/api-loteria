package loteria.com.br.apiorangeloteria.controller;


import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import loteria.com.br.apiorangeloteria.controller.dto.LoteriaDto;
import loteria.com.br.apiorangeloteria.controller.dto.LoteriaForm;




@RestController
@RequestMapping(value = "/v1/pessoa/loteria")
public interface LoteriaControllerApi {
	
	@PostMapping
	@Transactional
	ResponseEntity<LoteriaDto> insertAposta( @RequestBody @Validated LoteriaForm loteriaForm, UriComponentsBuilder uriBuilder);
	
	
	

}
