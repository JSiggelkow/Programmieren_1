package eigene;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.printf("Adddition (a)%nSubtraktion (s)%nMultiplikation (m)%nDivision (d)%nExit (e)%nSet operator: ");
            String operator = sc.next();

            if (operator.equals("e")) {
                return;
            }

            System.out.print("Bitte eine ganze Zahl eingeben: ");
            int a = sc.nextInt();

            System.out.print("Bitte eine weitere ganze Zahl eingeben: ");
            int b = sc.nextInt();

            switch (operator) {
                case "a" -> {
                    int c = a + b;
                    System.out.printf("%d + %d = %d", a, b, c);
                }
                case "s" -> {
                    int c = a - b;
                    System.out.printf("%d - %d = %d", a, b, c);
                }
                case "m" -> {
                    int c = a * b;
                    System.out.printf("%d * %d = %d", a, b, c);
                }
                case "d" -> {
                    int c = a / b;
                    System.out.printf("%d / %d = %d", a, b, c);
                }
                default -> System.out.println("Something went wrong :(");
            }

            System.out.println();
            System.out.printf("%s%n","-".repeat(40));

        }
    }
}
