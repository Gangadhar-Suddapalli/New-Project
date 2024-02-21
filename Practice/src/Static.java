class stat
{
	static int a,b;
	int x,y;
	static
	{
		System.out.println("It is static block.");
		a=100;
		b=200;
	}
	static void fun()
	{
		System.out.println("It is static method.");
	}
	
	{
		System.out.println("It is instance block.");
	}
	public stat() 
	{
		System.out.println("It is constructor.");
	}
	void fun1()
	{
		System.out.println("It is instance method.");
		x=10;
		y=20;
	}
}
public class Static 
{
	static int z=20;
	static
	{
		System.out.println("It is static block in main class.");
		//System.out.println(z);
	}
	public static void main(String[] args)
	{
		stat.fun();
		stat a=new stat();
		a.fun1();
	}
}
