package proebom.sorteio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proebom.sorteio.dtos.obmDto;
import proebom.sorteio.models.OBM;
import proebom.sorteio.services.obmService;

@RestController
@RequestMapping("admin/obm")
public class ObmController {
  
  @Autowired
  private obmService ObmService;


  @GetMapping("/listar")
    public ResponseEntity<List<OBM>> listarObms(){
      List<OBM> obmsList = ObmService.listarObms();
      return ResponseEntity.ok(obmsList);
    }

    @GetMapping("/cadastrar/nova")
    public ResponseEntity<String> cadastrarNovaObm(obmDto obm_dto){
      return ResponseEntity.ok("Formulário para cadastrar nova OBM");
    }
}
