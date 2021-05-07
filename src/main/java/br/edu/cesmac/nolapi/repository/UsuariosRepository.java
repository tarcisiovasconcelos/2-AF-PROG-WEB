package br.edu.cesmac.nolapi.repository;
import br.edu.cesmac.nolapi.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
}
