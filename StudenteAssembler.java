
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudenteAssembler {

    public List<Studente> caricaStudenti(String cartella) throws IOException {
        Map<Integer, String[]> nomi     = CsvReader.leggi(cartella + "/nome.csv");
        Map<Integer, String[]> cognomi  = CsvReader.leggi(cartella + "/cognome.csv");
        Map<Integer, String[]> pcti     = CsvReader.leggi(cartella + "/pcto.csv");
        Map<Integer, String[]> vacanze  = CsvReader.leggi(cartella + "/vacanze.csv");

        List<Studente> studenti = new ArrayList<>();

        for (Integer id : nomi.keySet()) {
            String nome = nomi.get(id)[0];
            String cognome = cognomi.containsKey(id) ? cognomi.get(id)[0] : null;
            String pcto = pcti.containsKey(id) ? pcti.get(id)[0] : null;
            String vacanza = vacanze.containsKey(id) ? vacanze.get(id)[0] : null;

            studenti.add(new Studente(id, nome, cognome, pcto, vacanza));
        }

        return studenti;
    }
}

