package TrickyQuestions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter a Number");
			int a=sc.nextInt();
			
			System.out.println(a);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter number greater than 0");
		}
		
		
	}

}
