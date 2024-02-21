package ProgrammingClasses;
import java.util.*;
class Demo
{
	int factorial(int a)
	{
		int temp = 1;
		for(int i=1;i<=a;i++)
		{
			temp=temp*i;
		}
		return temp;
	}
	int factorialUsingRecusion(int a)
	{
		if(a==0)
		{
			return 1;
		}
		return a*factorialUsingRecusion(a-1);
	}
}
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get the factorial");
		int a = sc.nextInt();
		Demo d = new Demo();
		int c = d.factorialUsingRecusion(a);
		System.out.println("Factorial of "+a+" is "+c);
	}

}
