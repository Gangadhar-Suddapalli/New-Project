package Array;
import java.util.Scanner;

public class PairWithSmallerValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < arr.length; i++) {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]<arr[j])
        		{
        			System.out.println(arr[i] + " "+arr[j]);
        		}
        		
        		
        	}
            
        }
    }
}
