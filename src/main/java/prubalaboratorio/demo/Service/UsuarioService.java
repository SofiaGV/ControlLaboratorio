package prubalaboratorio.demo.Service;

import prubalaboratorio.demo.Entity.Usuario;
import prubalaboratorio.demo.Model.UsuarioModel;

import java.util.List;

public interface UsuarioService {

    public abstract UsuarioModel addUser(UsuarioModel usuarioModel);

    public abstract List<UsuarioModel> listAllUsers();

    public abstract Usuario findUsuarioByIdUsuario(int idUsuario);

    public abstract void removerUsuario(int idUsuario);

    public abstract UsuarioModel findUserByIdUsuarioModel(int idUsuario);
}
