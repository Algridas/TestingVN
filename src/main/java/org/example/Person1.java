package org.example;

public class Person1 {

    String name;
    Integer height;
    Integer mass;
    String hairColor;
    String eyeColor;
    String skinColor;
    String birthYear;
    String gender;

    public Person1(String name, Integer height, Integer mass, String hairColor, String eyeColor, String skinColor, String birthYear, String gender) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    void info(){
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.mass);
        System.out.println(this.hairColor);
        System.out.println(this.eyeColor);
        System.out.println(this.skinColor);
        System.out.println(this.birthYear);
        System.out.println(this.gender);

    }

    public String getName() {
        System.out.println("Star name is "+name);
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getMass() {
        return mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }
}
