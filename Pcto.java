public class Pcto{
    private int id;
    private String azienda;

    public Pcto(int id, String azienda) {
        this.id = id;
        this.azienda = azienda;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }
}