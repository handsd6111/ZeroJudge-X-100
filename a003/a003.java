import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class a003 {
    public static void main(String[] argv) throws IOException {
        String[] result = { "普通", "吉", "大吉" };
        Scanner sc = new Scanner(System.in);
        int M = 0, D = 0, S = 0;
        try {
            M = sc.nextInt();
            D = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("請輸入數字");
        }
        
        if (Between_Value(M, 1, 12) && Between_Value(D, 1, 31)) {
            S = (M * 2 + D) % 3;
            System.out.println(result[S]);
        } else {
            System.out.println("請輸入正確的日期!");
        }
        sc.close();
    }

    static boolean Between_Value(int value, int min, int max) {
        if ((value >= min && value <= max))
            return true;
        else
            return false;
    }
}