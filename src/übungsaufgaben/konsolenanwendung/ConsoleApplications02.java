package übungsaufgaben.konsolenanwendung;

import java.util.Scanner;

public class ConsoleApplications02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib bitte eine ganze Zahl ein: ");
        int a = sc.nextInt();

        System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
        int b = sc.nextInt();

        double c = ((double) a / b) * 100;

        System.out.printf(" %d von %d sind %.2f%%",a,b,c);
    }
}
