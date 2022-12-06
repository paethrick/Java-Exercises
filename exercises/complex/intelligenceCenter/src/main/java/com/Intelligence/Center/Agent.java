package exercises.complex.intelligenceCenter.src.main.java.com.Intelligence.Center;

import java.util.ArrayList;
import java.util.List;

public class Agent extends SecretAgent implements InfoAgent,OfficerAgent{

    private int killCount = 0;
    private List<String> reports;


    public Agent(int id, String name, String alias, boolean active) {
        super(id, name, alias, active);
        this.reports = new ArrayList<>();
    }

    @Override
    public void reportToSuperior() {

    }

    @Override
    public void sendMessage() {

    }
}
