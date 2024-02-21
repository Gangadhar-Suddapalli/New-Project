class rev
{
	String reverseString(StringBuffer str)
	{
		return str.reverse().toString();
	}
}
public class Strings {
	public static void main(String[] args)
	{
		StringBuffer a=new StringBuffer();
		System.out.println(a.capacity());
		a.append("JAVA");
		a.reverse();
		System.out.println(a);
		a.append("JAVASCRIPT");
		System.out.println(a);
		a.append("SUDDAPALLI GANGADHAR ");
		System.out.println(a);
		System.out.println(a.capacity());
		a.append("SUDDAPALLI GANGADHAR ");
		
		System.out.println(a.length()	);
		
		System.out.println(a.capacity());
		rev r=new rev();
		StringBuffer b=new StringBuffer("Gangadhar");
		System.out.println(r.reverseString(b));

	}

}
