package übungsaufgaben.verzweigungen;

import java.util.Scanner;

public class Cases06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Gib bitte den Nachnamen ein: ");
        String lN = sc.next();

        System.out.print("Gib bitte das Geschlecht ein (m,w,d): ");
        char g = sc.next().charAt(0);

        String s = "";

        switch (g) {
            case 'm' -> s="Herr ";
            case 'w' -> s="Frau ";
        }

        System.out.printf("Hallo %s%s",s,lN);
    }
}
