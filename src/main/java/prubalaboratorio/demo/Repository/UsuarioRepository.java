package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.Usuario;

import java.io.Serializable;

@Repository("usuarioRepo")
public interface UsuarioRepository {
    public interface UserRepository extends JpaRepository<Usuario,Serializable> {

        public abstract Usuario findByIdUsuario(int idUsuario);



    }
}
