package br.edu.cesmac.nolapi.repository;
import br.edu.cesmac.nolapi.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedido, Long> {
}
