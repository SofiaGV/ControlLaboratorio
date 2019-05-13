package prubalaboratorio.demo.Model;

import lombok.Data;
import prubalaboratorio.demo.Entity.TipoUsuario;

@Data
public class UsuarioModel {
    private int idUsuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private TipoUsuario idTipoUsuario;
    private boolean administrador;

    public UsuarioModel(){

    }
}
