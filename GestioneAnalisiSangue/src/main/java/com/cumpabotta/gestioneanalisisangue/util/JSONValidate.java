package com.cumpabotta.gestioneanalisisangue.util;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

/**
 *
 * @author TommasoBotta
 */
public class JSONValidate {
    
    public static void validate(String jsonPath, String schemaPath) throws IOException, 
                                                                    ProcessingException {
        JsonNode schemaJson = JsonLoader.fromPath(schemaPath);
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaJson);

        JsonNode json = JsonLoader.fromPath(jsonPath);
        ProcessingReport report = schema.validate(json);

        if (report.isSuccess()) {
            System.out.println("Documento JSON valido.");
        } else {
            System.out.println("Documento JSON non valido.");
            System.exit(-1);
        }
    }
}
