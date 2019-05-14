package prubalaboratorio.demo.Component;

import org.springframework.stereotype.Component;
import prubalaboratorio.demo.Entity.Usuario;
import prubalaboratorio.demo.Model.UsuarioModel;

@Component("usuarioConverter")
public class UsuarioConverter {

    public Usuario convertirUserModelaUsuario(UsuarioModel usuarioModel){
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(usuarioModel.getIdUsuario());
        usuario.setContrasena(usuarioModel.getContrasena());
        usuario.setNombre(usuarioModel.getNombre());
        usuario.setApellido(usuarioModel.getApellido());
        usuario.setAdministrador(usuarioModel.isAdministrador());
        usuario.setIdtipousuario(usuarioModel.getIdTipoUsuario());

        return usuario;
    }

    public UsuarioModel convertirUsuarioaUsuarioModel(Usuario usuario){
        UsuarioModel usuarioModel = new UsuarioModel();

        usuarioModel.setIdUsuario(usuario.getIdUsuario());
        usuarioModel.setContrasena(usuario.getContrasena());
        usuarioModel.setNombre(usuario.getNombre());
        usuarioModel.setApellido(usuario.getApellido());
        usuarioModel.setAdministrador(usuario.isAdministrador());
        usuarioModel.setIdTipoUsuario(usuario.getIdtipousuario());




        return usuarioModel;
    }
}
