package se.lexicon.ulf.models;

import java.util.Random;

/**
 Make an Enum called Dice with values D6, D10, D20 and D100
 Add a field for each value representing the maxValue for each roll. You also need to create a constructor.
 Make a method called roll that returns a random number between 1 and the maxValue.
 */

public enum Dice {
    D2(2),
    D3(3),
    D4(4),
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    private int number;

    Dice(int rngMax) {
        number = rngMax;
    }

    public int getNumber() {
        return new Random().nextInt(number) + 1;
    }
}
