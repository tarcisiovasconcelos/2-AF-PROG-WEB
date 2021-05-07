package br.edu.cesmac.nolapi.service;

import br.edu.cesmac.nolapi.domain.Pedido;
import br.edu.cesmac.nolapi.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;

    public Pedido salvar(Pedido pedido) {
        Pedido pedidoCriada = pedidosRepository.save(pedido);
        return pedidoCriada;
    }

    public Pedido atualizar(Pedido pedido) {
        Pedido pedidoAtualizada = pedidosRepository.save(pedido);
        return pedidoAtualizada;
    }

    public void deletarPorId(Long id) throws Exception {
        Pedido pedidoExclusao = pedidosRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));

        pedidosRepository.deleteById(id);
    }

    public Pedido buscarPorId(Long id) throws Exception {
        return pedidosRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));
    }

    public List<Pedido> listar() {
        return pedidosRepository.findAll();
    }

}