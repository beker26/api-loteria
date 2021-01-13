package loteria.com.br.apiorangeloteria.service;



import loteria.com.br.apiorangeloteria.model.Pessoa;

public interface PessoaService {
	
	Pessoa findByEmail(String email);

}
