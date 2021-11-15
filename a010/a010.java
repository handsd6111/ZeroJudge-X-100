import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class a010 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeFactorization pf = new PrimeFactorization(num);
        List<Integer> result = pf.Execute_And_Get();
        List<String> resultString = new ArrayList<String>();
        int now = 0, index = -1, count = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) != now) {
                now = result.get(i);
                resultString.add(now + "");
                index++;
                count = 1;
            } else {
                resultString.set(index, now + " ^ " + ++count);
            }
        }

        System.out.printf("%s", resultString.get(0));
        for (int i = 1; i < resultString.size(); i++) {
            System.out.printf(" * " + resultString.get(i));
        }
        sc.close();
    }
}