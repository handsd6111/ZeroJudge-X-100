import java.util.Scanner;

public class a038 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        String dataToString = String.valueOf(data);
        StringBuilder dataToStringSB = new StringBuilder(dataToString);
        for (int i = 0; i < dataToString.length() / 2; i++) {
            char tmp = dataToStringSB.charAt(i);
            dataToStringSB.setCharAt(i, dataToStringSB.charAt(dataToStringSB.length() - i - 1));
            dataToStringSB.setCharAt(dataToStringSB.length() - i - 1, tmp);
        }
        System.out.println(Integer.parseInt(dataToStringSB.toString()));
        sc.close();
    }
}