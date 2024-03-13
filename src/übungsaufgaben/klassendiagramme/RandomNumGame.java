package übungsaufgaben.klassendiagramme;

import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {
    private static Scanner sc;
    private static int randomNum;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        randomNum = new Random().nextInt(0,101);
        play();
    }

    private static void play() {
        System.out.print("Spieler 1 name:");
        String player1 = sc.nextLine();

        System.out.print("Spieler 2 name:");
        String player2 = sc.nextLine();

        boolean isRunning = true;
        while (isRunning) {
            if (move(player1)) {
                return;
            }
            isRunning = !move(player2);
        }
    }

    public static boolean move(String name) {
        System.out.printf("%s eingabe Tipp:",name);
        int tipp = sc.nextInt();

        if (tipp == randomNum) {
            System.out.println("Gewonnen" + name);
            return true;
        } else if (tipp < randomNum) {
            System.out.println("number ist größer");
            return false;
        } else {
            System.out.println("number ist kleiner");
            return false;
        }
    }
}
