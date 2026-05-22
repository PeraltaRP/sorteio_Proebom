package proebom.sorteio.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import proebom.sorteio.models.Usuario;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDTO {
  
  private Long id;
  private String nome;
  private String matricula;
  private boolean ativo;

  public UsuarioDTO(Usuario entity) {
    this.id = entity.getId();
    this.nome = entity.getNome();
    this.matricula = entity.getMatricula();
    this.ativo = entity.isAtivo();
  }
}
