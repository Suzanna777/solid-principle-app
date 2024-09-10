package com.bank.solid.interfaceSegregation.example.farm;

import java.util.ArrayList;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {

        List<CanFly> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
 //       birds.add(new Chicken()); // chicken can not fly

        letBirdsFly(birds);

    }

    public static void letBirdsFly(List<CanFly> birds) {
        for (CanFly bird : birds) {
            bird.fly();     // Does nothing for chicken
        }
    }
    }
}
