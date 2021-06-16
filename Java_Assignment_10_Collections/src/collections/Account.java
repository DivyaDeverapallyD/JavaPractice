/**
 * 
 */
package collections;

import java.util.*;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Account {
	long id;
	String accountType;
	
	
public Account(long id, String accountType)
	{
		this.id=id;
		this.accountType=accountType;
		
	}
	public static List<Account> createAccounts(int numAccounts){
		List<Account> accounts = new ArrayList<>();
		for(int i =0 ; i < numAccounts; i++)
		{
			
			accounts.add(new Account(i,"checkign"));
		}
		return accounts;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + "]";
	}
	
	
	

}
