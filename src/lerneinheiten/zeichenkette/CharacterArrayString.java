package lerneinheiten.zeichenkette;

/**
 * Zeichenketten (String)
 *
 * @author Jonas Siggelkow
 * @version 1.0
 */

public class CharacterArrayString {
    /**
     * Show length() and charAt() methods from Class String
     * @param args
     */
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("HelloWorld lenths: " + text.length());
        System.out.println("HelloWorld Character at Index 4: " + text.charAt(4));
        System.out.println("Char at End of String: " + text.charAt(text.length()-1));

        //Escape Sequenz
        String anotherText = "\"Hello World\"\\";
        System.out.println(anotherText);
    }
}
