package joaojunqueira.apirestcadastroconsulta.controller;


import joaojunqueira.apirestcadastroconsulta.repositories.UsuarioRepository;
import joaojunqueira.apirestcadastroconsulta.model.Usuario;
import joaojunqueira.apirestcadastroconsulta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    public UsuarioRepository usuarioRepository;


    @GetMapping(value = "/all")
    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

    @Autowired
    private static UsuarioService usuarioService;

    public Usuario usuarioCPF(@PathVariable long cpf){
        return usuarioService.getUsuarioPorCPF(cpf);
    }


    @PostMapping(value = "/create")
    public String createUsuario(@RequestBody Usuario usuario){
        Usuario insertedUsuario = usuarioRepository.insert(usuario);
        return "Usuário cadastrado com sucesso "+ insertedUsuario.getNome();
    }




}
