package account;

public class bankACCOUNT {
	
	public bankACCOUNT(double inBalance, double inInterest)
	{
		balance = inBalance;
		rate = inInterest;
	}
		
	public void setDeposit(int deposit)
	{
		this.deposit = deposit;
	}
	
	public void addBalance()
	{
		this.balance = ((deposit + balance) + ((deposit + balance) * rate / 100));
	}
	
	public double getBalance()
	{
		return balance;
	}
		
	public void setInterest(double rate)
	{
		this.rate = rate;
	}
	
	private double balance;
	private double deposit;
	private double rate;
	

}
