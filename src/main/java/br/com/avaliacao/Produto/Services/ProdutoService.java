package br.com.avaliacao.Produto.Services;

import br.com.avaliacao.Produto.Entities.Produto;
import br.com.avaliacao.Produto.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){this.produtoRepository=produtoRepository;}

    public Produto findById(Long id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null);
    }

    public List<Produto> findAll() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    @PostMapping
    public Produto gravarProduto(Produto produto){return produtoRepository.save(produto);}

    public void deletarProduto(Long id){produtoRepository.deleteById(id);}

    public Produto update(Long id, Produto produto){
        Produto alteration = findById(id);
        if(alteration != null) {
            alteration.setDescricao(produto.getDescricao());
            alteration.setDataValidade(produto.getDataValidade());
            return produtoRepository.save(alteration);
        }
        return null;
    }
}
