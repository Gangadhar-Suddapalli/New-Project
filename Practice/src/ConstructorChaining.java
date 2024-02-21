class Fourth
{
	
	private int id;
	public Fourth(){
		id=20;
	}
	public Fourth(int id) {
		this();
	}
	public int getid()
	{
		return id;
	}
	{
		System.out.println("Instance Block");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fourth f=new Fourth(40);
		System.out.println(f.getid());
	}

}
