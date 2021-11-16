import java.util.Scanner;

public class a020 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        FirstCode[] FirstCodeArray = new FirstCode[26];
        Set_Code(FirstCodeArray);
        String userNumber = sc.nextLine();
        int result = Get_Result(userNumber, FirstCodeArray);
        if (result % 10.0 == 0) {
            System.out.println("real");
        } else {
            System.out.println("fake");
        }
        sc.close();
    }

    public static int Get_Result(String data, FirstCode[] array) {
        int codeToNumber = First_Code_To_Number(data.charAt(0), array);
        int result = codeToNumber / 10 + codeToNumber % (codeToNumber / 10 * 10) * 9;
        int count = 8;
        for (int i = 1; i < data.length() - 1; i++) {
            result += Integer.parseInt(String.valueOf(data.charAt(i))) * count--;
        }
        return (result += Integer.parseInt(String.valueOf(data.charAt(data.length() - 1))));
    }

    public static int First_Code_To_Number(char target, FirstCode[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].Get_Code() == target) {
                return array[i].Get_Number();
            }
        }
        return 0;
    }

    public static void Set_Code(FirstCode[] array) {
        int count = 10;
        for (int i = 65; i < array.length + 65; i++) {
            int tmp = 0;
            if ((char) i == 'I') {
                tmp = 34;
            } else if ((char) i == 'O') {
                tmp = 35;
            } else {
                tmp = count++;
            }
            array[i - 65] = new FirstCode((char) i, tmp);
        }
    }
}