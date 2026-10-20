
import java.util.Scanner;

public class pr10 {

    public static void reverse(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        reverse(numbers);

        System.out.println("Numbers in reverse order:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
