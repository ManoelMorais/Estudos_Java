package MemoriaArrayLista.Vetores.Exercicio01;

public class AppReservaEntities {
    private String name;

    private String email;

    public AppReservaEntities() {

    }

    public AppReservaEntities(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
