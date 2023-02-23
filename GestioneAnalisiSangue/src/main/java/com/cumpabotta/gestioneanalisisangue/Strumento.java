package com.cumpabotta.gestioneanalisisangue;

import java.util.List;

/**
 *
 * @author TommasoBotta
 */
public class Strumento {
    
    private List<Integer> matricolaStrumenti;
    private List<String> operatoriAbilitati;

    public Strumento(List<Integer> matricolaStrumenti, List<String> operatoriAbilitati) {
        this.matricolaStrumenti = matricolaStrumenti;
        this.operatoriAbilitati = operatoriAbilitati;
    }

    public List<Integer> getMatricolaStrumenti() {
        return matricolaStrumenti;
    }

    public void setMatricolaStrumenti(List<Integer> matricolaStrumenti) {
        this.matricolaStrumenti = matricolaStrumenti;
    }

    public List<String> getOperatoriAbilitati() {
        return operatoriAbilitati;
    }

    public void setOperatoriAbilitati(List<String> operatoriAbilitati) {
        this.operatoriAbilitati = operatoriAbilitati;
    }
}