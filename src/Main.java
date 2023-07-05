import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Введите выражение!");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            System.out.println(CalculOperation.calculOperation(InputSort.inputSort(input)));
        }
    }
}