import java.util.ArrayList;
import java.util.List;


public class PrimeFactorization {
    PrimeNumberManagment pm;
    private int originNumber;
    private List<Integer> resultList = new ArrayList<Integer>();
    public PrimeFactorization(int num) {
        originNumber = num;
        pm = new PrimeNumberManagment();
    }

    public void Execute() {
        while(originNumber > 0) {
            if(originNumber / pm.Get_Now_Prime_Number()) {
                
            }
        }
    }
}