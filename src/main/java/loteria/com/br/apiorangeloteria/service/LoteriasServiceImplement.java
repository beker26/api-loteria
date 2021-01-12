package loteria.com.br.apiorangeloteria.service;

import org.springframework.stereotype.Service;

import loteria.com.br.apiorangeloteria.model.Loteria;
import loteria.com.br.apiorangeloteria.model.Pessoa;
import loteria.com.br.apiorangeloteria.repository.LoteriaRepository;
import loteria.com.br.apiorangeloteria.repository.PessoaRepository;
import loteria.com.br.apiorangeloteria.service.implement.LoteriasService;

@Service
public class LoteriasServiceImplement implements LoteriasService {

	private LoteriaRepository loteriaRepository;
	private PessoaRepository pessoaRepository;

	public LoteriasServiceImplement(LoteriaRepository loteriaRepository,PessoaRepository pessoaRepository) {

		this.loteriaRepository = loteriaRepository;
		this.pessoaRepository = pessoaRepository;
	}

 
	
	
	@Override
	public Loteria insert(String email, Loteria loteriaForm) {
		Pessoa findByPessoa = pessoaRepository.findByEmail(email);
		loteriaForm.setPessoa(findByPessoa);
		loteriaForm = loteriaRepository.save(loteriaForm);
		return loteriaForm;
	}

}
