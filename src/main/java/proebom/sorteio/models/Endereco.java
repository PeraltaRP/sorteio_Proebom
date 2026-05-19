package proebom.sorteio.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Endereco {
  private String cep;
  private String logradouro;
  private String bairro;
  private String numero;
  private String complemento;
  private String cidade;
  private String estado;
}
