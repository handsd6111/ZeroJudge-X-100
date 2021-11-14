import java.io.*;

public class a022 {
    public static void main(String[] argv) throws IOException{
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        if(str.length() >= 1000) {
            System.out.println("資料長度必須小於1000");
            return;
        }
        boolean isCompare = true;
        
        for(int i = 0; i < str.length() / 2 - 1; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
            {
                isCompare = false;        
                break;
            }
        }
        System.out.println(isCompare ? "Yes" : "No");
    }
}