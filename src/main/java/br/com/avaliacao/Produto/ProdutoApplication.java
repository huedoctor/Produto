package br.com.avaliacao.Produto;

import br.com.avaliacao.Produto.Entities.Produto;
import br.com.avaliacao.Produto.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class ProdutoApplication implements CommandLineRunner {
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {SpringApplication.run(ProdutoApplication.class, args);}

	@Override
	public void run(String... args) throws Exception {}

}
