package übungsaufgaben.arrays;

import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("first dualNum: ");
        String[] dn1 = sc.nextLine().split("");

        System.out.print("seconed dualNum: ");
        String[] dn2 = sc.nextLine().split("");

        int[] x = new int[dn1.length];
        int[] y = new int[dn2.length];

        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.valueOf(dn1[i]);
        }

        for (int i = 0; i < y.length; i++) {
            y[i] = Integer.valueOf(dn2[i]);
        }

        int[] result = new int[x.length];
        boolean ue = false;

        x = revertArray(x);
        y = revertArray(y);
        for (int i = 0; i < x.length; i++) {


            switch (x[i] + y[i]) {
                case 1 -> result[i] = ue ? 0 : 1;
                case 0 -> {
                    result[i] = ue ? 1 : 0;
                    ue = false;
                }
                case 2 -> {
                    result[i] = ue ? 1 : 0;
                    ue = true;
                }
            }
        }

        result = revertArray(result);

        if (ue) {
            int[] result2 = new int[result.length + 1];
            result2[0] = 1;

            for (int i = 1; i < result2.length; i++) {
                result2[i] = result[i - 1];
            }
            for (int h : result2) {
                System.out.print(h);
            }
            return;
        }

        for (int h : result) {
            System.out.print(h);
        }


    }

    public static int[] revertArray(int[] s) {
        int fs;

        for (int i = 0; i < (s.length / 2); i++) {
            fs = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = fs;
        }

        return s;
    }
}

