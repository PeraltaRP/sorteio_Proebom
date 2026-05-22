package proebom.sorteio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import proebom.sorteio.services.inscricaoService;

@Controller
@RequestMapping("/inscricao")
public class inscricaoController {

  @Autowired
  private inscricaoService service;

  @GetMapping("/candidato")
  public void exibirFormularioCandidato() {
  }

  @GetMapping("/responsavel")
  public void exibirFormularioResponsavel() {}

  @GetMapping("/termo")
  public void exibirTermo() {}

  @GetMapping("/anexos")
  public void exibirAnexos() {}

  @GetMapping("/finalizar")
  public void finalizarInscricao() {}
}
