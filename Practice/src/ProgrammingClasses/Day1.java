package ProgrammingClasses;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		if(num>0) {
		if((num%2==0) && (num%5==0))
		System.out.println("YES");
		else
			System.out.println("No");
		}
		else
			System.out.println("enter a number grt then zero");
		
		
	}
	
}
