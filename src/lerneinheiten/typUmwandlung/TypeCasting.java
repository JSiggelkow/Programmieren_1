package lerneinheiten.typUmwandlung;

/**
 * Implizite TypUmwandlungen und Explizit TypUmwandlungen
 *
 * @author Jonas Siggelkow
 * @version 1.0
 */

public class TypeCasting {
    /**
     * Show promotion and demotion ob data objects
     * @param args
     */
    public static void main(String[] args) {

        /*
        Reihenfolge:
        (implizit)
        byte -> short -> int -> long -> float -> double
                char  -> int

        (explizit)
        byte <- short <- int <- long <- float <- double
        Umwandlungen können funktionieren, oder sie können Informationen verlieren

         */

        //Implizit
        byte b1 = 42; //(00101010)
        short s1 = b1;//(00000000 00101010)
        int i1 = s1;  //(00000000 00000000 00000000 00101010)
        long l1 = i1; //(00000000 00000000 00000000 00000000 00000000 00000000 00000000 00101010)
        float f1 = l1;//(01000010 00101000 00000000 00000000)
        double d1 =f1;//(01000000 01000101 00000000 00000000 00000000 00000000 00000000 00000000)

        //Explizit
        double d2 = 1.9;
        float f2 = (float) d2;



    }
}
