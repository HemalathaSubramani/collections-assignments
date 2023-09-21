package accountdetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class AccountStreamAPI {
	static List<Account> allAccounts;
	public static void main(String[] args) {

		Account a1 = new Account("hema",123,1300,"chennai");
		Account a2 = new Account("jaya",345,1200,"bangalore");
		Account a3 = new Account("mala",444,6500,"mumbai");
		Account a4 = new Account("bala",555,4500,"bangalore");
		
		allAccounts = Arrays.asList(a1,a2,a3,a4);
		callForEach();
		callFilter();
		
		
	    List<Account> list = callFilterWithCollectOperation();
		list.stream().forEach(e->System.out.println(e));
		
		Account a = getAccountOfMinBalance();
		System.out.println(a);
		
		Account o = getAccountOfMaxBalance();
		System.out.println(o);
		
		List<Account> accounts= makeSomeChanges();
		System.out.println(accounts);
		
		sortLocation();
		callFilterByLocationWithMinimumBalance();
		callFilterByLocationWithMaximumBalance();
		
		
		}
	public static List<Account> callFilterWithCollectOperation()
	{
		System.out.println("---Filter With Collector----");
		List<Account> outputList = allAccounts.stream().filter((emp)->{
			if(emp.getBalance()>1500) return true;
			else return false;
		}).collect(Collectors.toList());
		
		return outputList;
	}
	public static Account getAccountOfMinBalance()
	{
		System.out.println("-----Minimum Balance----");
		Comparator<Account> com = (a1,a2)->{
			return a1.getBalance() - a2.getBalance();
		};
		
		Account a = 
				allAccounts.stream().min(com).get();
		return a ;
		
	}
	public static Account getAccountOfMaxBalance()
	{
		System.out.println("-----MaximumBalance----");
		Comparator<Account> com = (o1,o2)->{
			return o1.getBalance() - o2.getBalance();
		};
		
		Account o = 
				allAccounts.stream().max(com).get();
		return o ;
	}
	
	public static List<Account> makeSomeChanges()
	{
		System.out.println("----Mapping-----");
		List<Account> outputList = 
			allAccounts.stream().
			filter((acc)->{
			if(acc.getBalance()>1500) return true;
			else return false;
		    }).
			map(acc->{
				int oldBalance = acc.getBalance();
				int newBalance = oldBalance+1000;
				acc.setBalance(newBalance);
				return acc;
			}).collect(Collectors.toList());
		
		return outputList;
	
	}
	public static void callFilter()
	{
		System.out.println("---Filter----");
		allAccounts.stream().filter((acc)->{
			if(acc.getBalance()>1500) return true;
			else return false;
		}).forEach((acc)->{
			System.out.println(acc);
		});
		
		
	}
	
	public static void callForEach()
	{
		System.out.println("----AccountNames---");
		allAccounts.stream().forEach((e)->{
			System.out.println(e.getAccountName()+ e.getAccountId()+ e.getBalance());
		});
		
	}
	public static void sortLocation() {
		System.out.println("-----Sorted List of Accounts by Location-----");
		List<Account>sortedList = allAccounts.stream().sorted((acc1,acc2)->{return acc1.getLocation().compareTo(acc2.getLocation());}).collect(Collectors.toList());
		for(Account a : sortedList) {
			System.out.println(a);
		}
	}
	public static void callFilterByLocationWithMinimumBalance() {
		System.out.println("Account with min balance in Bangalore is: ");
		Account minBalAccount = allAccounts.stream().filter((acc)->{return acc.getLocation().equals("bangalore");}).min((acc1,acc2)->{return acc1.getBalance()-acc2.getBalance();}).get();
        System.out.println(minBalAccount);
	}
	public static void callFilterByLocationWithMaximumBalance() {
		System.out.println("Account with max balance in Bangalore is: ");
		Account maxBalAccount = allAccounts.stream().filter((acc)->{return acc.getLocation().equals("bangalore");}).min((acc1,acc2)->{return acc2.getBalance()-acc1.getBalance();}).get();
        System.out.println(maxBalAccount);
	
	
	}
	
}
