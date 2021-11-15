import java.util.Scanner;

public class a034 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int ten = sc.nextInt();
            String two = "";
            while (ten > 0) {
                two += (ten % 2) + "";
                ten /= 2;
            }
            String twoOverturn = two;
            two = "";
            for(int i = twoOverturn.length() - 1; i >= 0; i--) {
                two += twoOverturn.charAt(i);
            }
            System.out.println(two);
        }
        sc.close();
    }
}