public class Vacanze {
    private int id;
    private String nome;

    public Vacanze(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
