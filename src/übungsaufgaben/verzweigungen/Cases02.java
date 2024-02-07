package übungsaufgaben.verzweigungen;

import java.util.Scanner;

public class Cases02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Gib bitte den ersten Operanden ein: ");

        int a = sc.nextInt();

        System.out.print("Gib bitte den Operator ein: ");

        String o = sc.next();

        System.out.print("Gib bitte den zweiten Operanden ein: ");

        int b = sc.nextInt();

        double r = 0;

        switch (o) {
            case "-" -> r=a-b;
            case "+" -> r=a+b;
            case "*" -> r=a*b;
            case "/" -> r=a/b;
        }

        System.out.printf("Ergebnis: %d %s %d = %.2f",a,o,b,r);
    }
}
