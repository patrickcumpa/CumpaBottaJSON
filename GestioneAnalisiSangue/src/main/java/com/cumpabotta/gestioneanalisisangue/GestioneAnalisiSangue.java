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

    public static void main(String[] args) throws ParseException {
        
        try {
            System.out.print("Esami: ");
            JSONValidate.validate(ESAMI_JSON.toString(), ESAMI_SCHEMA.toString());
            System.out.print("Esiti: ");
            JSONValidate.validate(ESITI_JSON.toString(), ESITI_SCHEMA.toString());
        } catch (IOException | ProcessingException e) {
            System.err.println("Errore durante la validazione del file json: " + e.getMessage());
        }
    }
}
