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

    public List<Integer> Execute_And_Get() {
        int nowPrimeNumber = 2;
        int tmpNumber = originNumber;
        while (tmpNumber > 1) {
            if (tmpNumber % nowPrimeNumber == 0) {
                tmpNumber /= nowPrimeNumber;
                resultList.add(nowPrimeNumber);
            } else {
                nowPrimeNumber = pm.Find_Next_Prime_Number(nowPrimeNumber, originNumber);
            }
        }
        return Get_Result_Array();
    }

    public List<Integer> Get_Result_Array() {
        return resultList;
    }
}