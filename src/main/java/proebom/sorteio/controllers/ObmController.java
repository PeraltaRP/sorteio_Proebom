package proebom.sorteio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import proebom.sorteio.models.OBM;
import proebom.sorteio.services.ObmService;

@Controller
@RequestMapping("admin/obm")
public class ObmController {
  
  @Autowired
  private ObmService ObmService;


  @GetMapping
    public String listar(Model model){

        model.addAttribute(
            "obms",
            ObmService.listarTodas()
        );

        model.addAttribute(
            "obm",
            new OBM()
        );

        return "admin/obm";
    }
  @GetMapping("/cadastrar")
  public void exibirFormularioCadastro() {

  }
}
