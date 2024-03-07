package übungsaufgaben.javaApi;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaAPI03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Datum (dd.mm.yyyy):");
        String date = sc.nextLine();

        int day = Integer.valueOf(date.substring(0, 2));
        int month = Integer.valueOf(date.substring(3, 5));
        int year = Integer.valueOf(date.substring(6));

        LocalDate localDate = LocalDate.of(year, month, day);
        LocalDate christmas;

        System.out.println("Wochentag" + localDate.getDayOfWeek());

        if (day <= 24 || month < 12) {
            christmas = LocalDate.of(year, 12, 24);
            int x = christmas.getDayOfYear() - localDate.getDayOfYear();
            System.out.printf("Tage bis Weihnachte: %d%n", x);
        } else {
            christmas = LocalDate.of(year + 1, 12, 24);
            int a = LocalDate.of(year,12,31).getDayOfYear() - localDate.getDayOfYear();
            int b = a + christmas.getDayOfYear();
            System.out.printf("Tage bis Weihnachten: %d%n",b);
        }
    }
}
