package übungsaufgaben.verzweigungen;

import java.util.Scanner;

public class Cases01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib bitte eine ganze Zahl ein: ");
        int a = sc.nextInt();

        if (a%2 == 0){
            System.out.println("Ergebnis: Die eingegebene Zahl ist gerade");
        } else {
            System.out.println("Ergebnis: Die eingegebene Zahl ist ungerade");
        }
    }
}
