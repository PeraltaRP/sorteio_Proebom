package proebom.sorteio.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import proebom.sorteio.enums.QualificacaoResponsavel;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "responsavel")
public class Responsavel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String cpf;
  private String rg;
  
  @Embedded
  private Endereco endereco;

  private String celular;
  private String email;
  private String enderecoTrabalho;
  private String profissao;
  private BigDecimal rendaFamiliar;
  private String numeroNis;

  @Enumerated(EnumType.STRING)
  private QualificacaoResponsavel qualificacao;

  @OneToMany(mappedBy = "responsavel")
  private List<CandidatoResponsavel> candidatos = new ArrayList<>();
  
}
