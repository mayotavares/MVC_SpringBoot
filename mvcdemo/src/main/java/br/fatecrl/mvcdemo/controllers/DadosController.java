package br.fatecrl.mvcdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatecrl.mvcdemo.models.Filme;

@RestController
@RequestMapping("api/filmes")
public class DadosController {
    private static final List<Filme>
            filmes = new ArrayList<>();

    public DadosController() {
        filmes.add(new Filme("Diário de uma paixão","Romance"));
        filmes.add(new Filme("Monstros S.A","Animação"));
        filmes.add(new Filme("Halloween","Terror"));
    }

    @GetMapping
    public List<Filme> getFilmes()
    {
        return filmes;
    }
}
