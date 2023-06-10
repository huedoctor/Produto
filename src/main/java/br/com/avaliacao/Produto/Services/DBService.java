package br.com.avaliacao.Produto.Services;

import br.com.avaliacao.Produto.Entities.Produto;
import br.com.avaliacao.Produto.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Bean
    public void instanciarDB() throws ParseException,ParseException {
        SimpleDateFormat formato =new SimpleDateFormat("dd/MM/yyyy");
        Produto prod1 = new Produto("Arroz Branco", formato.parse("17/01/2024"));
        Produto prod2 = new Produto("Feijão", formato.parse("28/11/2024"));
        produtoRepository.saveAll((Arrays.asList(prod1,prod2)));
    }
}
