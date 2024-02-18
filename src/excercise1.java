import java.util.Scanner;
public class excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (input negative number to exit):");
        int[] numbers = new int[100];
        int size = 0;
        while (true) {
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            if (size < 100) {
                numbers[size] = num;
                size++;
            }
        }
        System.out.println("Show numbers from input : ");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
