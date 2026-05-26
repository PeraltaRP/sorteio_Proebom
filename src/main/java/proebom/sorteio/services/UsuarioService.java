package proebom.sorteio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proebom.sorteio.models.Usuario;
import proebom.sorteio.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repositoryUsuario;

    public Usuario buscarUsuario(Long idUsuarioCriacao) {

        return repositoryUsuario.findById(idUsuarioCriacao)
            .orElseThrow(() ->
                new RuntimeException(
                    "Usuário não encontrado com ID: "
                    + idUsuarioCriacao
                )
            );
    }
}
