package loteria.com.br.apiorangeloteria.service.implement;

import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import loteria.com.br.apiorangeloteria.controller.dto.LoteriaForm;
import loteria.com.br.apiorangeloteria.model.Loteria;
import loteria.com.br.apiorangeloteria.model.Pessoa;
import loteria.com.br.apiorangeloteria.repository.LoteriaRepository;
import loteria.com.br.apiorangeloteria.repository.PessoaRepository;
import loteria.com.br.apiorangeloteria.service.LoteriasService;

@Service
@Log4j2
public class LoteriasSpringDataJPAServiceImpl implements LoteriasService {

	private LoteriaRepository loteriaRepository;
	private PessoaRepository pessoaRepository;

	public LoteriasSpringDataJPAServiceImpl(LoteriaRepository loteriaRepository, PessoaRepository pessoaRepository) {

		this.loteriaRepository = loteriaRepository;
		this.pessoaRepository = pessoaRepository;
	}

	@Override
	public Loteria insert(LoteriaForm loteriaForm) {

		Loteria loteria = loteriaForm.toLoteria();

		log.info("Starting Method insert in LoteriasSpringDataJPAServiceImpl");
		Pessoa findByPessoa = pessoaRepository.findByEmail(loteria.getPessoaEmail());

		if (findByPessoa == null) {
			findByPessoa = pessoaRepository.save(loteria.getPessoa());
		}

		Random random = new Random();
		Long numeroSorteado = Long.valueOf(random.nextInt(1000));
		loteria.setNumero(numeroSorteado);

		loteria.setPessoa(findByPessoa);
		loteria = loteriaRepository.save(loteria);
		log.info("Finishing Method insert in LoteriasSpringDataJPAServiceImpl");
		return loteria;
	}

}
