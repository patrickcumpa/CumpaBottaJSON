package competizionerobotica;

/**
 *
 * @author PatrickCumpa
 */
public class PunteggioSquadra {
    
    private String nome;
    private int punteggio;
    private int tempo;

    public PunteggioSquadra(String nome, int punteggio, int tempo) {
        this.nome = nome;
        this.punteggio = punteggio;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
}
