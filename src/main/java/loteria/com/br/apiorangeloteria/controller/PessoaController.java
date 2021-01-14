package loteria.com.br.apiorangeloteria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import loteria.com.br.apiorangeloteria.controller.dto.PessoaDetailDto;
import loteria.com.br.apiorangeloteria.model.Pessoa;
import loteria.com.br.apiorangeloteria.service.PessoaService;

@RestController
@Log4j2
public class PessoaController implements PessoaControllerApi {

	private PessoaService pessoaService;

	public PessoaController(PessoaService pessoaService) {
		this.pessoaService = pessoaService;

	}

	@Override
	public ResponseEntity<PessoaDetailDto> findByEmail(String email) {
		log.info("Starting Method findByEmail in Pessoa Controller!");
		log.info("Parameter String = {}", email);
		Pessoa pessoa = pessoaService.findByEmail(email);
		log.info("Converting Pessoa to PessoaDto");
		return ResponseEntity.ok().body(new PessoaDetailDto(pessoa));
	}

}
