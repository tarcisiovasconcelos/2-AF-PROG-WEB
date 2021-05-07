package br.edu.cesmac.nolapi.resources;
import br.edu.cesmac.nolapi.domain.Item;
import br.edu.cesmac.nolapi.service.ItensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItensResources {

    @Autowired
    private ItensService itensService;

    @GetMapping
    public List<Item> listar() {
        return itensService.listar();
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@Validated @RequestBody Item item) {
        itensService.salvar(item);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(item.getIdItem()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public void atualizar(@RequestBody Item item) {
        itensService.atualizar(item);
    }

    @DeleteMapping(value = "/{id}")
    public void deletar(@PathVariable("id") Long idItem) throws Exception {
        itensService.deletarPorId(idItem);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Item> buscarPorId(@PathVariable("id") Long idItem) throws Exception {
        return ResponseEntity.ok(itensService.buscarPorId(idItem));
    }

}