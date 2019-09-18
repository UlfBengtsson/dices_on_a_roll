package se.lexicon.ulf;

import se.lexicon.ulf.models.Cup;
import se.lexicon.ulf.models.Dice;

import java.util.Scanner;

public class App 
{
    static Scanner scan = new Scanner(System.in);

    public static void main( String[] args )
    {
        //diceExample();

        //genericCupsExample()

        scan.close();
    }

    static void diceExample()
    {
        Dice dice = Dice.D6;

        int selection = scan.nextInt();

        switch (selection){
            case 1:
                dice = Dice.D2;
                break;
            case 2:
                dice = Dice.D3;
                break;
            case 3:
                dice = Dice.D4;
                break;
            case 4:
                dice = Dice.D6;
                break;
            case 5:
                dice = Dice.D10;
                break;
            case 6:
                dice = Dice.D20;
                break;
            case 7:
                dice = Dice.D100;
                break;
        }

        for (int i = 0; i < 10; i++) {

            System.out.println(dice.getNumber() );

        }
    }

    static void genericCupsExample()
    {
        Cup<String> myCup = new Cup<String>();

        myCup.addLiquid("Water");
        myCup.addLiquid("Coffe");

        myCup.showContent();

        Cup<Integer> numberCup = new Cup<Integer>();

        numberCup.addLiquid(8);
        numberCup.addLiquid(25);

        numberCup.showContent();
    }
}
