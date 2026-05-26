package proebom.sorteio.dtos;

import java.sql.Timestamp;
import java.time.LocalDate;
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
public class EditalCreateDto {

  private Long id;
  private String titulo;
  private String descricao;
  private LocalDateTime dataAbertura;
  private LocalDateTime dataFechamento;
  private Timestamp dataCriacao;
  private LocalDate dataNascimentoInicial;
  private LocalDate dataNascimentoFinal;
  private int numeroVagasFilhoMilitar;
  private StatusEdital status;
  private long idUsuarioCriacao;

  public EditalCreateDto(Edital entity) {
    this.id = entity.getId();
    this.titulo = entity.getTitulo();
    this.descricao = entity.getDescricao();
    this.dataAbertura = entity.getDataAbertura();
    this.dataFechamento = entity.getDataFechamento();
    this.dataCriacao = entity.getDataCriacao();
    this.dataNascimentoInicial = entity.getDataNascimentoInicial();
    this.dataNascimentoFinal = entity.getDataNascimentoFinal();
    this.numeroVagasFilhoMilitar = entity.getNumeroVagasFilhoMilitar();
    this.status = entity.getStatus();
    this.idUsuarioCriacao = entity.getUsuarioCriacao().getId();
  }
}
