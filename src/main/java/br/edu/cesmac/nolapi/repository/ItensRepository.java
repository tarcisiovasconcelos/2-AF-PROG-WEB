package br.edu.cesmac.nolapi.repository;
import br.edu.cesmac.nolapi.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensRepository extends JpaRepository<Item, Long> {
}
