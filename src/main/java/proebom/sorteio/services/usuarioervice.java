package proebom.sorteio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proebom.sorteio.dtos.UsuarioDTO;
import proebom.sorteio.models.Usuario;
import proebom.sorteio.repository.UsuarioRepository;

@Service
public class usuarioervice {
    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioDTO> findAll() {
        List<Usuario> list = repository.findAll();

        return list.stream()
                .map(UsuarioDTO::new)
                .toList();
    }

    public UsuarioDTO findById(Long id) {
        Usuario entity = repository.findById(id).get();
        return new UsuarioDTO(entity);
    }

    public UsuarioDTO insert(UsuarioDTO dto) {

        Usuario entity = new Usuario();

        entity.setNome(dto.getNome());
        entity.setMatricula(dto.getMatricula());
        entity.setAtivo(dto.isAtivo());

        entity = repository.save(entity);

        return new UsuarioDTO(entity);
    }

    public Usuario findByMatriculaAndSenha(String matricula, String senha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByMatricula'");
    }

}
