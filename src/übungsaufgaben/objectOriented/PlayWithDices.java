package übungsaufgaben.objectOriented;

import übungsaufgaben.klassendiagramme.Player;

import java.util.ArrayList;

public class PlayWithDices {
    public static void main(String[] args) {
        Player jonas = new Player("Jonas");
        Player miriam = new Player("Miriam");

        Dice dice = new Dice(1);

        dice.rollTheDice();
        jonas.setScore(dice.getValue());
        dice.rollTheDice();
        miriam.setScore(dice.getValue());

        if (jonas.getScore() < miriam.getScore()) {
            System.out.printf("%s wins", miriam.getName());
        } else if (jonas.getScore() > miriam.getScore()) {
            System.out.printf("%s wins", jonas.getName());
        } else {
            System.out.println("Unentschieden");
        }

    }
}
