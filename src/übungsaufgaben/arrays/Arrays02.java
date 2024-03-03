package übungsaufgaben.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eingabe: ");
        String[] sAr = sc.nextLine().split(" ");

        for (int i = 1; i <=(sAr.length/2);i++) {
            int fi = Integer.valueOf(sAr[i-1]);
            int li = Integer.valueOf(sAr[sAr.length-i]);

            sAr[i-1] = new String(li + "");
            sAr[(sAr.length-i)] = new String(fi + "");
        }
        System.out.print("Ausgabe: ");
        for (String s : sAr) {
            System.out.printf("%s ",s);
        }
    }

}
