package com.mapsa.file.service;

import com.mapsa.file.model.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleFactory {

    public static List<Person> makePeople(){

        List<Person> pepole =new ArrayList<>();
        try (Stream<String> file = Files.lines(Paths.get("src/main/java/com/mapsa/file/StreamPracticeWithCSVFile.csv"))) {

            pepole = file.skip(1).map(str -> {

                String[] personPisces = str.split(",");

                int i = 0;
                return new Person(
                        personPisces[i++],
                        personPisces[i++],
                        personPisces[i++],
                        Integer.parseInt(personPisces[i++]),
                        personPisces[i++],
                        personPisces.length > 10 ? personPisces[i++] + personPisces[i++] : personPisces[i++],
                        personPisces[i++],
                        personPisces[i++],
                        Double.parseDouble(personPisces[i++]),
                        Boolean.getBoolean(personPisces[i++]));
            }).collect(Collectors.toList());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return pepole;
    }
}
