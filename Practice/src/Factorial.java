import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		long result=1;
		long b=1;
		for (int i=1;i<=a;i++) {
			b=result *= i;
			
			System.out.println(b);
		}
		System.out.println(b);

	}

}
