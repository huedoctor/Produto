package br.com.avaliacao.Produto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.avaliacao.Produto.Entities.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
