package com.cumpabotta.gestioneanalisisangue;

import java.util.List;

/**
 *
 * @author PatrickCumpa
 */
public class Analisi {
    
    private String data;
    private String ora;
    private String codiceOperatore;
    private List<Integer> matricolaStrumenti;
    private String denominazione;
    private Risultato risultato;

    public Analisi(String data, String ora, String codiceOperatore, 
            List<Integer> matricolaStrumenti, String denominazione, 
            Risultato risultato) {
        this.data = data;
        this.ora = ora;
        this.codiceOperatore = codiceOperatore;
        this.matricolaStrumenti = matricolaStrumenti;
        this.denominazione = denominazione;
        this.risultato = risultato;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getCodiceOperatore() {
        return codiceOperatore;
    }

    public void setCodiceOperatore(String codiceOperatore) {
        this.codiceOperatore = codiceOperatore;
    }

    public List<Integer> getMatricolaStrumenti() {
        return matricolaStrumenti;
    }

    public void setMatricolaStrumenti(List<Integer> matricolaStrumenti) {
        this.matricolaStrumenti = matricolaStrumenti;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public Risultato getRisultato() {
        return risultato;
    }

    public void setRisultato(Risultato risultato) {
        this.risultato = risultato;
    }
}
