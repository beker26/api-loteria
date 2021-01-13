package loteria.com.br.apiorangeloteria.service.implement;



import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import loteria.com.br.apiorangeloteria.model.Pessoa;
import loteria.com.br.apiorangeloteria.repository.PessoaRepository;
import loteria.com.br.apiorangeloteria.service.PessoaService;

@Service
@Log4j2
public class PessoaSpringDataJPAServiceImpl implements PessoaService {

	private PessoaRepository pessoaRepository;

	public PessoaSpringDataJPAServiceImpl(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	@Override
	public Pessoa findByEmail(String email) {
		log.info("Starting Method findByEmail in PessoaSpringDataJPAServiceImpl !");
		log.info("Parameter String = {}", email);
		log.info("Finding Pessoa by email on PessoaRepository");
		log.info("Finishing Method findByEmail in PessoaSpringDataJPAServiceImpl");
		return pessoaRepository.findByEmail(email);
	}

 
	

}
