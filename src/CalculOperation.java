public class CalculOperation {
    public static int calculOperation(String[] inputMas) {
        String firstNumber = inputMas[0];
        String operator = inputMas[1];
        String secondNumber = inputMas[2];
        int result = 0;
        if (operator.equals("+")) {
            result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        } else if (operator.equals("-")) {
            result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
        } else if (operator.equals("/")) {
            result = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
        } else if (operator.equals("*")) {
            result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
        }
        return result;
    }
}
