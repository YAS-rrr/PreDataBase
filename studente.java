public class studente {
    public class Studente {
    private final int id;
    private final String nome;
    private final String cognome;
    private final String pcto;
    private final String vacanza;

    public Studente(int id, String nome, String cognome, String pcto, String vacanza) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.pcto = pcto;
        this.vacanza = vacanza;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public String getPcto() { return pcto; }
    public String getVacanza() { return vacanza; }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    @Override
    public String toString() {
        return id + " - " + getNomeCompleto()
                + " | PCTO: " + (pcto != null ? pcto : "nessuno")
                + " | Vacanza: " + (vacanza != null ? vacanza : "nessuna");
    }
}
    
}
