package ProgrammingClasses;
import java.util.*;
class Demo3
{
	int [] reverseArray(int [] arr) 
	{
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
		return arr;
	}
}
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int j=0;j<a;j++) {
			int b=sc.nextInt();
			arr[j] = b;
		}
		Demo3 d = new Demo3();
		d.reverseArray(arr);
		for(int c:arr){
			System.out.println(c);
		}
		
	}

}
