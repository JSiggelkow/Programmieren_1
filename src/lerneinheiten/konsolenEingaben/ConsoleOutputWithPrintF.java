package lerneinheiten.konsolenEingaben;

import java.util.Locale;

/**
 * Konsolenausgaben mit Hilfe der print-Methoden
 *
 * @author Jonas Sigglekow
 * @version 1.0
 */
public class ConsoleOutputWithPrintF {
    public static void main(String[] args) {

        // print - und println- Methoden
        System.out.println("twertwerwterte∂");
        System.out.print("twertwerwterte∂");

        // printf-Methoden
        // Fromatierungsregel: %flags width .precision conversion-character

        // String-Fromatierungen (d)
        String text = "Hallo";
        String name = "Hans";
        System.out.printf("%n%s %s%n",text,name);
        System.out.printf("%S %S%n",text,name);
        System.out.printf("%-20s %s%n",text,name);

        // Dezimalzahlen-Formatierung (d)
        System.out.println(1_000_000_000);
        int i = 1_000_000_000;
        System.out.printf("%,d%n",i);
        System.out.printf("%d%n",i);
        System.out.printf(Locale.US, "%,d%n",i);

        // Gleitkommazahlen-Formatierungen (f)
        double d = 45.12897;
        System.out.println(d);
        System.out.printf(Locale.GERMAN,"%.2f %%",d);


        for (int x = 0; x<=10; x++) {
            System.out.println(x);
        }

        int l = 0;
        while ( l < 10) {
            System.out.println(i);
            l++;
        }
        boolean isFalse = false;
        do {
            System.out.println("hallo");
        } while (isFalse);


    }
}
