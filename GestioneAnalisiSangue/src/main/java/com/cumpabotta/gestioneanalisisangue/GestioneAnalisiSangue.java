package com.cumpabotta.gestioneanalisisangue;

import java.io.IOException;

import com.cumpabotta.gestioneanalisisangue.util.JSONValidate;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;

/**
 *
 * @author TommasoBotta
 */
public class GestioneAnalisiSangue {
    
    private static final String JSON_FILE = "src\\main\\resources\\esami.json";
    private static final String SCHEMA_FILE = "src\\main\\resources\\esami-schema.json";

    public static void main(String[] args) {
        try {
            JSONValidate.validate(JSON_FILE, SCHEMA_FILE);
        } catch (IOException | ProcessingException e) {
        }
    }
}
