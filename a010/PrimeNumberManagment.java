import java.util.ArrayList;
import java.util.List;

public class PrimeNumberManagment {
    private List<Integer> primeNumberList;

    public PrimeNumberManagment() {
        primeNumberList = new ArrayList<Integer>();
    }

    public List<Integer> Find_All_Prime_Number(int end) {
        if (end < Get_Now_Prime_Number()) {
            List<Integer> tmpList = new ArrayList<>();
            for (int i = 0; i < primeNumberList.size(); i++) {
                int tmp = primeNumberList.get(i);
                if (tmp < end)
                    tmpList.add(tmp);
                else 
                    return tmpList;
            }
        }
        while (true) {
            int next = Find_Next_Prime_Number(Get_Now_Prime_Number(), end);
            if(next > end) {
                break;
            }
            primeNumberList.add(next);
        }
        return Get_Prime_Number_List();
    }

    public List<Integer> Get_Prime_Number_List() {
        return primeNumberList;
    }

    public int Get_Now_Prime_Number() {
        return primeNumberList.get(primeNumberList.size() - 1);
    }

    public int Find_Next_Prime_Number(int now, int end) {
        for (int i = now + 1; i <= end; i++) {
            boolean isNext = true;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    isNext = false;
                    break;
                }
            }
            if (isNext == true) {
                return i;
            }
        }
        return now;
    }
}