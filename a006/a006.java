import java.util.Scanner;

public class a006 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        double x1 = 0, x2 = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        
        if (Double.isNaN(x1) || Double.isNaN(x2)) {
            System.out.printf("No real root");
        } else {
            if (x1 != x2)
                System.out.printf("Two different roots x1=%.3f , x2=%.3f\n", x1, x2);
            if (x1 == x2)
                System.out.printf("Two same roots x=%.3f\n", x1);
        }
        sc.close();
    }
}