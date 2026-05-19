package proebom.sorteio.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "matriculas", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NUMERO_MATRICULA", columnNames = "numero_matricula"),
        @UniqueConstraint(name = "UK_INSCRICAO", columnNames = "id_inscricao")
})
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_inscricao", nullable = false)
    private Inscricao inscricao;

    @Column(name = "numero_matricula", nullable = false, unique = true, length = 100)
    private String numeroMatricula;

    @Column(nullable = false)
    private LocalDateTime dataMatricula;

    @Column(nullable = false)
    private Boolean documentosEntregues;

    @Column
    private LocalDateTime dataEntregaDocumentos;

    @Column(nullable = false)
    private Boolean ativa;
}