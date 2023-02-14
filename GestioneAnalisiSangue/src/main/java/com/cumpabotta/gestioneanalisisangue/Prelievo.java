package com.cumpabotta.gestioneanalisisangue;

/**
 *
 * @author PatrickCumpa
 */
public class Prelievo {
    
    private String data;
    private String ora;
    private String luogo;

    public Prelievo(String data, String ora, String luogo) {
        this.data = data;
        this.ora = ora;
        this.luogo = luogo;
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

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }
}
