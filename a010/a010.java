import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class a010 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeFactorization pf = new PrimeFactorization(num);
        List<Integer> result = pf.Execute_And_Get();
        List<Integer> count = new ArrayList<Integer>();
        int now = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) != now) {
                now = result.get(i);
                count.add(now);
            }
        }

        System.out.printf("%d", result.get(0));
        for (int i = 1; i < result.size(); i++) {
            System.out.printf("*" + result.get(i));
        }
        sc.close();
    }
}