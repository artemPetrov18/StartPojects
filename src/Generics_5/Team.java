package Generics_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Partipicipant>{
    private List<T> team=new ArrayList<>();
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public void addPartipicipant(T artipicipant){
        team.add(artipicipant);
       // System.out.println("bil dobavlen :"+ artipicipant.getName());
    }

    public List<T> getTeam() {
        return team;
    }

    public String getName() {

        return name;
    }

    public String winnerTeam(Team<T> snd){

        Random rand=new Random();
        int i= rand.nextInt(2);

        if(i==0)
            return this.name;
        else
            return snd.name;
    }
}
