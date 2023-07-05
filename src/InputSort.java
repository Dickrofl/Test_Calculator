public class InputSort {
    public static String[] inputSort(String input) {
        String[] inputMas = input.split(" ");
        if (inputMas.length == 3) {
        } else if (inputMas.length < 3) {
            throw new IllegalArgumentException("//т.к. строка не является математической операцией");
        } else {
            throw new IllegalArgumentException("//т.к. формат математической операции " +
                    "не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        return inputMas;
    }
}
