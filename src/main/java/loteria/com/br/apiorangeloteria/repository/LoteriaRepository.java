package loteria.com.br.apiorangeloteria.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import loteria.com.br.apiorangeloteria.model.Loteria;


@Repository
public interface LoteriaRepository extends  JpaRepository<Loteria, Long> {

}
