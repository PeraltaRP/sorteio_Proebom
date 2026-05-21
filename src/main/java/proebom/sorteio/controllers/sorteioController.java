package proebom.sorteio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sorteio")
public class sorteioController {
  
  @GetMapping("/sorteioObm")
  public void exibirSorteioObm() {}

  @GetMapping("/realizarSorteio")
  public void realizarSorteio() {}

}
