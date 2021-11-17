import java.util.Scanner;

public class a040 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt(), max = sc.nextInt();
        for (int i = min; i < max; i++) {
            String tmp = String.valueOf(i);
            int total = 0;
            for(int j = 0;j < tmp.length(); j++) {
                total += Math.pow(Integer.parseInt(String.valueOf(tmp.charAt(j))), tmp.length());
            }
            if(total == i) {
                System.out.printf("%d ", i);
            }
        }
        sc.close();
    }
}