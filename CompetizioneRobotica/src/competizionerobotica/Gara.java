package competizionerobotica;

/**
 *
 * @author TommasoBotta
 */
public class Gara {

   private String campo;
   private String giudice;
   private String squadra;
   private String ora;
   private int punteggioPercorso;
   private int punteggioDifficolta;
   private int tempo;

    public Gara(String campo, String robot, String squadra, 
            String ora, int punteggio_percorso, int punteggio_difficoltà, 
            int tempo) {
        this.campo = campo;
        this.giudice = robot;
        this.squadra = squadra;
        this.ora = ora;
        this.punteggioPercorso = punteggio_percorso;
        this.punteggioDifficolta = punteggio_difficoltà;
        this.tempo = tempo;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getGiudice() {
        return giudice;
    }

    public void setGiudice(String giudice) {
        this.giudice = giudice;
    }

    public String getSquadra() {
        return squadra;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public int getPunteggioPercorso() {
        return punteggioPercorso;
    }

    public void setPunteggioPercorso(int punteggioPercorso) {
        this.punteggioPercorso = punteggioPercorso;
    }

    public int getPunteggioDifficolta() {
        return punteggioDifficolta;
    }

    public void setPunteggioDifficolta(int punteggioDifficolta) {
        this.punteggioDifficolta = punteggioDifficolta;
    }
    
    public int getTempo() {
        return tempo;
    }
    
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    @Override
    public String toString() {
        return "Gara{" + "campo=" + campo + ", giudice=" + giudice + 
                ", squadra=" + squadra + ", ora=" + ora + 
                ", punteggioPercorso=" + punteggioPercorso + 
                ", punteggioDifficolta=" + punteggioDifficolta + 
                ", tempo=" + tempo + '}';
    }
    
}
