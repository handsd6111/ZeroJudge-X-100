import java.util.Scanner;

public class a024 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int valA = sc.nextInt(), valB = sc.nextInt(), bigger = valA > valB ? valA : valB;
        for (int i = bigger - 1; i >= 0; i--) {
            if (valA % i == 0 && valB % i == 0) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}