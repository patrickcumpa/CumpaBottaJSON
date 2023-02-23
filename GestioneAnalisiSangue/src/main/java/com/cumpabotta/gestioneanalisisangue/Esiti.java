package com.cumpabotta.gestioneanalisisangue;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author TommasoBotta
 */
public class Esiti {
    
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

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
    
    public boolean isPeriodoValido(String dataPrelievo, String dataEsito) throws ParseException {
        Date prelievo = FORMAT.parse(dataPrelievo);
        Date esito = FORMAT.parse(dataEsito);
        long diffInMillies = Math.abs(prelievo.getTime() - esito.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff <= periodoValido;
    }
    
    public boolean isOperatoreAbilitato(String codiceOperatore, List<Integer> matricola) {
        for (Strumento str : this.getStrumenti()) {
            if (!str.getOperatoriAbilitati().contains(codiceOperatore)) {
                continue;
            }
            if (matricola.containsAll(str.getMatricolaStrumenti())) {
                return true;
            }
        }
        return false;
    }
    
    public static Esiti[] parseEsiti(Path filepath) throws IOException {
        String datiEsiti = new String(Files.readAllBytes(filepath));
        return new Gson().fromJson(datiEsiti, Esiti[].class);
    } 
}