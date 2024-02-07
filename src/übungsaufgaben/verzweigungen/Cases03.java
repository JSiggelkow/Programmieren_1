package übungsaufgaben.verzweigungen;

import java.util.Scanner;

public class Cases03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib bitte den Vornamen ein: ");
        String fN = sc.next();

        System.out.print("Gib bitte den Nachnamen ein: ");
        String lN = sc.next();

        System.out.print("Gib bitte das Alter ein: ");
        int a = sc.nextInt();

        System.out.print("Gib bitte das Geschlecht ein (m,w,d): ");
        char g = sc.next().charAt(0);

        if (a >= 18 && g != 'd') {
            switch (g) {
                case 'm' -> System.out.printf("Hallo Herr %s",lN);
                case 'w' -> System.out.printf("Hallo Frau %s",lN);
            }
        } else {
            System.out.printf("Halo %s",fN);
        }
    }
}
