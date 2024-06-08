package br.fatecrl.mvcdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.fatecrl.mvcdemo.models.Filme;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
 private static final List<Filme>
         filmes = new ArrayList<>();

    public FilmeController() {
        filmes.add(new Filme("Diário de uma paixão","Romance"));
        filmes.add(new Filme("Monstros S.A","Animação"));
        filmes.add(new Filme("Halloween","Terror"));

    }

    @GetMapping
    public String getFilmes(Model model)
    {
        model.addAttribute("filmes",filmes);
        return "filmes";
    }
}
