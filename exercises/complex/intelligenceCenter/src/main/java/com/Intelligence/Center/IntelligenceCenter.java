package exercises.complex.intelligenceCenter.src.main.java.com.Intelligence.Center;

import java.util.ArrayList;
import java.util.List;

public class IntelligenceCenter {

    private List<SecretAgent> agents;
    private List<Mission> missions;

    public IntelligenceCenter(List<SecretAgent> agents, List<Mission> missions) {
        this.agents = new ArrayList<>(agents);
        this.missions = new ArrayList<>(missions);
    }

    public void launchMission(Officer officer){

    }

    public void transferInformers(Agent fallenAgent, Agent newAgent){

    }

    public void retireAgent(Agent agent){

    }

    public void closeMission(Mission mission){

    }

    public String reportMissionStatus(Mission mission){
        return null;
    }

    public Agent reportAgentForRetire(){
        return null;
    }

    public Officer mostCompletedMissions(){
        return null;
    }
}
