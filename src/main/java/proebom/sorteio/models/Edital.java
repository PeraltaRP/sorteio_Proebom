package proebom.sorteio.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import proebom.sorteio.enums.StatusEdital;

@Getter
@Setter
@Entity
@Table(name = "editais")
public class Edital {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String titulo;
  private String descricao;
  private LocalDateTime dataInicioInscricao;
  private LocalDateTime dataFimInscricao;
  private LocalDateTime dataCriacao;
  private LocalDateTime dataNascimentoInicial;
  private LocalDateTime dataNascimentoFinal;
  private int numeroVagasFilhoMilitar;

  @Enumerated(EnumType.STRING)
  private StatusEdital status;
  
  @ManyToOne
  @JoinColumn(name = "id_usuario")
  private Usuario usuarioCriacao;
}