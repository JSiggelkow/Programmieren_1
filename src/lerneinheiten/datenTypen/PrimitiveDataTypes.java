package lerneinheiten.datenTypen;

/**
 * Sammlung aller Primitiven Datentypen in Java
 *
 * @author Jonas Siggelkow
 * @version 1.0
 */
public class PrimitiveDataTypes {
    /**
     * Ausgabe und Deklaration von allen Primitven Datentypen in Java
     * @param args
     */

    public static void main(String[] args) {

        // Ganze Zahlen
        byte aByte = 127;
        short aShort = 22_743;
        int anInt = 1_000_000_000;
        long aLong = 10_000_000_000L;

        System.out.println("byte1: " + aByte);
        System.out.println("aShort: " + aShort);
        System.out.println("anInt: " + anInt);
        System.out.println("aLong: " + aLong);

        // Zeichen
        char aChar = 'A';
        char anOtherChar = 65;
        char oneMoreChar = 0b1000001;
        char anUnicodeCharacter = '\u0041';

        System.out.println("aChar: " + aChar);
        System.out.println("anOtherChar: " + anOtherChar);
        System.out.println("oneMoreChar: " + oneMoreChar);
        System.out.println("anUnicodeCharacter: " + anUnicodeCharacter);

        // Boolscher Wahrheitswer
        boolean aTrueBoolean = true;
        boolean aFalseBoolean = false;
        System.out.println("aTrueBoolean: " + aTrueBoolean);
        System.out.println("aFalseBoolean: " + aFalseBoolean);

        //Gleitkommazahlen ( Floating Point Number )
        float aFloat = 0.1F;
        double aDouble = 0.1;

        System.out.printf("aFloat: " + "%.20f%n", aFloat);
        System.out.printf("aDouble: " + "%.40f%n", aDouble);


    }

}
