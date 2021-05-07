package br.edu.cesmac.nolapi.resources;
import br.edu.cesmac.nolapi.domain.Usuario;
import br.edu.cesmac.nolapi.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosResource {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    public List<Usuario> listar() {
        return usuariosService.listar();
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@Validated @RequestBody Usuario usuario) {
        usuariosService.salvar(usuario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(usuario.getIdUsuario()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public void atualizar(@RequestBody Usuario usuario) {
        usuariosService.atualizar(usuario);
    }

    @DeleteMapping(value = "/{id}")
    public void deletar(@PathVariable("id") Long idUsuario) throws Exception {
        usuariosService.deletarPorId(idUsuario);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable("id") Long idUsuario) throws Exception {
        return ResponseEntity.ok(usuariosService.buscarPorId(idUsuario));
    }

}