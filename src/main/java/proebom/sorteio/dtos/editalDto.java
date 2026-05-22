package proebom.sorteio.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import proebom.sorteio.enums.StatusEdital;
import proebom.sorteio.models.Edital;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class editalDto {
  
  private Long id;
  private String titulo;
  private String descricao;
  private LocalDateTime dataInicioInscricao;
  private LocalDateTime dataFimInscricao;
  private LocalDateTime dataCriacao;
  private LocalDateTime dataNascimentoInicial;
  private LocalDateTime dataNascimentoFinal;
  private int numeroVagasFilhoMilitar;
  private StatusEdital status;
  private long idUsuarioCriacao;

  public editalDto(Edital entity) {
    this.id = entity.getId();
    this.titulo = entity.getTitulo();
    this.descricao = entity.getDescricao();
    this.dataInicioInscricao = entity.getDataInicioInscricao();
    this.dataFimInscricao = entity.getDataFimInscricao();
    this.dataCriacao = entity.getDataCriacao();
    this.dataNascimentoInicial = entity.getDataNascimentoInicial();
    this.dataNascimentoFinal = entity.getDataNascimentoFinal();
    this.numeroVagasFilhoMilitar = entity.getNumeroVagasFilhoMilitar();
    this.status = entity.getStatus();
    this.idUsuarioCriacao = entity.getUsuarioCriacao().getId();
  }
}
