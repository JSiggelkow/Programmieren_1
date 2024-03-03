package übungsaufgaben.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ISBN ohne Prüfziffer: ");
        char[] isbns = sc.nextLine().toCharArray();
        int count = 0;

        for (int i = 0; i < isbns.length; i++) {
            if (i % 2 == 0 || i == 0) {
                count += Character.getNumericValue(isbns[i]);
            } else {
                count += Character.getNumericValue(isbns[i]) * 3;
            }
        }


        int v = 0;

        if (count / 10 != 0) {
            int x = count % 10;
            int y = 10 - x;
            count = (count + y) - count;
        } else {
            count = 0;
        }
        System.out.printf("Prüfziffer %d", count);
    }
}
