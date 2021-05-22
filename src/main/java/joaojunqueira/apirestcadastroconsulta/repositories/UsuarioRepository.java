package joaojunqueira.apirestcadastroconsulta.repositories;

import joaojunqueira.apirestcadastroconsulta.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Long> {


}

