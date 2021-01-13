package loteria.com.br.apiorangeloteria.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import loteria.com.br.apiorangeloteria.controller.dto.PessoaDetailDto;

@RestController
@RequestMapping(value = "/v1/pessoa/")
public interface PessoaControllerApi {
	
	@GetMapping(value = "/{email}")
	@ResponseStatus(value = HttpStatus.OK)
	ResponseEntity<PessoaDetailDto> findByEmail(String email);

}
