package com.cumpabotta.gestioneanalisisangue;

import java.io.IOException;

import com.cumpabotta.gestioneanalisisangue.util.JSONValidate;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;

/**
 *
 * @author TommasoBotta
 */
public class GestioneAnalisiSangue {

    private static final Path RESOURCES_DIR = Paths.get("src", "main", "resources");
    public static final Path ESAMI_JSON = RESOURCES_DIR.resolve("esami.json");
    private static final Path ESITI_JSON = RESOURCES_DIR.resolve("esiti.json");
    private static final Path ESAMI_SCHEMA = RESOURCES_DIR.resolve("esami-schema.json");
    private static final Path ESITI_SCHEMA = RESOURCES_DIR.resolve("esiti-schema.json");
    
    private static Esiti[] esiti;

    public static void main(String[] args) throws ParseException {
        
        try {
            System.out.print("Esami: ");
            JSONValidate.validate(ESAMI_JSON.toString(), ESAMI_SCHEMA.toString());
            System.out.print("Esiti: ");
            JSONValidate.validate(ESITI_JSON.toString(), ESITI_SCHEMA.toString());
            
            esiti = Esiti.parseEsiti(ESITI_JSON);
            EsamiPaziente[] esamiPaziente = EsamiPaziente.parseEsamiPaziente(ESAMI_JSON);
            
            for (EsamiPaziente paziente : esamiPaziente) {
                String nome = paziente.getPaziente().getNome();
                String cognome = paziente.getPaziente().getCognome();
                String dataPrelievo = paziente.getPrelievo().getData() + " " + paziente.getPrelievo().getOra();
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Paziente: " + nome + " " + cognome);
                System.out.println("Prelievo: " + dataPrelievo + " - " + paziente.getPrelievo().getLuogo());
                for (Analisi analisi : paziente.getAnalisi()) {
                    String dataEsito = analisi.getData() + " " + analisi.getOra();
                    System.out.println("Analisi:  " + dataEsito + " - " + analisi.getDenominazione());
                }
                System.out.println("------------------------------------------------------------------------");
            }
        } catch (IOException | ProcessingException e) {
            System.err.println("Errore durante la validazione del file json: " + e.getMessage());
        }
    }
}
