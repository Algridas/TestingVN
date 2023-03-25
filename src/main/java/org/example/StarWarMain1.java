package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StarWarMain1 {

    public static void main(String[] args){

        Person1 Luke_Skywalker = new Person1("Luke Skywalker", 172, 77, "blond", "blue", "fair", "19BBY", "male");
        Person1 Darth_Vader = new Person1("Darth Vader", 202, 136, "none", "yellow", "white", "41.9BBY", "male");
        Person1 Leia_Organa = new Person1("Leia Organa", 150, 49, "brown", "brown", "light", "19BBY", "female");
        Person1 Owen_Lars = new Person1("Owen Lars", 178, 120, "brown, grey", "blue", "light", "52BBY", "female");
        Person1 Beru_Whitesun_lars = new Person1("Beru Whitesun lars", 165, 75, "brown", "blue", "light", "47BBY", "female");
        Person1 Biggs_Darklighter = new Person1("Biggs Darklighter", 183, 84, "black", "brown", "light", "24BBY", "male");
        Person1 Obi_Wan_Kenobi = new Person1("Obi-Wan Kenobi", 182, 77, "auburn, white", "blue-gray", "fair", "57BBY", "male");

        List<Person1> stars = Arrays.asList(Luke_Skywalker,Darth_Vader, Leia_Organa, Owen_Lars, Beru_Whitesun_lars, Biggs_Darklighter, Obi_Wan_Kenobi );
//        stars.forEach(Person1::info);

        List<Person1> personHasMassGreater100 = stars
                .stream()
                .filter(person -> person.getMass()>100)
                .collect(Collectors.toList());

        personHasMassGreater100.forEach(Person1::getName);

        Integer totalMass = stars.stream().mapToInt(Person1::getMass).sum();
        System.out.println(totalMass);
        stars.stream().map(Person1::getName).collect(Collectors.toList()).forEach(System.out::println);


//        Darth_Vader.info();

    }

}
