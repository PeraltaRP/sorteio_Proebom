package proebom.sorteio.models;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import proebom.sorteio.enums.StatusInscricao;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inscricoes")
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroInscricao;

    @ManyToOne
    @JoinColumn(name = "id_candidato")
    private Candidato candidato;

    @ManyToOne
    @JoinColumn(name = "id_turma_treinamento")
    private TurmaTreinamento turmaTreinamento;

    private LocalDateTime dataInscricao;

    private Integer classificacao;

    @Enumerated(EnumType.STRING)
    private StatusInscricao status;

    private LocalDateTime dataCancelamento;

    private String motivoCancelamento;
}