package übungsaufgaben.schleifen;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrim = false;

        do {
            System.out.print("Zahl eingeben: ");
            int a = sc.nextInt();

            if (a==1 || a==0) {
                System.out.printf("%d ist keine Primzahl",a);
                continue;
            }

            for (int i = 2; i <= a; i++){
                if (a%i == 0 && i!=a) {
                    System.out.printf("%d ist keine Primzahl",a);
                    break;
                }
                if (i == a) {
                    System.out.printf("%d ist eine Primzahl",a);
                    isPrim = true;
                }
            }
        } while (!isPrim);

    }
}
