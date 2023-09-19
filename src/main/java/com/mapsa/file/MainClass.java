package com.mapsa.file;

import com.mapsa.file.model.Person;
import com.mapsa.file.service.PeopleFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) throws IOException {


        List<Person> people = PeopleFactory.makePeople();
        List<String> emails = people.stream().map(Person::getEmail).collect(Collectors.toList());

        Path filePath = Paths.get("src/main/java/com/mapsa/file/PersonsEmailAddresses.txt" );
        Files.deleteIfExists(filePath);
        Files.createFile(filePath);

        for (String str : emails) {
            Files.writeString(filePath, str + System.lineSeparator(),
                    StandardOpenOption.APPEND);
        }

        Map<String, Long> collect = people.stream().collect(Collectors.groupingBy(Person::getGeography, Collectors.counting()));
        Map<String , Double> collect2 = people.stream().collect(Collectors.groupingBy(Person::getProfession, Collectors.summingDouble(Person::getSalary)));

        System.out.println(collect2);
    }
}
