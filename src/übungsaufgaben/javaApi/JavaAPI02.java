package übungsaufgaben.javaApi;

import java.util.Scanner;

public class JavaAPI02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double x1 = (-b/(2*a)) + ((Math.sqrt((Math.pow(b,2))-(4*a*c))/(2*a)));
        double x2 = (-b/(2*a)) - ((Math.sqrt((Math.pow(b,2))-(4*a*c))/(2*a)));

        System.out.printf("x1 = %.1f%n",x1);
        System.out.printf("x2 = %.1f%n",x2);
    }
}
