package competizionerobotica;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author patrick.cumpa
 */
public class CompetizioneRobotica {

    private static String readStringFromFile(String filepath) throws IOException {
        byte[] content = Files.readAllBytes(Paths.get(filepath));
        return new String(content);
    }

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, 
                                                  IOException {
        boolean ripete = false;
        Gson gson = new Gson();
        ArrayList<File> jsonFiles = new ArrayList<>();
        ArrayList<PunteggioSquadra> punteggi = new ArrayList<>();
        
        File directory = new File("src\\resources");
        File[] filesInDirectory = directory.listFiles();
        for (File file : filesInDirectory) {
            if (file.isDirectory()) {
                File[] files = file.listFiles((File dir, String name) -> 
                        name.endsWith(".json"));
                jsonFiles.addAll(Arrays.asList(files));
            } else if (file.getName().endsWith(".json")) {
                jsonFiles.add(file);
            }
        }
        
        if (jsonFiles.isEmpty()) {
            System.out.println("Non sono stati trovati file JSON");
            return;
        }
        for (File file : jsonFiles) {
            ripete = false;
            String json = readStringFromFile(file.toString());
            Gara gara = gson.fromJson(json, Gara.class);
            
            for (PunteggioSquadra squadra : punteggi) {
                if (squadra.getNome().equals(gara.getSquadra())) {
                    squadra.setPunteggio(squadra.getPunteggio() 
                            + gara.getPunteggioPercorso() 
                            + gara.getPunteggioDifficolta());
                    squadra.setTempo(squadra.getTempo() + gara.getTempo());
                    ripete = true;
                }
            }
            
            if (!ripete) {
                punteggi.add(new PunteggioSquadra(gara.getSquadra(), 
                        gara.getPunteggioPercorso() + 
                        gara.getPunteggioDifficolta(), 
                        gara.getTempo()));
            }
        }
        
        for (PunteggioSquadra squadra : punteggi) {
            System.out.println("-----------------------------------------");
            System.out.println("Nome: " + squadra.getNome());
            System.out.println("Punteggio: " + squadra.getPunteggio());
            System.out.println("Tempo: " + squadra.getTempo());
            System.out.println("-----------------------------------------");
        }
    }
    
}
