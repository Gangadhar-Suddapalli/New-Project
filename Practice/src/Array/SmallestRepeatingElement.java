package Array;
import java.util.Scanner;

public class SmallestRepeatingElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int smallestRepeatingElement = -1;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    smallestRepeatingElement = arr[i];
                    break;
                }
            }
            if (smallestRepeatingElement != -1) {
                break;
            }
        }

        if (smallestRepeatingElement != -1) {
            System.out.println("The smallest repeating element is: " + smallestRepeatingElement);
        } else {
            System.out.println("No repeating elements found.");
        }
    }
}
