package api.pessoa.social.doMain.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    UserDetails findByLogin(String username);
}