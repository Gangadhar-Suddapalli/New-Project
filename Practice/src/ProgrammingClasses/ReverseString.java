package ProgrammingClasses;
import java.util.*;
class Demo1
{
	String reverse(String a)
	{
		String b = "";
		char[] c = a.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			b=b+c[i];
		}
		return b;
	}
}
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String a = sc.nextLine();
		Demo1 d = new Demo1();
		String c = d.reverse(a);
		System.out.println(a.equals(c));
		System.out.println("Reverse of "+a+" is "+c);
		
	}

}
