package com.mapsa.oop.supermario;

import com.mapsa.oop.supermario.exceptions.WrongChallengeException;
import com.mapsa.oop.supermario.model.challange.Challenge;
import com.mapsa.oop.supermario.model.challange.FirstChallenge;
import com.mapsa.oop.supermario.model.challange.ThirdChallenge;
import com.mapsa.oop.supermario.model.level.EasyLevel;
import com.mapsa.oop.supermario.model.level.HardLevel;
import com.mapsa.oop.supermario.model.user.Player;
import com.mapsa.oop.supermario.service.PlayStation;
import com.mapsa.oop.supermario.service.PlayStationHelper;

import java.util.Random;

public class MainClass {

    public static void main(String[] args)  {


        Player p1 = new Player(1L , "ali");
        Player p2 = new Player(1L , "sara");

        PlayStation playStation = new PlayStation();

        for (int i = 0; i < 5; i++) {

            Challenge randomLChallenge = PlayStationHelper.getRandomLChallenge();
            try {
                playStation.play(randomLChallenge, PlayStationHelper.getRandomLevel() , p1);
                p1.addChallenge(randomLChallenge);
            } catch (WrongChallengeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\u001B["+new Random().nextInt(32,38)+"m" +" "+ p1.getName() +" :");
        p1.getChallengeList().forEach(System.out::println);
    }
}
