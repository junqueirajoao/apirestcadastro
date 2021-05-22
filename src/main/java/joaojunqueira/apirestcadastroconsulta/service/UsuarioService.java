package joaojunqueira.apirestcadastroconsulta.service;


import joaojunqueira.apirestcadastroconsulta.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private static List<Usuario> usuario;

    public UsuarioService() {

        usuario = new ArrayList<Usuario>();
        Usuario usuario = new Usuario();
        usuario.setId();
        usuario.setNome();
        usuario.setCpf();
        usuario.setEmail();
        usuario.setTel();

        public static Usuario getUsuarioPorCPF ( long cpf){
            return usuario.getCpf();
        }
    }

}