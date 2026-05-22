package proebom.sorteio.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import proebom.sorteio.models.CRBM;
import proebom.sorteio.models.Endereco;
import proebom.sorteio.models.OBM;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class obmDto {
  private Long id;
  private String codigo;
  private String nome;
  private String sigla;
  private String telefone;
  private CRBM crbm;
  private Endereco endereco;

  public obmDto(OBM entity) {
    this.id = entity.getId();
    this.codigo = entity.getCodigo();
    this.nome = entity.getNome();
    this.sigla = entity.getSigla();
    this.telefone = entity.getTelefone();
    this.crbm = entity.getCrbm();
    this.endereco = entity.getEndereco();
  }
}
