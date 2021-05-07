package br.edu.cesmac.nolapi.service;

import br.edu.cesmac.nolapi.domain.Item;
import br.edu.cesmac.nolapi.repository.ItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItensService {

    @Autowired
    private ItensRepository itensRepository;

    public Item salvar(Item item) {
        Item itemCriada = itensRepository.save(item);
        return itemCriada;
    }

    public Item atualizar(Item item) {
        Item itemAtualizada = itensRepository.save(item);
        return itemAtualizada;
    }

    public void deletarPorId(Long id) throws Exception {
        Item itemExclusao = itensRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));

        itensRepository.deleteById(id);
    }

    public Item buscarPorId(Long id) throws Exception {
        return itensRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));
    }

    public List<Item> listar() {
        return itensRepository.findAll();
    }


}