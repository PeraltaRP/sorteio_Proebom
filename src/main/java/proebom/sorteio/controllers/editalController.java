package proebom.sorteio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/edital")
public class editalController {
  
  @GetMapping("/dashboard")
  public void exibirDashboard() {}

  @GetMapping("/novo")
  public void exibirFormularioCriacao() {}
  

  @GetMapping("/editar")
  public void exibirFormularioEdicao() {}

  @GetMapping("/detalhes")
  public void exibirDetalhes() {}

  @GetMapping("/sorteio")
  public void exibirSorteio() {}

  @GetMapping("/resultado")
  public void exibirResultado() {}
} 
