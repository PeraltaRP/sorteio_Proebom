package proebom.sorteio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import proebom.sorteio.dtos.EditalCreateDto;
import proebom.sorteio.dtos.EditalListDto;
import proebom.sorteio.models.Edital;
import proebom.sorteio.repository.EditalRepository;
import proebom.sorteio.services.EditalService;

@RestController
@RequestMapping("/admin/editais")
public class Editalcontroller {

  @Autowired
  private EditalService serviceEdital;
  
  @Autowired
  private EditalRepository repositoryEdital;

  @GetMapping("/list")
  public List<EditalListDto> listaResumida() {
    List<Edital> editaisList = repositoryEdital.findAll();
    if(editaisList.isEmpty()){
      throw new RuntimeException("Nenhum edital encontrado.");
    }
    return serviceEdital.resumo();

  }

  @PostMapping("/cadastro")
  public EditalCreateDto insert(@RequestBody EditalCreateDto dto) {
    return serviceEdital.insert(dto);
  }


}
