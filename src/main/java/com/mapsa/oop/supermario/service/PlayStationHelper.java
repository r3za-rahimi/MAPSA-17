package com.mapsa.oop.supermario.service;

import com.mapsa.oop.supermario.model.challange.Challenge;
import com.mapsa.oop.supermario.model.challange.FirstChallenge;
import com.mapsa.oop.supermario.model.challange.SecondChallenge;
import com.mapsa.oop.supermario.model.challange.ThirdChallenge;
import com.mapsa.oop.supermario.model.level.EasyLevel;
import com.mapsa.oop.supermario.model.level.HardLevel;
import com.mapsa.oop.supermario.model.level.Level;
import com.mapsa.oop.supermario.model.level.MediumLevel;

import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;

public class PlayStationHelper {


    public static Level getRandomLevel(){

        switch (new Random().nextInt(4)){

            case 1 -> {
                return new EasyLevel();
            }case 2 -> {
                return new MediumLevel();
            }case 3 -> {
                return new HardLevel();
            }default -> {
                return new EasyLevel();
            }

        }

    }

    public static Challenge getRandomLChallenge(){

        return switch (new Random().nextInt(4)){

            case 1 ,4->
                 new FirstChallenge();
            case 2 ->
                new SecondChallenge();
            case 3 ->
                 new ThirdChallenge();
            default ->
                 new FirstChallenge();

        };

    }

    public static Predicate<Challenge> getPreviousChallengeFilter(String challenge){

        return switch (challenge) {
            case "ThirdChallenge" -> x -> x instanceof SecondChallenge;
            case "SecondChallenge" -> x -> x instanceof FirstChallenge;
            default -> Objects::nonNull;
        };
    }

    public static String getPreviousChallengeName(String challenge){

        return switch (challenge) {
            case "ThirdChallenge" -> "Second Challenge";
            case "SecondChallenge" -> "First Challenge";
            default -> "";
        };
    }

}
