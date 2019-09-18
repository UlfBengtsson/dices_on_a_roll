package se.lexicon.ulf.models;

import java.util.Arrays;

public class Cup <Liquid> {

    private Liquid[] internalList = (Liquid[]) new Object[3];

    private int counter = 0;

    public void addLiquid(Liquid toAdd)
    {
        if (counter < 3)
        {
            internalList[counter++] = toAdd;
        }
    }

    public void showContent()
    {
        Arrays.stream(internalList).filter(e -> e != null).forEach(System.out::println);
    }
}
