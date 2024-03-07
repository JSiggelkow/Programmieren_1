package übungsaufgaben.javaApi;

import java.util.Scanner;

public class JavaAPI04 {
    public static void main(String[] args) {
        System.out.printf("Wert zwischen %d und % d: ",-1,-32768);
        short input = new Scanner(System.in).nextShort();

        System.out.printf("Ergebnis vorzeichenfrei: %d",Short.toUnsignedInt(input));
    }
}
