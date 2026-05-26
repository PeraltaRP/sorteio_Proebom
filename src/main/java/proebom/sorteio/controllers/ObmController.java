package proebom.sorteio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proebom.sorteio.dtos.ObmDto;
import proebom.sorteio.models.Obm;
import proebom.sorteio.repository.ObmRepository;
import proebom.sorteio.services.ObmService;

@RestController
@RequestMapping("/admin/obms")
public class ObmController {
  
  @Autowired
  private ObmService serviceObm;

  @Autowired
  private ObmRepository repositoryObm;

  @GetMapping("/list")
  public List<Obm> listarObms() {
    return serviceObm.listarObms();
  }

  @PostMapping("/cadastro")
  public ObmDto insert(@RequestBody ObmDto dto) {
    return serviceObm.insert(dto);
  }
  
}
