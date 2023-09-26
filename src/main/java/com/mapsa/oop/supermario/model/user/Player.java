package com.mapsa.oop.supermario.model.user;

import com.mapsa.oop.supermario.model.challange.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Long id;
    private String name;
    private List<Challenge> challengeList = new ArrayList<>();



    public Player() {
    }

    public Player(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChallenge(Challenge  challenge){
        challengeList.add(challenge);
    }
    public List<Challenge> getChallengeList() {
        return challengeList;
    }
}
