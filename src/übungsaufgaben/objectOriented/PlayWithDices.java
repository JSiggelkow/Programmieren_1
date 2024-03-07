package übungsaufgaben.objectOriented;

import übungsaufgaben.klassendiagramme.DiceGame;
import übungsaufgaben.klassendiagramme.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayWithDices {
    public static void main(String[] args) {
        Player jonas = new Player("Jonas");
        Player miriam = new Player("Miriam");
        ArrayList<Player> players = new ArrayList<>();
        players.addAll(List.of(jonas,miriam));
        DiceGame game = new DiceGame(players);
        game.start();

    }
}
