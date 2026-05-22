package proebom.sorteio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import proebom.sorteio.models.Usuario;
import proebom.sorteio.services.usuarioervice;

@Controller
@RequestMapping("/usuario")
public class UsuarioControler {

  @Autowired
  private usuarioervice service;

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public void FazerLogin(@RequestParam String matricula, @RequestParam String senha, Usuario usuario) {

    System.out.println("estou aqui");

    Usuario user = service.findByMatriculaAndSenha(matricula, senha);

    if (user != null) {
      System.out.println("usuario encontrado" + user.getNome());
    }

  }

}
