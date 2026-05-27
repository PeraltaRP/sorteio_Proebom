package proebom.sorteio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proebom.sorteio.dtos.EditalCreateDto;
import proebom.sorteio.dtos.EditalListDto;
import proebom.sorteio.models.Edital;
import proebom.sorteio.models.Usuario;
import proebom.sorteio.repository.EditalRepository;

@Service
public class EditalService {
  
  @Autowired
  private EditalRepository repositoryEdital;

  @Autowired
  private UsuarioService serviceUsuario;


  public List<EditalListDto> resumo() {
     List<Edital> list = repositoryEdital.findAll();

    return list.stream()
        .map(EditalListDto::new)
        .toList();
  }


  public EditalCreateDto insert(EditalCreateDto dto) {
    Edital entity = new Edital();
    entity.setTitulo(dto.getTitulo());
    entity.setDescricao(dto.getDescricao());
    entity.setDataAbertura(dto.getDataAbertura());
    entity.setDataFechamento(dto.getDataFechamento());
    entity.setDataCriacao(dto.getDataCriacao());
    entity.setDataNascimentoInicial(dto.getDataNascimentoInicial());
    entity.setDataNascimentoFinal(dto.getDataNascimentoFinal());
    entity.setStatus(dto.getStatus());
    // Aqui você pode associar o usuário criador, se necessário

    Usuario usuario = serviceUsuario.buscarUsuario(dto.getIdUsuarioCriacao());
    entity.setUsuarioCriacao(usuario);

    entity = repositoryEdital.save(entity);
    return new EditalCreateDto(entity);
    
  }
}
