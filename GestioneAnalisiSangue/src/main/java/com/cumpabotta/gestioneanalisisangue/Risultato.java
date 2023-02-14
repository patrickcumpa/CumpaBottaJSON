package com.cumpabotta.gestioneanalisisangue;

/**
 *
 * @author PatrickCumpa
 */
class Risultato {
    
    private double valoreNumerico;
    private String unitaMisura;
    private double valoreMinimo;
    private double valoreMassimo;

    public Risultato(double valoreNumerico, String unitaMisura, 
            double valoreMinimo, double valoreMassimo) {
        this.valoreNumerico = valoreNumerico;
        this.unitaMisura = unitaMisura;
        this.valoreMinimo = valoreMinimo;
        this.valoreMassimo = valoreMassimo;
    }

    public double getValoreNumerico() {
        return valoreNumerico;
    }

    public void setValoreNumerico(double valoreNumerico) {
        this.valoreNumerico = valoreNumerico;
    }

    public String getUnitaMisura() {
        return unitaMisura;
    }

    public void setUnitaMisura(String unitaMisura) {
        this.unitaMisura = unitaMisura;
    }

    public double getValoreMinimo() {
        return valoreMinimo;
    }

    public void setValoreMinimo(double valoreMinimo) {
        this.valoreMinimo = valoreMinimo;
    }

    public double getValoreMassimo() {
        return valoreMassimo;
    }

    public void setValoreMassimo(double valoreMassimo) {
        this.valoreMassimo = valoreMassimo;
    }
}
