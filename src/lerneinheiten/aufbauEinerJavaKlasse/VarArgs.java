package lerneinheiten.aufbauEinerJavaKlasse;

/**
 * VarArgs
 *
 * @author Jonas Siggelkow
 *
 */

public class VarArgs {
    public static void main(String[] args) {
        printTextVarArgs("Jonas", "Max", "Louis", "Lukas", "Salva");
    }

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void printTextArray(String[] text) {
        System.out.println(text);
    }

    public static void printTextVarArgs(String... text) {
        for (String name :
                text) {
            System.out.println(name);
        }
    }
}
