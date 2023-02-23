package com.cumpabotta.gestioneanalisisangue;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author TommasoBotta
 */
public class Esiti {

    private String nome;
    private int periodoValido;
    private List<Strumento> strumenti;

    public Esiti(String nome, int periodoValido, List<Strumento> strumenti) {
        this.nome = nome;
        this.periodoValido = periodoValido;
        this.strumenti = strumenti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodoValido() {
        return periodoValido;
    }

    public void setPeriodoValido(int periodoValido) {
        this.periodoValido = periodoValido;
    }

    public List<Strumento> getStrumenti() {
        return strumenti;
    }

    public void setStrumenti(List<Strumento> strumenti) {
        this.strumenti = strumenti;
    }
    
    public static Esiti[] parseEsiti(Path filepath) throws IOException {
        String datiEsiti = new String(Files.readAllBytes(filepath));
        return new Gson().fromJson(datiEsiti, Esiti[].class);
    } 
}