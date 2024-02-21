package inheritance;
//import java.util.*;
public class SingleInheritance {
	int a=100;
	int b;
	public static void main(String [] args) {
		
		single.disp();
		String a="Gangadhar";
		int b=a.length();
		System.out.println(b);
	}
}
class single{
	static int a=111;
	static int b=222;
	static void disp() {
		System.out.println(a);
		System.out.println(b);
	}
	
}