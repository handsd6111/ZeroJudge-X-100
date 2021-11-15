import java.util.Scanner;

public class Martix {
    private double[][] data;

    public Martix(int m, int n) {
        data = new double[m][n];
    }

    public static void Show_Martix_Array(double[][] array) {
        for(int m = 0; m < array.length; m++) {
            for(int n = 0; n < array[m].length; n++) {
                System.out.printf("[%s, %s] : %s   ", m , n, array[m][n]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Show_Martix_Array() {
        for(int m = 0; m < data.length; m++) {
            for(int n = 0; n < data[m].length; n++) {
                System.out.printf("[%s, %s] : %s   ", m , n, data[m][n]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public double[][] Get_Martix_Array() {
        return data;
    }

    public double Get_Martix(int m, int n) {
        return data[m][n];
    }

    public void Set_Martix_Array(Scanner user) {
        System.out.println("===============================");
        for(int m = 0; m < data.length; m++) {
            for(int n = 0; n < data[m].length; n++) {
                System.out.printf("[%s, %s] : ", m ,n);
                data[m][n] = user.nextDouble();
            }
        }
        System.out.println("===============================");
    } 

    public void Set_Martix(int m, int n, double value) {
        data[m][n] = value;
    }
}
