public class CalculOperation {
    public static int calculOperation(String[] inputMas) {
        String firstNumber = inputMas[0];
        String operator = inputMas[1];
        String secondNumber = inputMas[2];
        if (Integer.parseInt(firstNumber) > 10 || Integer.parseInt(secondNumber) > 10 ||
                Integer.parseInt(firstNumber) < 1 || Integer.parseInt(secondNumber) < 1) {
            throw new IllegalArgumentException("//т.к. используйте числа от 1 до 10 ");
        }
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
