package übungsaufgaben.schleifen;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Gib bitte eine Zeichenkette ein: ");
        String si = sc.next();

        System.out.print("Gib bitte das zu analysierende Zeichen ein: ");
        char ci = sc.next().charAt(0);

        int count = 0;

        for (char c : si.toCharArray()) {
            if (ci == c) {
                count++;
            }
        }

        double p = 0;

        if (count > 0) {
            p = ((double) si.length() / count) * 10;
        }

        System.out.printf("Absoluter Anteil: %d%n", count);
        System.out.printf("Prozentualer Anteil: %.2f", p);
    }
}
