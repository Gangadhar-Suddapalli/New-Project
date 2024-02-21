package Abstraction;
import java.util.*;

abstract class Demo{
	private String s;
	abstract public void prin();
	abstract public void say();
	public Demo(String s){
		this.s=s;
	}
	public String getString() {
		return s;
	}
	
}
class Demo1 extends Demo{
	
	public Demo1(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void prin() {
		System.out.println("Hello");
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	
}
class Demo2 extends Demo{
	public Demo2(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void say()
	{
		System.out.println("Bye");
	}

	@Override
	public void prin() {
		// TODO Auto-generated method stub
		
	}
}
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dggd");
		//Scanner scanner = new Scanner(System.in);
		//int a = scanner.nextInt();
		Demo1 demo1 = new Demo1("Gangadhar");
		System.out.println(demo1.getString());
		demo1.prin();
		Demo2 demo2 = new Demo2("angadhar");
		System.out.println(demo2.getString());
		demo2.say();
	}

}
