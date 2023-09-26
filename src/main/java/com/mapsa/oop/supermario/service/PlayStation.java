package com.mapsa.oop.supermario.service;

import com.mapsa.oop.supermario.exceptions.WrongChallengeException;
import com.mapsa.oop.supermario.exceptions.WrongLevelException;
import com.mapsa.oop.supermario.model.challange.Challenge;
import com.mapsa.oop.supermario.model.challange.ThirdChallenge;
import com.mapsa.oop.supermario.model.level.EasyLevel;
import com.mapsa.oop.supermario.model.level.Level;
import com.mapsa.oop.supermario.model.user.Player;

import java.util.Random;

public class PlayStation {


    public void play(Challenge challenge , Level level , Player player) throws WrongChallengeException {

        if (challenge instanceof ThirdChallenge && level instanceof EasyLevel){
            throw new WrongLevelException("You Can only Play This Challenge In Medium and Hard level ");
        }
        long count = challenge.getClass().getSimpleName()
                .equals("FirstChallenge") ? 1 :
                player.getChallengeList().
                stream().
                filter(PlayStationHelper.getPreviousChallengeFilter(challenge.getClass().getSimpleName())).count();

        if (count < 1){

            throw new WrongChallengeException("you should play "+
                    PlayStationHelper.getPreviousChallengeName(challenge.getClass().getSimpleName()) +
                    " then play "+ challenge.getClass().getSimpleName()
                    ,102);
        }

        System.out.println("\u001B["+new Random().nextInt(32,38)+"m");
        challenge.perform();
        level.effect();

    }
}
