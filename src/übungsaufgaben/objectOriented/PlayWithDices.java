package übungsaufgaben.objectOriented;

import java.util.ArrayList;

public class PlayWithDices {
    public static void main(String[] args) {
        ArrayList<Dice> dices = new ArrayList<>();
        DiceCup diceCup = new DiceCup();

        for (int i = 0; i < 5; i++){
            dices.add(new Dice(i+1));
        }

        System.out.println("ID - Wuerfelwert");
        for (int i = 0; i < 5; i++){
            System.out.printf("Wurf %d%n",i+1);
            diceCup.rollTheDices(dices);
        }
    }
}
