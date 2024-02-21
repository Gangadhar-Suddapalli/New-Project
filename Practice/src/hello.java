class third{
	third(){
		
	}
	float add(float a, int b) {
		float c=a+b;
		return c;
	}
	float add(int a,float b) {
		float d=a+b;
		return d;
	}
}
class hello {
	public static void main(String[] args) {
		
		third h=new third();
		
		System.out.println(h.add(10.20f,20));
		int a[]= {1,2,3};
		System.out.println(a[1]);
		StringBuffer b=new StringBuffer();
		
		System.out.println(b.capacity());
	}

}