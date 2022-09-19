package com.example;

import java.util.ArrayList;
import java.util.List;

public class AlexTheLion extends Lion{

    public AlexTheLion(String sex, Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    List<String> listOfFriends = List.of("Марти", "Глория", "Мелман");

    public List<String> getFriends() {
        return listOfFriends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк.";
    }

}
