package com.example.zoomfit;

public class coach {
    String name;
    String profession ;
    int age;

    public coach(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }
}
