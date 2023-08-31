package com.mapsa.oop.polymorphism.example01;

public class MainClass {

    public static void main(String[] args) {

        Woman woman = new Woman();
        woman.speak();

//        Woman sister = new Sister();
//        sister.speak();

//        Woman superHeroWoman = transformer("mother");
//        superHeroWoman.speak();
    }


    public static Woman transformer(String kind){

        switch (kind){

            case "mother" -> {
                return new Mother();
            }
            case "daughter" -> {
                return new Daughter();
            }
            case "sister" -> {
                return new Sister();
            }
            case "friend" -> {
                return new Friend();
            }default -> {
                return new Woman();
            }
        }

    }
}
