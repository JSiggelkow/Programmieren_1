package lerneinheiten.aufbauEinerJavaKlasse;

/**
 * Demo 1: Syntax and Comments
 * @author Jonas Siggelkow
 * @version 1.0
 */

public class SyntaxAndComments {

    /**
     * String output "Hello World"
     */
    public static void main(String[] args) {
        String text = "Hello World"; // Deklaration und Initialisierung
        System.out.println(text); // Ausgabe
        Printer.printHelloWorld();
        Printer.printerText("Wie gehts?");

        /*
        * Kommentarblock
         */
    }
}
