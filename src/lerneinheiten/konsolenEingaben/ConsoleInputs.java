package lerneinheiten.konsolenEingaben;

import java.util.Scanner;

/**
 * Konsoleneingaben mit Hilfe des Scanners
 *
 * @author Jonas Siggelkow
 * @version 1.0
 */
public class ConsoleInputs {
    public static void main(String[] args) {

        // Scanner initialisieren
        Scanner sc = new Scanner(System.in);

        // Werte von der Konsole auslesen
        System.out.print("Bitte eine Zahl eingeben: ");
        int int1 = sc.nextInt();
        System.out.println("int1: " + int1);

        System.out.print("Bitte eine reelle Zahl eingeben: ");
        double double1 = sc.nextDouble();
        System.out.println("double1: " + double1);

        System.out.print("Bitte einen boolschen Wahrheitswert eingeben: ");
        boolean boolean1 = sc.nextBoolean();
        System.out.println("boolean1: " + boolean1);
    }
}
