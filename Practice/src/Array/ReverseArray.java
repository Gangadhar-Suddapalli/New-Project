package Array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={1,2,3,4,5};
		ReverseArray a=new ReverseArray();
		a.reverse(arr);
		for(int ar:arr) {
			System.out.println(ar);
		}
		
		
		

	}
	public int[] reverse(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		return arr;
	}

}
