class First
{
	//Reversing the Array
	void reverseArray(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}
	
	//Finding Sum of the Array
	int sumOfArray(int[] arr )
	{
		int sum=0;
		for(int i=0;i<arr.length-1;i++)
		{
			
			sum=sum+arr[i];
		}
		
		return sum;
	}
	int secondNumberFromLasr(int[] arr) {
		
		return arr[arr.length-2];
	}
	
}
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
