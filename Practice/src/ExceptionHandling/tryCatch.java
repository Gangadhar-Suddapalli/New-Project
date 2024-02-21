package ExceptionHandling;
import java.util.*;
class Demo
{
	public void fun()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Numerator");
		int a = scanner.nextInt();
		System.out.println("Enter Denominator");
		int b = scanner.nextInt();
		int c = a/b;
		System.out.println(c);
	}
}
public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Demo demo = new Demo();
			demo.fun();
		}
		catch (ArithmeticException e)
		{
			System.out.println("Denominator will be greater than zero");
		}
		catch (InputMismatchException e)
		{
			System.out.println("Only Integer Values are allowed");
		}
		
		

	}

}
