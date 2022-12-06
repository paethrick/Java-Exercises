package exercises.simple.scoutCamp.src.main.java.com.scout.camp;

import java.util.List;
import java.util.Random;

public class ScoutCamp {

    public ScoutCamp() {
    }

    public void gatherWood(List<Patrol> patrols){
        Random rand = new Random();
        int boysNumber = 100;
        String boysPatrol = "";
        int boysTried = 100;
        int girlsNumber = 100;
        String girlsPatrol = "";
        int girlsTried = 100;
        for(Patrol patrol : patrols){
            if(patrol.getKids().getGender() == Gender.BOYS){
                int number = 0;
                int number2 = 0;
                while(rand.nextInt(100) > patrol.getKids().getGender().getGatheringChance()){
                    number ++;
                    boysTried ++;
                }
                if(number<boysNumber){
                    boysNumber = number;
                }
                if(number2<boysTried){
                    boysTried = number2;
                }
            } else if(patrol.getKids().getGender() == Gender.GIRLS){
                int number = 0;
                int number2 = 0;
                while(rand.nextInt(100) > patrol.getKids().getGender().getGatheringChance()){
                    number ++;
                    number2 ++;
                }
                if(number<girlsNumber){
                    girlsNumber = number;
                }
                if(number2<girlsTried){
                    girlsTried = number2;
                }
            }
        }
        System.out.println();
    }
}
