package übungsaufgaben.verzweigungen;

import java.util.Random;
import java.util.Scanner;

public class Cases04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Spieler 1, gib bitte deinen Tipp ein: ");
        int p1 = sc.nextInt();

        System.out.print("Spieler 2, gib bitte deinen Tipp ein: ");
        int p2 = sc.nextInt();

        int a = random.nextInt(1,101);

        int p1D = Math.abs(a-p1);
        int p2D = Math.abs(a-p2);

        if (p1D < p2D) {
            System.out.printf("Zufallszahl: %d, Spieler 1 gewinnt",a);
        } else if (p2D < p1D) {
            System.out.printf("Zufallszahl: %d, Spieler 2 gewinnt",a);
        } else {
            System.out.printf("Zufallszahl: %d, beide Spieler gewinnen",a);
        }
    }
}
