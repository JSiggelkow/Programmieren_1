package lerneinheiten.verzweigungen;

import java.util.Scanner;

/**
 * Zeigt verschieden Möglichkeiten Verzweigungen vorzunehmen
 *
 * @author Jonas Siggelkow
 * @version 1.0
 */
public class Cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib eine Zahl ein: ");
        int x = sc.nextInt();
        if (x > 50){
            System.out.printf("%d > 50%n",x);
        } else if (x == 50) {
            System.out.printf("%d == 50%n",x);
        } else {
            System.out.printf("%d < 50%n",x);
        }

        boolean is50 = (x == 50) ? true : false;
        System.out.printf("%d == 50 : %b%n",x,is50);

        switch (x) {
            case 50 -> System.out.printf("%d == 50",x);
            case 1 -> System.out.printf("%d == 1",x);
            default -> System.out.printf("you number is %d",x);
        }
    }
}
