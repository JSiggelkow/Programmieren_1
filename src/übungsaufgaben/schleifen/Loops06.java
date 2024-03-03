package übungsaufgaben.schleifen;

import java.util.Scanner;

public class Loops06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        do {
            System.out.print("Startkapital: ");
            double k = sc.nextDouble();

            System.out.print("Prozentsatz: ");
            double p = sc.nextDouble();

            System.out.printf("Jahreszins %.2f%n", calculateZ(k, p));

            System.out.print("again? (y/n): ");
            String x = sc.next();

            running = x.equals("y") ? true : false;

        } while (running);
    }

    private static double calculateZ(double k, double p) {
        return k * (p / 100);

    }
}
