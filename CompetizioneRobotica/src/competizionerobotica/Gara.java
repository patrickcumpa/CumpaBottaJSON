/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competizionerobotica;

import java.time.LocalTime;

/**
 *
 * @author TommasoBotta
 */
public class Gara {

   private String campo;
   private String robot;
   private String squadra;
   private LocalTime ora;
   private int punteggio_percorso;
   private int punteggio_difficoltà;

    public Gara(String campo, String robot, String squadra, LocalTime ora, int punteggio_percorso, int punteggio_difficoltà) {
        this.campo = campo;
        this.robot = robot;
        this.squadra = squadra;
        this.ora = ora;
        this.punteggio_percorso = punteggio_percorso;
        this.punteggio_difficoltà = punteggio_difficoltà;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getRobot() {
        return robot;
    }

    public void setRobot(String robot) {
        this.robot = robot;
    }

    public String getSquadra() {
        return squadra;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public int getPunteggio_percorso() {
        return punteggio_percorso;
    }

    public void setPunteggio_percorso(int punteggio_percorso) {
        this.punteggio_percorso = punteggio_percorso;
    }

    public int getPunteggio_difficoltà() {
        return punteggio_difficoltà;
    }

    public void setPunteggio_difficoltà(int punteggio_difficoltà) {
        this.punteggio_difficoltà = punteggio_difficoltà;
    }
 
    
}
