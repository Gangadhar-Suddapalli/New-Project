class BankAccount
{
	private int account;
	private int pin;
	public void setData(int a, int p)
	{
		account=a;
		pin =p;
	}
	public int getAccount()
	{
		return account;
	}
	public int getPin()
	{
		return pin;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		b.setData(1234567890, 2799);
		System.out.println(b.getAccount());
		System.out.println(b.getPin());
	}

}
