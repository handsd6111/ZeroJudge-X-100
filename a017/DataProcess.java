import java.util.ArrayList;
import java.util.List;

public class DataProcess {
    String[] data;
    int answer = 0;
    List<Integer> bracketsList;

    public DataProcess(String[] data) {
        this.data = data;
        bracketsList = new ArrayList<Integer>();
    }

    public int Execute() {
        return 0;
    }

    public void Scan_Brackets() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == "(") {
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] == ")") {
                        bracketsList.add(i);
                        bracketsList.add(j);
                        i = j;
                        break;
                    }
                }
            }
        }
    }

}
