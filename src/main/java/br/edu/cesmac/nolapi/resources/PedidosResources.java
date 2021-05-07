package br.edu.cesmac.nolapi.resources;
import br.edu.cesmac.nolapi.domain.Pedido;
import br.edu.cesmac.nolapi.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidosResources {

    @Autowired
    private PedidosService pedidosService;

    @GetMapping
    public List<Pedido> listar() {
        return pedidosService.listar();
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@Validated @RequestBody Pedido pedido) {
        pedidosService.salvar(pedido);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(pedido.getIdPedido()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public void atualizar(@RequestBody Pedido pedido) {
        pedidosService.atualizar(pedido);
    }

    @DeleteMapping(value = "/{id}")
    public void deletar(@PathVariable("id") Long idPedido) throws Exception {
        pedidosService.deletarPorId(idPedido);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable("id") Long idPedido) throws Exception {
        return ResponseEntity.ok(pedidosService.buscarPorId(idPedido));
    }

}