package proebom.sorteio.dtos;

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
public class EditalListDto {
  private Long id;
  private String titulo;
  private StatusEdital status;
  
  public EditalListDto(Edital entity) {
    this.id = entity.getId();
    this.titulo = entity.getTitulo();
    this.status = entity.getStatus();
  }
}
