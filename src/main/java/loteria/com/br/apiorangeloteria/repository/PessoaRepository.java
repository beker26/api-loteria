package loteria.com.br.apiorangeloteria.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import loteria.com.br.apiorangeloteria.model.Pessoa;

public interface PessoaRepository extends  JpaRepository<Pessoa, Long> {
    
	
	Pessoa findByEmail(String email);

}
