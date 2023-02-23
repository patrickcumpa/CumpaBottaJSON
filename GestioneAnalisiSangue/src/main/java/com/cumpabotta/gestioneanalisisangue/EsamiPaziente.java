package com.cumpabotta.gestioneanalisisangue;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author PatrickCumpa
 */
public class EsamiPaziente {
    
    private Paziente paziente;
    private Prelievo prelievo;
    private List<Analisi> analisi;

    public EsamiPaziente(Paziente paziente, 
            Prelievo prelievo, List<Analisi> analisi) {
        this.paziente = paziente;
        this.prelievo = prelievo;
        this.analisi = analisi;
    }

    public Paziente getPaziente() {
        return paziente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    public Prelievo getPrelievo() {
        return prelievo;
    }

    public void setPrelievo(Prelievo prelievo) {
        this.prelievo = prelievo;
    }

    public List<Analisi> getAnalisi() {
        return analisi;
    }

    public void setAnalisi(List<Analisi> analisi) {
        this.analisi = analisi;
    }
    
    public static EsamiPaziente[] parseEsamiPaziente(Path filepath) throws IOException {
        String datiEsami = new String(Files.readAllBytes(filepath));
        return new Gson().fromJson(datiEsami, EsamiPaziente[].class);
    }
}
