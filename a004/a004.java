import java.util.Scanner;

public class a004 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        while (sc.hasNextInt()) {
            year = sc.nextInt();
            String isLeapYear = "閏年";
            if (year % 400 != 0) 
                if (year % 4 != 0 && year % 100 == 0) 
                    isLeapYear = "平年";
            System.out.println(isLeapYear);
        }
        sc.close();
    }
}