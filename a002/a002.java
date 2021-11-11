import java.io.*;
public class a002 {
    public static void main(String[] argv) throws IOException {
        String[] val = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int a=0, b=0;
        try{
            a = Integer.parseInt(val[0]);
            b = Integer.parseInt(val[1]);
        }catch (Exception ex) {
            System.out.println("錯誤訊息 : " + ex.getMessage());
        }
        if(Math.abs(a) + Math.abs(b) >= 106) {
            System.out.println("請輸入值範圍到 0~105 or 0~-105");
            return;
        }
        System.out.printf("%d", a + b);
    }
}