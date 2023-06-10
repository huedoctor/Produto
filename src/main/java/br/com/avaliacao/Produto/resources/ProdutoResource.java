package br.com.avaliacao.Produto.resources;


import br.com.avaliacao.Produto.Entities.Produto;
import br.com.avaliacao.Produto.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping(value = "{id}")
    public ResponseEntity<Produto> findByid(@PathVariable Long id) {
        Produto produto = produtoService.findById(id);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping
    public List<Produto> findAll() {
        List<Produto> produtos = produtoService.findAll();
        return produtos;
    }

    @PostMapping (value = "/gravar")
    public ResponseEntity<Produto> gravarProduto(@RequestBody Produto produto) {
        produto = produtoService.gravarProduto(produto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId()).toUri();
        return ResponseEntity.created(uri).body(produto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Produto> deletar(@PathVariable Long id) {
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto){
        Produto alteration= produtoService.update(id, produto);
        return ResponseEntity.ok().body(alteration);
    }
}
