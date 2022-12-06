package exercises.complex.intelligenceCenter.src.main.java.com.Intelligence.Center;

import java.util.ArrayList;
import java.util.List;

public class Officer extends SecretAgent implements OfficerAgent{

    private List<Mission> missions;
    private List<String> reports;
    private List<SecretAgent> agents;


    public Officer(int id, String name, String alias, boolean active) {
        super(id, name, alias, active);
        this.reports = new ArrayList<>();
        this.missions = new ArrayList<>();
        this.agents = new ArrayList<>();
    }

    @Override
    public void sendMessage() {

    }

    public void addMissions(List<Mission> missions) {
        this.missions.addAll(missions);
    }

    public void addReports(List<String> reports) {
        this.reports.addAll(reports);
    }

    public void addAgents(List<SecretAgent> agents) {
        this.agents.addAll(agents);
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public List<String> getReports() {
        return reports;
    }

    public List<SecretAgent> getAgents() {
        return agents;
    }
}
