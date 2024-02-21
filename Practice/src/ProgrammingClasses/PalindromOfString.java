package ProgrammingClasses;
import java.util.*;
class Demo5
{
	boolean Palindrome(String a)
	{
		a = a.toLowerCase();
		int start = 0;
		int end = a.length()-1;
		while (start < end)
		{
			if(a.charAt(start) != a.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
public class PalindromOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a = scan.nextLine();
		Demo5 d = new Demo5();
		if(d.Palindrome(a))
		{
			System.out.println(a+" is a palindrome");
		}
		else
		{
			System.out.println(a+" is not a palindrome");
		}
		
	}

}
