package accountdetails;



public class Account {
	private String accountName;
	private int accountId;
	private int balance;
	private String location;
	public Account(String accountName, int accountId, int balance, String location) {
		super();
		this.accountName = accountName;
		this.accountId = accountId;
		this.balance = balance;
		this.location = location;
	}
	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}
	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	/**
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return  accountId+balance *3+3;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account)
		{
			Account acc = (Account) obj;
			
			boolean b1 = this.accountName.equals(acc.accountName);
			 boolean b2 = this.accountId == acc.accountId;
			boolean b3 = this.balance == acc.balance;
			
			return b1&&b2&&b3;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "AccountID: "+this.accountId+" Account Name: "+this.accountName+" Bank Balance: "+this.balance+" Location: "+this.location;
	}
	
	

}
