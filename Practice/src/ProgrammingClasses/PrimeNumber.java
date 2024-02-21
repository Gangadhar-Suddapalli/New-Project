package ProgrammingClasses;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three ribbons separated by space:");
        String a = sc.nextLine();

        // Add your logic or function calls here using the 'a' variable.
        String[] ribbons = a.split(" ");

        if (isValidWeave(ribbons[0], ribbons[1], ribbons[2])) {
            System.out.println("'" + ribbons[2] + "' is a perfect weave of '" + ribbons[0] + "' and '" + ribbons[1] + "'.");
        } else {
            System.out.println("'" + ribbons[2] + "' fails to weave '" + ribbons[0] + "' and '" + ribbons[1] + "' correctly.");
        }

        sc.close();  // Closing the scanner to avoid resource leaks
    }

    private static boolean isValidWeave(String ribbon1, String ribbon2, String wovenRibbon) {
        int index1 = 0;
        int index2 = 0;

        for (char c : wovenRibbon.toCharArray()) {
            if (index1 < ribbon1.length() && ribbon1.charAt(index1) == c) {
                index1++;
            } else if (index2 < ribbon2.length() && ribbon2.charAt(index2) == c) {
                index2++;
            } else {
                return false; // If the current character in the woven ribbon doesn't match with either ribbon1 or ribbon2
            }
        }

        // Check if all characters from ribbon1 and ribbon2 are used in the correct order
        return index1 == ribbon1.length() && index2 == ribbon2.length();
    }
}
 