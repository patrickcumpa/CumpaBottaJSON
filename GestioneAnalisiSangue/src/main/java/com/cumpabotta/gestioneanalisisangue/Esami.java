package com.cumpabotta.gestioneanalisisangue;

import java.util.List;

/**
 *
 * @author PatrickCumpa
 */
public class Esami {
 
    private List<EsamiPaziente> esamiPazienti;

    public Esami(List<EsamiPaziente> esamiPazienti) {
        this.esamiPazienti = esamiPazienti;
    }

    public List<EsamiPaziente> getEsamiPazienti() {
        return esamiPazienti;
    }

    public void setEsamiPazienti(List<EsamiPaziente> esamiPazienti) {
        this.esamiPazienti = esamiPazienti;
    }
}
