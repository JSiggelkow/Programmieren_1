package übungsaufgaben.schleifen;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zeichenkette1: ");
        String s1 = sc.next();

        System.out.print("Zeichenkette2: ");
        String s2 = sc.next();

        String answer = (s1.toUpperCase().equals(s2.toUpperCase()))? "identisch" : "unterschiedlich";

        System.out.printf("Die eingegebenen Zeichenketten sind %s", answer);
    }
}
