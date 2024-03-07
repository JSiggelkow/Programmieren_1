package übungsaufgaben.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Optionen:
                1: Aufgabe hinzufügen
                2: Aufgabe löschen
                3: Aufgabe ausgeben
                4: Beenden""");
        boolean isRunning = true;
        ArrayList<String> tasks = new ArrayList<>();

        while (isRunning) {
            System.out.print("Was tun?: ");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1 -> {
                    System.out.print("Aufgaben hinzufügen");
                    String x = sc.nextLine();
                    tasks.add(x);
                }
                case 2 -> {
                    System.out.println("Aufgaben zum löschen: ");
                    tasks.remove(tasks.get(sc.nextInt()-1));
                }
                case 3 -> {
                    System.out.println("Aufgaben");
                    tasks.forEach(System.out::println);
                }
                case 4 -> isRunning = false;
            }
        }
    }
}
