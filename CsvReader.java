
import java.io.*;
import java.util.*;

public class CsvReader {

    public static Map<Integer, String[]> leggi(String path) throws IOException {
        Map<Integer, String[]> risultato = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine(); 
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.isBlank()) continue;
                String[] campi = linea.split(",");
                int id = Integer.parseInt(campi[0].trim());
               
                String[] resto = new String[campi.length - 1];
                System.arraycopy(campi, 1, resto, 0, resto.length);
                risultato.put(id, resto);
            }
        }
        return risultato;
    }
}
    
    

