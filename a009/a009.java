import java.util.Scanner;

public class a009 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int K = 7;
        for(int i = 0; i < input.length();i++) {
            System.out.printf("%s", (char)(input.charAt(i) - K));
        }
        sc.close();
    }
}