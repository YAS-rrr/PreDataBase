public class Cognome {
    private int id;
    private String cognome;

    public Cognome(int id, String cognome) {
        this.id = id;
        this.cognome = cognome;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
