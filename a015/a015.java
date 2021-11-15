import java.util.Scanner;

public class a015 {
    public static void main(String[] argv) {
        Scanner user = new Scanner(System.in);
        Martix m1 = new Martix(user.nextInt(), user.nextInt());
        m1.Set_Martix_Array(user);
        Martix.Show_Martix_Array(m1.Get_Martix_Array());
        Martix.Show_Martix_Array(Martix_Process.Martix_Transpose(m1.Get_Martix_Array()));
        user.close();
    }
}