package proebom.sorteio.models;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
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
import proebom.sorteio.enums.SerieEscolar;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidato")

public class Candidato {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_candidato")
  private Long id;
  
  @Column(name = "nome", nullable = false)
  private String nome;
  
  @Column(name = "cpf", nullable = false, unique = true)  
  private String cpf;

  private Boolean filhoMilitar;

  private String genero;

  private LocalDate dataNascimento;

  private String celular;

  private String naturalidade;

  private String nomeEscola;
  
  private Boolean necessidadeEspecial;

  @Enumerated(EnumType.STRING)
  private SerieEscolar serieEscolar;

  @Embedded
  private Endereco endereco;

  @OneToMany(mappedBy = "candidato")
  private List<Inscricao> inscricoes = new ArrayList<>();
  
  @OneToMany(mappedBy = "candidato")
  private List<CandidatoResponsavel> responsaveis = new ArrayList<>();
  
}
