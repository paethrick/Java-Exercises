package exercises.complex.intelligenceCenter.src.main.java.com.Intelligence.Center;

public class SecretAgent {

    private final int id;
    private String name;
    private String alias;
    private boolean active;

    public SecretAgent(int id, String name, String alias, boolean active) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public boolean isActive() {
        return active;
    }
}
