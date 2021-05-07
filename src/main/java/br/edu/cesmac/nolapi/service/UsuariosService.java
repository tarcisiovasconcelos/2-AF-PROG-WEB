package br.edu.cesmac.nolapi.service;

import br.edu.cesmac.nolapi.domain.Usuario;
import br.edu.cesmac.nolapi.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public Usuario salvar(Usuario usuario) {
        Usuario usuarioCriada = usuariosRepository.save(usuario);
        return usuarioCriada;
    }

    public Usuario atualizar(Usuario usuario) {
        Usuario usuarioAtualizada = usuariosRepository.save(usuario);
        return usuarioAtualizada;
    }

    public void deletarPorId(Long id) throws Exception {
        Usuario usuarioExclusao = usuariosRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));

        usuariosRepository.deleteById(id);
    }

    public Usuario buscarPorId(Long id) throws Exception {
        return usuariosRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));
    }

    public List<Usuario> listar() {
        return usuariosRepository.findAll();
    }

}