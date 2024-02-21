package Strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Gangadhar";
//		String b=new String("Suddapalli");
		char[] d=a.toCharArray();
		
//		for(char c:d) {
//			System.out.println(c);
//		}
		StringToCharacterArray st=new StringToCharacterArray();
		reverse(d);
//		for(char e:d) {
//			System.out.println(e);
//		}
		
//		System.out.println(d);

	}
	public static void reverse(char[] d) {
		String a="";
//		int end=d.length-1;
//		while(start<end) {
//			char temp=d[start];
//			d[start]=d[end];
//			d[end]=temp;
//			start ++;
//			end --;
//		}
		for(int i=d.length-1;i>=0;i--) {
			a+=d[i];
			//System.out.println(d[i]);
		}
		System.out.print(a);
//		return a;
	}

}
