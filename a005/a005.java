import java.util.Scanner;

public class a005 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int runCount = sc.nextInt();
        if (runCount > 20 || runCount < 0) {
            System.out.println("請輸入0~20的數字");
            sc.close();
            return;
        }
        int[] numArray = new int[4];
        while (runCount-- > 0) {
            try {
                numArray = Read_Numbers(4, sc);
                for (int i = 0; i < numArray.length; i++)
                    System.out.printf(numArray[i] + " ");
                System.out.printf("%d\n", Calculate_Last_Num(numArray));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        sc.close();
    }

    static int[] Read_Numbers(int count, Scanner sc) {
        int[] tmp = new int[count];
        for (int i = 0; i < count; i++)
            tmp[i] = sc.nextInt();
        return tmp;
    }

    static int Calculate_Last_Num(int[] target) throws CustomException {
        int length = target.length;
        int moreThan105 = 0;
        for (int i = 0; i < length; i++)
            moreThan105 += target[i];
        if (moreThan105 > 105)
            throw new CustomException("數列均為小於105的數字。");
        int whichFunction = 0;
        int[] tmpAP = new int[3];
        int[] tmpGP = new int[3];
        for (int i = 1; i < length; i++) {
            tmpAP[i - 1] = target[i] / target[i - 1];
            tmpGP[i - 1] = target[i] - target[i - 1];
        }
        if ((tmpAP[0] + tmpAP[1] + tmpAP[2]) / 3 == tmpAP[0])
            whichFunction = 1;
        if ((tmpGP[0] + tmpGP[1] + tmpGP[2]) / 3 == tmpGP[0])
            whichFunction = 2;

        if (whichFunction == 1) {
            return ((target[length - 1] / target[length - 2]) * target[length - 1]);
        } else if (whichFunction == 2) {
            return ((target[length - 1] - target[length - 2]) + target[length - 1]);
        } else {
            throw new CustomException("請輸入等差或等比數列");
        }

    }
}

class CustomException extends Exception {
    public CustomException(String errorMsg) {
        super(errorMsg);
    }
}