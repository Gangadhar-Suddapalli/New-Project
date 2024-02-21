package Strings;

public class StringToCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Gangadhar";
		String b=new String("Suddapalli");
		char[] d=a.toCharArray();
		
//		for(char c:d) {
//			System.out.println(c);
//		}
		StringToCharacterArray st=new StringToCharacterArray();
		st.reverse(d);
		for(char e:d) {
			System.out.println(e);
		}
//		System.out.println(d);

	}
	void reverse(char[] d) {
		int start=0;
		int end=d.length-1;
		while(start<end) {
			char temp=d[start];
			d[start]=d[end];
			d[end]=temp;
			start ++;
			end --;
		}
		
		
	}

}
