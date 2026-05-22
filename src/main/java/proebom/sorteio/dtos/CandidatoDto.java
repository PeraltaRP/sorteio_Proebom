package proebom.sorteio.dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import proebom.sorteio.enums.SerieEscolar;
import proebom.sorteio.models.Endereco;
import proebom.sorteio.models.Candidato;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CandidatoDto {

  private Long id;
  private String nome;
  private String cpf;
  private Boolean filhoMilitar;
  private String genero;
  private LocalDate dataNascimento;
  private String celular;
  private String naturalidade;
  private String nomeEscola;
  private Boolean necessidadeEspecial;
  private SerieEscolar serieEscolar;
  private Endereco endereco;

  private List<Long> inscricoes = new ArrayList<>();

  public CandidatoDto(Candidato entity) {
    this.id = entity.getId();
    this.nome = entity.getNome();
    this.cpf = entity.getCpf();
    this.filhoMilitar = entity.getFilhoMilitar();
    this.genero = entity.getGenero();
    this.dataNascimento = entity.getDataNascimento();
    this.celular = entity.getCelular();
    this.naturalidade = entity.getNaturalidade();
    this.nomeEscola = entity.getNomeEscola();
    this.necessidadeEspecial = entity.getNecessidadeEspecial();
    this.serieEscolar = entity.getSerieEscolar();
    this.endereco = entity.getEndereco();
    this.inscricoes = entity.getInscricoes()
        .stream()
        .map(inscricao -> inscricao.getId())
        .toList();
    
  }
}
