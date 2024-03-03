package übungsaufgaben.schleifen;

import java.util.Scanner;

public class Loops08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        do {
            System.out.print("Startkapital: ");
            double k = sc.nextDouble();

            System.out.print("Prozentsatz: ");
            double p = sc.nextDouble();

            System.out.print("Jahre: ");
            double n = sc.nextDouble();

            System.out.printf("Endkapital %.2f€%n", calulateK0(k, p, n));

            System.out.println("again(true/false)");
            running = Boolean.valueOf(sc.next());
        } while (running);

    }

    private static double calulateK0(double k, double p, double n) {
        return k * (Math.pow(((p / 100) + 1), n));
    }
}
