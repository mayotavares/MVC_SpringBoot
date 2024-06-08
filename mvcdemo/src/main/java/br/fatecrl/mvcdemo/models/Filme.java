package br.fatecrl.mvcdemo.models;

public class Filme {

    private String filme;
    private String genero;

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Filme(String filme, String genero) {
        this.filme = filme;
        this.genero = genero;
    }
}
