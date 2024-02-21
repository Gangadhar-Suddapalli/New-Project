class Second{
	private int ID;
	private String Name;
	public Second() {
		
	}
	public void setData(int ID, String Name)
	{
		this.ID = ID;
		this.Name = Name;
		
	}
	public int getData()
	{
		return ID;
	}
	public String getData1()
	{
		return Name;
	}
}
class reverseArray
{
	void reversearray(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}
}
class first1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		Second sc = new Second();
		sc.setData(1, "Gangadhar");
		System.out.println(sc.getData());
		System.out.println(sc.getData1());
		int [] arr = new int [] {1, 2, 3, 4, 5};  
		reverseArray r=new reverseArray();
		r.reversearray(arr);
	}

}
