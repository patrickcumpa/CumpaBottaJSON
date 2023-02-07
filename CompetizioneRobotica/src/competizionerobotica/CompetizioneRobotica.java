package competizionerobotica;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author patrick.cumpa
 */
public class CompetizioneRobotica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gara gare[];
        File directory = new File("src\\resources");
        File[] filesInDirectory = directory.listFiles((File dir, String name) -> 
                name.endsWith(".json"));
        
        for (File file : filesInDirectory) {
            
        }
    }
    
}
