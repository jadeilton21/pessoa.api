package api.pessoa.social.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRespository extends JpaRepository<Pessoa,Long> {
    Page<Pessoa> findAllByAtivoTrue(Pageable paginacao);


}