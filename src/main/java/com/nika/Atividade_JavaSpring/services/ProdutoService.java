package com.nika.Atividade_JavaSpring.services;

import com.nika.Atividade_JavaSpring.models.Produto;
import com.nika.Atividade_JavaSpring.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto atualizar(Long id, Produto produto) {
        Produto existente = repository.findById(id).orElseThrow();

        existente.setNome(produto.getNome());
        existente.setPreco(produto.getPreco());
        existente.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque());
        existente.setStatus(produto.getStatus());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
