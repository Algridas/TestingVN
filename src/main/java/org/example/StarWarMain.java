package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StarWarMain {

    public static void main(String[] arg){

        Person Obi_Wan_Kenobi = new Person("Obi-Wan Kenobi", 182, 77, "auburn","white", "57BBY", "male");
        Person Biggs_Darklighter = new Person("Biggs Darklighter", 183, 84, "black","brown", "24BBY", "male");
        Person Beru_Whitesun_lars = new Person("Biggs Darklighter", 165, 75, "brown","blue", "47BBY", "female");
        Person Owen_Lars = new Person("Owen Lars", 178, 120, "brown","blue", "52BBY", "male");
        Person Leia_Organa = new Person("Leia Organa", 150, 49, "brown","brown", "19BBY", "male");

        List<Person> characters = Arrays.asList(Obi_Wan_Kenobi, Biggs_Darklighter, Beru_Whitesun_lars, Owen_Lars, Leia_Organa);
        characters.stream()
                .filter(star -> star.getMass()<100)
                .collect(Collectors.toList())
                .forEach(Person::info);
//        characters.forEach(Person::info);




    }

}
