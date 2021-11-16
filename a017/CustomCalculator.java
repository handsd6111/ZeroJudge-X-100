public class CustomCalculator {
    String[] Operator = { "*", "/", "%", "+", "-" };

    public CustomCalculator() {
        
    }

    public int 

    public int Calculation(int val1, int val2, String operator) {
        int result = 0;
        switch (operator) {
        case "+":
            result = val1 + val2;
            break;
        case "-":
            result = val1 - val2;
            break;
        case "*":
            result = val1 * val2;
            break;
        case "/":
            result = val1 / val2;
            break;
        case "%":
            result = val1 % val2;
            break;
        }
        return result;
    }
}