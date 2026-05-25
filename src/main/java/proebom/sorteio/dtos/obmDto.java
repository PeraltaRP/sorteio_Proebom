package proebom.sorteio.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import proebom.sorteio.models.CRBM;
import proebom.sorteio.models.Endereco;
import proebom.sorteio.models.Obm;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ObmDto {
  private Long id;
  private String codigo;
  private String telefone;
  private CRBM crbm;
  private Endereco endereco;

  public ObmDto(Obm entity) {
    this.id = entity.getId();
    this.codigo = entity.getCodigo();
    this.telefone = entity.getTelefone();
    this.crbm = entity.getCrbm();
    this.endereco = entity.getEndereco();
  }
}
