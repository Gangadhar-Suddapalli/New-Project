package ExceptionHandling;
import java.util.*;
class Add
{
	public int add1(int a, int b)
	{
		return a+b;
	}
	public int add1(int a, int b, int c)
	{
		return a+b+c;
	}
	public int add1(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add();
		Scanner scanner = new Scanner(System.in);
		try
		{
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			System.out.println(add.add1(a, b));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		scanner.close();

	}

}
