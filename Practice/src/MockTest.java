import java.util.*;
class Account
{
	protected String accName;
	protected String accNo;
	protected String bankName;
	public Account(String accName, String accNo, String bankName)
	{
		this.accName = accName;
		this.accNo=accNo;
		this.bankName=bankName;
	}
	public String getaccName(String accName)
	{
		return accName;
	}
	public String getaccNo(String accNo)
	{
		return accNo;
	}
	public String getbankName(String bankName)
	{
		return bankName;
	}
	void display()
	{
		getaccName(accName);
		getaccNo(accNo);
		getbankName(bankName);
	}
}
class CurrentAccount extends Account
{
	private String tinNumber;
	public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
		super(accName, accNo, bankName);
		// TODO Auto-generated constructor stub
		this.tinNumber=tinNumber;
	}
	public String getTinNumber(String tinNumber)
	{
		return tinNumber;
	}
	void display()
	{
		super.display();
		getTinNumber(tinNumber);
	}
	
}
class SavingsAccount extends Account
{
	private String orgName;
	public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
		super(accName, accNo, bankName);
		// TODO Auto-generated constructor stub
		this.orgName=orgName;
	}
	public String getOrgName(String orgName)
	{
		return orgName;
	}
	void display()
	{
		super.display();
		getOrgName(orgName);
	}
	
}
public class MockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Savings Account");
		System.out.println("1.Current Account");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		if(a==1)
		{
			String accName=sc.nextLine();
			String accNo=sc.nextLine();
			String bankName=sc.nextLine();
			String orgName=sc.nextLine();
			SavingsAccount SA = new SavingsAccount(accName, accNo,bankName,orgName);
			System.out.println("Account Name"+SA.accName);
			System.out.println("Account Number"+SA.accNo);
			System.out.println("Bank Name"+SA.bankName);
			System.out.println("Organization Name"+SA.getOrgName(orgName));//1 mistake
		}
		else if(a==2)
		{
			String accName=sc.nextLine();
			String accNo=sc.nextLine();
			String bankName=sc.nextLine();
			String tinNumber=sc.nextLine();
			CurrentAccount CA = new CurrentAccount(accName, accNo,bankName,tinNumber);
			System.out.println("Account Name"+CA.accName);
			System.out.println("Account Number"+CA.accNo);
			System.out.println("Bank Name"+CA.bankName);
			System.out.println("Organization Name"+CA.getTinNumber(tinNumber));//2 mistake
		}

	}

}
