import java.io.*;

public class hello {
    public static void main(String[] argv) throws IOException {
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.printf("hello, %s", str);
    }
}