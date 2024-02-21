package ProgrammingClasses;
class Demo6
{
	static int [] rotate(int []arr, int a)
	{
//		int start=0;
		int end=arr.length;
		for(int i=0;i<a;i++)
		{
			int temp=arr[i];
			arr[i]=arr[end];
			arr[end]=temp;
//			start++;
			end--;
			
		}
		return arr;
	}
}
public class RotateArrayKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		System.out.println(arr.length);
		int a=3;
		Demo6.rotate(arr, a);
		for(int b:arr)
		{
			System.out.println(b);
		}
	}

}
