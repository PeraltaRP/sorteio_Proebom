package proebom.sorteio.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "candidato_responsavel")
public class CandidatoResponsavel {
  @Id
  
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_candidato_responsavel")
  
  private Long id;
  
  @ManyToOne
  @JoinColumn(name = "id_candidato")
  private Candidato candidato;

  @ManyToOne
  @JoinColumn(name = "id_responsavel")
  private Responsavel responsavel;


  @Enumerated(EnumType.STRING)
  private QualificacaoResponsavel qualificacao;
}
