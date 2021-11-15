import java.io.*;

public class a013 {
    static char[] romeNumber = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
    static int[] romeToInteger = { 1, 5, 10, 50, 100, 500, 1000 };

    public static void main(String[] argv) throws IOException {

        String input;
        while (!(input = new BufferedReader(new InputStreamReader(System.in)).readLine()).equals(String.valueOf('#'))) {
            String[] data = input.split(" ");
            int val1 = Rome_Number_Converter(data[0]), val2 = Rome_Number_Converter(data[1]);
            if (val1 <= 3999 && val2 <= 3999) {
                int val = val1 - val2;
                System.out.println(Number_Rome_Converter(val));;
            } else
                System.out.println("請輸入4000以下的數字");
        }

    }

    static String Number_Rome_Converter(int val) {
        String result = "";
        if(val == 0) return "ZERO";
        for (int i = romeToInteger.length - 1; i >= 0; i -= 2) {
            int ct = val / romeToInteger[i];
            val -= ct * romeToInteger[i];
            if (ct == 4) {
                result += romeNumber[i];
                result += romeNumber[i + 1];
            } else if (ct == 9) {
                result += romeNumber[i];
                result += romeNumber[i + 2];
            } else {
                if(ct > 4 && ct < 9) {
                    ct -= 5;
                    result += romeNumber[i + 1];
                }
                for (int j = 0; j < ct; j++) {
                    result += romeNumber[i];
                }
            }
        }
        return result;
    }

    static int Rome_Number_Converter(String Rome) {
        int number = 0;
        for (int i = 0; i < Rome.length(); i++) {
            for (int j = 0; j < 7; j++) {
                if (Rome.charAt(i) == romeNumber[j]) {
                    number += romeToInteger[j];
                    break;
                }
            }
        }
        return number;
    }
}